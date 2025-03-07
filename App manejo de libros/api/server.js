/**
 * Servidor Express para gestionar usuarios, libros y categorías en una base de datos PostgreSQL.
 * @module app
 */

const express = require('express');
const cors = require('cors');
const { Pool } = require('pg');

const app = express();
app.use(cors());
app.use(express.json());

/**
 * Configuración de la base de datos PostgreSQL.
 */
const pool = new Pool({
  user: 'postgres',
  host: 'localhost',
  database: 'venta_libros',
  password: 'root',
  port: 5432,
});

/**
 * Usuario administrador predefinido para pruebas.
 * @constant
 */
const adminUser = {
  correo: 'admin@admin.com',
  contrasena: 'admin',
};

/**
 * Registra un nuevo usuario en la base de datos.
 * @name post/register
 * @function
 * @memberof module:app
 * @param {string} req.body.nombre - Nombre del usuario.
 * @param {string} req.body.correo - Correo electrónico del usuario.
 * @param {string} req.body.contrasena - Contraseña del usuario.
 */
app.post('/register', async (req, res) => {
  const { nombre, correo, contrasena } = req.body;
  try {
    const result = await pool.query(
      'INSERT INTO usuarios (nombre, correo, contrasena) VALUES ($1, $2, $3) RETURNING *',
      [nombre, correo, contrasena]
    );
    res.json({ message: 'Usuario registrado exitosamente', user: result.rows[0] });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: 'Error al registrar usuario' });
  }
});

/**
 * Autentica a un usuario. Retorna un objeto con los datos del usuario si el inicio de sesión es exitoso.
 * @name post/login
 * @function
 * @memberof module:app
 * @param {string} req.body.correo - Correo del usuario.
 * @param {string} req.body.contrasena - Contraseña del usuario.
 */
app.post('/login', async (req, res) => {
  const { correo, contrasena } = req.body;
  if (correo === adminUser.correo && contrasena === adminUser.contrasena) {
    return res.json({
      message: 'Inicio de sesión exitoso',
      user: { nombre: 'admin', correo, rol: 'admin' }
    });
  }

  try {
    const result = await pool.query(
      'SELECT nombre, correo FROM usuarios WHERE correo = $1 AND contrasena = $2',
      [correo, contrasena]
    );

    if (result.rows.length > 0) {
      res.json({
        message: 'Inicio de sesión exitoso',
        user: result.rows[0]
      });
    } else {
      res.status(401).json({ message: 'Credenciales incorrectas' });
    }
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: 'Error al iniciar sesión' });
  }
});

/**
 * Obtiene todas las categorías.
 * @name get/categorias
 * @function
 * @memberof module:app
 */
app.get('/categorias', async (req, res) => {
  const result = await pool.query('SELECT * FROM categorias');
  res.json(result.rows);
});

/**
 * Crea una nueva categoría.
 * @name post/categorias
 * @function
 * @memberof module:app
 * @param {string} req.body.nombre - Nombre de la categoría.
 */
app.post('/categorias', async (req, res) => {
  const { nombre } = req.body;
  const result = await pool.query(
    'INSERT INTO categorias (nombre) VALUES ($1) RETURNING *',
    [nombre]
  );
  res.json(result.rows[0]);
});

/**
 * Actualiza el nombre de una categoría por su ID.
 * @name put/categorias/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID de la categoría.
 * @param {string} req.body.nombre - Nuevo nombre de la categoría.
 */
app.put('/categorias/:id', async (req, res) => {
  const { id } = req.params;
  const { nombre } = req.body;
  const result = await pool.query(
    'UPDATE categorias SET nombre = $1 WHERE id = $2 RETURNING *',
    [nombre, id]
  );
  res.json(result.rows[0]);
});

/**
 * Elimina una categoría por su ID.
 * @name delete/categorias/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID de la categoría.
 */
app.delete('/categorias/:id', async (req, res) => {
  const { id } = req.params;
  await pool.query('DELETE FROM categorias WHERE id = $1', [id]);
  res.json({ message: 'Categoría eliminada' });
});

/**
 * Obtiene todos los libros y sus categorías asociadas.
 * @name get/libros
 * @function
 * @memberof module:app
 */
