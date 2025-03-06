import React from 'react';
import './Footer.css'; // Add your styles here
import { FaFacebook, FaTwitter, FaInstagram, FaLinkedin } from 'react-icons/fa'; // Importing icons for social media
import imagenpj from './../../assets/imagenpj.png';

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-section large left">
        <h2 className='kadwa'>LibroHub</h2>
        <p className='Lexend-Deca'>
          Welcome to LibroHub, your cozy literary corner! For two years, we've brought readers inspiring stories and built a community of book lovers.
        </p>
      </div>

      <div className="footer-section">
        <h5 className='Lexend-Deca' >Encuéntranos en:</h5>
        <div className="social-media-grid">
          <FaFacebook size={24} color='613E68' />
          <FaTwitter size={24} color='613E68'  />
          <FaInstagram size={24} color='613E68'  />
          <FaLinkedin size={24} color='613E68' />
        </div>
      </div>

      <div className="footer-section">
        <h5 className='Lexend-Deca'>Informations:</h5>
        <ul>
          <li className='Lexend-Deca'>Home</li>
          <li className='Lexend-Deca'>Shop</li>
          <li className='Lexend-Deca'>Contact us</li>
        </ul>
      </div>

      <div className="footer-section">
        <h5 className='Lexend-Deca'>Contact Us:</h5>
        <p className='Lexend-Deca'>ariana.huayra@ucsm.edu.pe</p>
        <p className='Lexend-Deca'>Cerro Colorado</p>
        <p className='Lexend-Deca'>+51 972935062</p>
      </div>

      <div className="footer-section large right">
        <img src={imagenpj} alt="LibroHub logo" className="footer-image" />
        <p className='Lexend-Deca'>© 2024 LibroHub. Todos los derechos reservados.</p>
      </div>
    </footer>
  );
};

export default Footer;