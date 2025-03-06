import React, { useState, useEffect } from "react";
import logo from "./../../assets/logo.png";
import "./Header.css";

const Header = () => {
  const [isTop, setIsTop] = useState(true);

  useEffect(() => {
    const onScroll = () => {
      const isAtTop = window.scrollY < 20;
      setIsTop(isAtTop);
    };

    window.addEventListener("scroll", onScroll);

    // Llama a onScroll inicialmente para establecer el estado correcto
    onScroll();

    return () => {
      window.removeEventListener("scroll", onScroll);
    };
  }, []);

  return (
    <header>
      <nav className={`navbar navbar-expand-lg navbar-light fixed-top ${isTop ? "top-nav" : ""}`}>
        <div className="container-fluid m-4">
          <a href="#inicio" className="navbar-brand d-flex align-items-center">
            <img src={logo} alt="LibroHub Logo" height="40" className="me-2" />
            <span className="h4 m-0">LibroHub</span>
          </a>
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
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav mx-auto">
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
          </div>
          <a href="#perfil" className="profile-button btn ms-auto">
            <i className="bi bi-person"></i>
          </a>
        </div>
      </nav>
    </header>
  );
};

export default Header;