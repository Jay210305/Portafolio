import React, { useState, useEffect } from 'react';
import { Form, Button, Dropdown, Row, Col } from 'react-bootstrap';

/**
 * El componente AddBookPage renderiza un formulario para agregar un nuevo libro.
 * @component
 * @returns {JSX.Element} El componente AddBookPage renderizado.
 */
const AddBookPage = () => {
  const [title, setTitle] = useState('');
  const [price, setPrice] = useState('');
  const [stock, setStock] = useState('');
  const [category, setCategory] = useState('');
  const [categories, setCategories] = useState([]);

  /**
   * Obtiene las categorías del servidor y actualiza el estado de categorías.
   * Llamado una vez al montar el componente.
   * @async
   */
  useEffect(() => {
    fetchCategories();
  }, []);

  /**
   * Obtiene las categorías de la API y las establece en el estado.
   * @async
   * @function
   * @returns {Promise<void>}
   */
  const fetchCategories = async () => {
    try {
      const response = await fetch('http://localhost:3002/categorias');
      const data = await response.json();
      setCategories(data);
    } catch (error) {
      console.error('Error al obtener las categorías:', error);
    }
  };

  /**
   * Maneja el envío del formulario para agregar un nuevo libro.
   * @async
   * @function
   * @param {Event} event - El evento de envío del formulario.
   */
  const handleSubmit = async (event) => {
    event.preventDefault();
    const newBook = { titulo: title, precio: price, stock: stock, categoria_id: category };
    const response = await fetch('http://localhost:3002/libros', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(newBook)
    });
    if (response.ok) {
      alert('Libro agregado exitosamente');
      // Opcionalmente, redirigir o limpiar el formulario aquí
    }
  };

  return (
    <div className="container mt-5">
      <h1 className="mb-4">Agregar Nuevo Libro</h1>
      <Form className='mx-5' onSubmit={handleSubmit}>
        <Form.Group controlId="bookName" className="mb-3">
          <Form.Control
            type="text"
            placeholder="Ingrese el nombre del libro"
            style={{
              borderColor: 'rgba(97, 62, 104, 0.3)',
              borderRadius: '30px',
            }}
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
        </Form.Group>

        <Row className="mb-3">
          <Col>
            <Form.Group controlId="price">
              <Form.Control
                type="number"
                placeholder="Ingrese el precio"
                style={{
                  borderColor: 'rgba(97, 62, 104, 0.3)',
                  borderRadius: '30px',
                }}
                value={price}
                onChange={(e) => setPrice(e.target.value)}
              />
            </Form.Group>
          </Col>
          <Col>
            <Form.Group controlId="stock">
              <Form.Control
                type="number"
                placeholder="Ingrese el stock"
                style={{
                  borderColor: 'rgba(97, 62, 104, 0.3)',
                  borderRadius: '30px',
                }}
                value={stock}
                onChange={(e) => setStock(e.target.value)}
              />
            </Form.Group>
          </Col>
          <Col>
            <Dropdown onSelect={(eventKey) => setCategory(eventKey)}>
              <Dropdown.Toggle
                style={{
                  width: '100%',
                  backgroundColor: 'transparent',
                  borderColor: 'rgba(97, 62, 104, 0.3)',
                  borderRadius: '30px',
                  color: '#613E68',
                }}
                id="dropdown-basic"
              >
                {category ? categories.find(c => c.id === parseInt(category)).nombre : 'Seleccione una categoría'}
              </Dropdown.Toggle>

              <Dropdown.Menu>
                {categories.map((cat) => (
                  <Dropdown.Item key={cat.id} eventKey={cat.id}>{cat.nombre}</Dropdown.Item>
                ))}
              </Dropdown.Menu>
            </Dropdown>
          </Col>
        </Row>        
        <Button type="submit" className="w-100" style={{ backgroundColor: '#613E68', borderRadius: '30px', border: 'none' }}>
          Guardar Libro
        </Button>
      </Form>
    </div>
  );
};

export default AddBookPage;
