import React, { useState } from 'react';
import { Form, Button } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';

/**
 * El componente AddCategoryPage renderiza un formulario para agregar una nueva categoría.
 * @component
 * @returns {JSX.Element} El componente AddCategoryPage renderizado.
 */
const AddCategoryPage = () => {
  const [categoryName, setCategoryName] = useState('');
  const navigate = useNavigate();

  /**
   * Maneja el envío del formulario para agregar una nueva categoría.
   * @async
   * @function
   * @param {Event} event - El evento de envío del formulario.
   */
  const handleSubmit = async (event) => {
    event.preventDefault();
    const newCategory = { nombre: categoryName };
    const response = await fetch('http://localhost:3002/categorias', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(newCategory)
    });
    if (response.ok) {
      navigate('/categories'); // Redirección a la lista de categorías
    }
  };

  return (
    <div className="container mt-5 Lexend-Deca">
      <h1 className="mb-4">Agregar Nueva Categoría</h1>
      <Form className='mx-5' onSubmit={handleSubmit}>
        <Form.Group controlId="categoryName" className="mb-3">
          <Form.Control
            type="text"
            placeholder="Ingrese el nombre de la categoría"
            value={categoryName}
            onChange={(e) => setCategoryName(e.target.value)}
            style={{
              borderColor: 'rgba(97, 62, 104, 0.3)',
              borderRadius: '30px',
            }}
          />
        </Form.Group>
        <Button
          variant="primary"
          type="submit"
          className="w-100"
          style={{
            backgroundColor: '#613E68',
            borderRadius: '30px',
            border: 'none',
          }}
        >
          Guardar Categoría
        </Button>
      </Form>
    </div>
  );
};

export default AddCategoryPage;
