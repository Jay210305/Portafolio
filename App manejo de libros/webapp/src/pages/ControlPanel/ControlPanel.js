import React, { useState } from 'react';
import BooksPage from '../BooksPage/BooksPage';
import UsersPage from '../UsersPage/UsersPage';
import CategoryPage from '../CategoryPage/CategoryPage'; // Asegúrate de que la ruta sea correcta

/**
 * El componente ControlPanel proporciona una interfaz de administración para cambiar entre diferentes páginas de gestión:
 * BooksPage, UsersPage, y CategoryPage.
 * @component
 * @returns {JSX.Element} El componente ControlPanel renderizado.
 */
const ControlPanel = () => {
  // Estado para controlar qué componente se debe mostrar
  const [activeTab, setActiveTab] = useState('books');

  /**
   * Maneja el clic en una pestaña para cambiar la página mostrada.
   * @function
   * @param {string} tab - El nombre de la pestaña seleccionada.
   */
  const handleTabClick = (tab) => {
    setActiveTab(tab);
  };

  return (
    <div className="container mt-5">
      <h1 className='Lexend-Deca'>Panel de Control de Administración</h1>
      <nav>
        <ul className="nav nav-tabs">
          <li className="nav-item">
            <button
              className={`nav-link ${activeTab === 'books' ? 'active' : ''}`}
              onClick={() => handleTabClick('books')}
            >
              Libros
            </button>
          </li>
          <li className="nav-item">
            <button
              className={`nav-link ${activeTab === 'users' ? 'active' : ''}`}
              onClick={() => handleTabClick('users')}
            >
              Usuarios
            </button>
          </li>
          <li className="nav-item">
            <button
              className={`nav-link ${activeTab === 'categories' ? 'active' : ''}`}
              onClick={() => handleTabClick('categories')}
            >
              Categorías
            </button>
          </li>
        </ul>
      </nav>
      <div>
        {activeTab === 'books' && <BooksPage />}
        {activeTab === 'users' && <UsersPage />}
        {activeTab === 'categories' && <CategoryPage />}
      </div>
    </div>
  );
};

export default ControlPanel;
