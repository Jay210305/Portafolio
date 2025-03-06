import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { Dropdown, Table, Button } from 'react-bootstrap';
import { FaEdit, FaTrash } from 'react-icons/fa';

/**
 * El componente BooksPage muestra una lista de libros con opciones para agregar, editar y eliminar libros.
 * @component
 * @returns {JSX.Element} El componente BooksPage renderizado.
 */
const BooksPage = () => {
  const [books, setBooks] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    fetchBooks();
  }, []);

  /**
   * Obtiene la lista de libros del servidor y actualiza el estado de libros.
   * @async
   * @function
   */
  const fetchBooks = async () => {
    const response = await fetch('http://localhost:3002/libros');
    const data = await response.json();
    setBooks(data);
  };

  /**
   * Elimina un libro por su ID y actualiza la lista de libros.
   * @async
   * @function
   * @param {number} id - El ID del libro a eliminar.
   */
  const deleteBook = async (id) => {
    const response = await fetch(`http://localhost:3002/libros/${id}`, {
      method: 'DELETE'
    });
    if (response.ok) {
      fetchBooks(); // Recarga los libros después de eliminar
    }
  };

  return (
    <div className="container mt-5">
      <h1 className='Lexend-Deca'>Libros</h1>
      <Button onClick={() => navigate('/add-book')} style={{ marginBottom: '10px' }}>
        Agregar Libro
      </Button>
      <Table borderless className="align-middle mx-4">
        <tbody>
          {books.map((book) => (
            <tr key={book.id}>
              <td>
                <div className='Lexend-Deca' style={{ color: '#613E68', fontWeight: 'bold' }}>{book.titulo}</div>
                <small className="text-muted Lexend-Deca">{book.categoria}</small>
              </td>
              <td className="text-end">
                <FaEdit style={{ color: '#613E68', cursor: 'pointer', marginRight: '10px' }} onClick={() => navigate(`/edit-book/${book.id}`)} />
                <FaTrash style={{ color: '#613E68', cursor: 'pointer' }} onClick={() => deleteBook(book.id)} />
              </td>
            </tr>
          ))}
        </tbody>
      </Table>
    </div>
  );
};

export default BooksPage;