app.get('/libros', async (req, res) => {
  try {
    const query = `
      SELECT libros.id, libros.titulo, categorias.nombre AS categoria, libros.precio, libros.stock
      FROM libros
      LEFT JOIN categorias ON libros.categoria_id = categorias.id
    `;
    const result = await pool.query(query);
    res.json(result.rows);
  } catch (error) {
    console.error('Error al obtener libros:', error);
    res.status(500).json({ message: 'Error al obtener libros' });
  }
});

/**
 * Crea un nuevo libro.
 * @name post/libros
 * @function
 * @memberof module:app
 * @param {string} req.body.titulo - Título del libro.
 * @param {number} req.body.categoria_id - ID de la categoría del libro.
 * @param {number} req.body.precio - Precio del libro.
 * @param {number} req.body.stock - Stock disponible del libro.
 */
app.post('/libros', async (req, res) => {
  const { titulo, categoria_id, precio, stock } = req.body;
  const result = await pool.query(
    'INSERT INTO libros (titulo, categoria_id, precio, stock) VALUES ($1, $2, $3, $4) RETURNING *',
    [titulo, categoria_id, precio, stock]
  );
  res.json(result.rows[0]);
});

/**
 * Actualiza los datos de un libro por su ID.
 * @name put/libros/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID del libro.
 * @param {string} req.body.titulo - Título del libro.
 * @param {number} req.body.categoria_id - ID de la categoría del libro.
 * @param {number} req.body.precio - Precio del libro.
 * @param {number} req.body.stock - Stock disponible del libro.
 */
app.put('/libros/:id', async (req, res) => {
  const { id } = req.params;
  const { titulo, categoria_id, precio, stock } = req.body;
  const result = await pool.query(
    'UPDATE libros SET titulo = $1, categoria_id = $2, precio = $3, stock = $4 WHERE id = $5 RETURNING *',
    [titulo, categoria_id, precio, stock, id]
  );
  res.json(result.rows[0]);
});

/**
 * Elimina un libro por su ID.
 * @name delete/libros/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID del libro.
 */
app.delete('/libros/:id', async (req, res) => {
  const { id } = req.params;
  await pool.query('DELETE FROM libros WHERE id = $1', [id]);
  res.json({ message: 'Libro eliminado' });
});

/**
 * Obtiene todos los usuarios.
 * @name get/usuarios
 * @function
 * @memberof module:app
 */
app.get('/usuarios', async (req, res) => {
  const result = await pool.query('SELECT * FROM usuarios');
  res.json(result.rows);
});

/**
 * Crea un nuevo usuario.
 * @name post/usuarios
 * @function
 * @memberof module:app
 * @param {string} req.body.nombre - Nombre del usuario.
 * @param {string} req.body.correo - Correo electrónico del usuario.
 * @param {string} req.body.contrasena - Contraseña del usuario.
 */
app.post('/usuarios', async (req, res) => {
  const { nombre, correo, contrasena } = req.body;
  const result = await pool.query(
    'INSERT INTO usuarios (nombre, correo, contrasena) VALUES ($1, $2, $3) RETURNING *',
    [nombre, correo, contrasena]
  );
  res.json(result.rows[0]);
});

/**
 * Actualiza los datos de un usuario por su ID.
 * @name put/usuarios/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID del usuario.
 * @param {string} req.body.nombre - Nombre del usuario.
 * @param {string} req.body.correo - Correo electrónico del usuario.
 * @param {string} req.body.contrasena - Contraseña del usuario.
 */
app.put('/usuarios/:id', async (req, res) => {
  const { id } = req.params;
  const { nombre, correo, contrasena } = req.body;
  const result = await pool.query(
    'UPDATE usuarios SET nombre = $1, correo = $2, contrasena = $3 WHERE id = $4 RETURNING *',
    [nombre, correo, contrasena, id]
  );
  res.json(result.rows[0]);
});

/**
 * Elimina un usuario por su ID.
 * @name delete/usuarios/:id
 * @function
 * @memberof module:app
 * @param {number} req.params.id - ID del usuario.
 */
app.delete('/usuarios/:id', async (req, res) => {
  const { id } = req.params;
  await pool.query('DELETE FROM usuarios WHERE id = $1', [id]);
  res.json({ message: 'Usuario eliminado' });
});

/**
 * Inicia el servidor en el puerto especificado.
 */
const PORT = process.env.PORT || 3002;
app.listen(PORT, () => {
  console.log(`Servidor corriendo en el puerto ${PORT}`);
});
