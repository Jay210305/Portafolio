import React from 'react';
import './BuyNow.css'; // Asume que los estilos personalizados están en este archivo
import backgroundImage from './../../assets/bgimage1.png';

const BuyNow = () => {
    return (
        <div className="buy-now-container">
            <div
                className="background-image"
                style={{ backgroundImage: `url(${backgroundImage})` }}
            ></div>
            <div className="content-box ">
                <h1 className='kadwa-font'>¡Descubre tu próximo libro favorito!</h1>
                <p className='kadwa-font'>Explora nuestra amplia selección de libros en línea.</p>
                <button className=" custom-button kadwa-font">Compra ahora</button>
            </div>
        </div>
    );
};

export default BuyNow;
