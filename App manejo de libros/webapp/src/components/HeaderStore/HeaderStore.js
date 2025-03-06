import React from "react";
import logo from "./../../assets/logo.png"; // Asegúrate de que la ruta al logo es correcta
import "./HeaderStore.css"; // Importa tus estilos personalizados para el Header

const HeaderStore = () => {
  return (
    <header>
      <nav className="navbar navbar-expand-lg navbar-light bg-white fixed-top">
        <div className="container-fluid m-4">
          {/* Logo y nombre, al hacer clic, navegará al inicio de la página */}
          <a href="#inicio" className="navbar-brand d-flex align-items-center">
            <img src={logo} alt="LibroHub Logo" height="40" className="me-2" />
            <span className="h4 m-0">LibroHub</span>
          </a>

          {/* Botón de menú para pantallas pequeñas */}
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>

          {/* Contenido de la barra de navegación */}
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <div className="mx-auto d-flex align-items-center">
            <ul className="navbar-nav mx-auto ">
              <li className="nav-item px-3">
                <a href="#inicio" className="nav-link">Inicio</a>
              </li>
              <li className="nav-item px-3">
                <a href="#tienda" className="nav-link">Tienda</a>
              </li>
              <li className="nav-item px-3">
                <a href="#contacto" className="nav-link">Contacto</a>
              </li>
            </ul>

            <div className="search-container ms-3">
                <input
                  className="search-input"
                  type="search"
                  placeholder="Search"
                  aria-label="Search"
                />
                <button className="search-button" type="submit">
                  <i className="bi bi-search"></i>
                </button>
            </div>
            </div>
          </div>
          {/* Botón de perfil en la esquina derecha */}
          <a href="#perfil" className="profile-button btn ms-auto">
            <i className="bi bi-person"></i>
          </a>
        </div>
      </nav>
    </header>
  );
};

export default HeaderStore;