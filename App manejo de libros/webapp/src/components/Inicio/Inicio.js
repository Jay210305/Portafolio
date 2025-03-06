import React from 'react';
import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import './Inicio.css';

// Importa las imágenes para el carrusel
import img1 from './../../assets/bs1.png';
import img2 from './../../assets/bs2.png';
import img3 from './../../assets/bs3.png';

// Importa Flicking y SnapControl
import Flicking, { FreeControl, SnapControl } from "@egjs/react-flicking";
import "@egjs/react-flicking/dist/flicking.css"; // No olvides importar el CSS

const Inicio = () => {
  const images = [img1, img2, img3];

  return (
    <div className="inicio-container">
      {/* Sección izquierda */}
      <div className="inicio-left-section">
        <h1 className="Lexend-Deca">Discover your next favorite book!</h1>
        <p>
          We offer a vast selection of books spanning
          every genre imaginable, from classic literature
          to contemporary bestsellers.
        </p>
        <Button variant="primary" className="shop-now-button">
          Shop Now
        </Button>
      </div>
      
      {/* Sección derecha con el carrusel de Flicking */}
      <div className="right-section bg-transparent">
        <Flicking
          className="carousel"
          circular={true}
          plugins={[new FreeControl(), new SnapControl()]}
        >
          {images.map((image, index) => (
            <div className="carousel-panel" key={index}>
              <img 
                className="d-block carousel-image" 
                src={image} 
                alt={`carousel-image-${index}`} 
              />
            </div>
          ))}
        </Flicking>
      </div>
    </div>
  );
};

export default Inicio;