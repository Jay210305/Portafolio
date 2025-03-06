import React, { useState, useEffect } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import { Form, Button, Dropdown, Row, Col } from 'react-bootstrap';

/**
 * El componente EditBookPage permite editar los detalles de un libro existente.
 * @component
 * @returns {JSX.Element} El componente EditBookPage renderizado.
 */
const EditBookPage = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [title, setTitle] = useState('');
  const [price, setPrice] = useState('');
  const [stock, setStock] = useState('');
  const [category, setCategory] = useState('');
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    fetchBook();
    fetchCategories();
  }, [id]);

  /**
   * Obtiene los detalles del libro desde el servidor y actualiza el estado con la información del libro.
   * @async
   * @function
   */
  const fetchBook = async () => {
    const response = await fetch(`http://localhost:3002/libros/${id}`);
    const data = await response.json();
    setTitle(data.titulo);
    setPrice(data.precio);
    setStock(data.stock);
    setCategory(data.categoria_id);
  };

  /**
   * Obtiene la lista de categorías del servidor y actualiza el estado de categorías.
   * @async
   * @function
   */
  const fetchCategories = async () => {
    const response = await fetch('http://localhost:3002/categorias');
    const data = await response.json();
    setCategories(data);
  };

  /**
   * Maneja el envío del formulario para guardar los cambios realizados en el libro.
   * @async
   * @function
   * @param {Event} event - El evento de envío del formulario.
   */
  const handleSubmit = async (event) => {
    event.preventDefault();
    const updatedBook = { titulo: title, precio: price, stock: stock, categoria_id: category };
    const response = await fetch(`http://localhost:3002/libros/${id}`, {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(updatedBook)
    });
    if (response.ok) {
      navigate('/books'); // Redirige a la página de libros después de editar con éxito
    }
  };

  return (
    <div className="container mt-5">
      <h1 className="mb-4">Editar Libro</h1>
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
                {category ? categories.find(c => c.id === parseInt(category)).nombre : 'Seleccione una Categoría'}
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
          Guardar Cambios
        </Button>
      </Form>
    </div>
  );
};

export default EditBookPage;
