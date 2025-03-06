import React from 'react';
import './BestSellers.css';
import BestSellerCard from '../BestSellerCard/BestSellerCard';

// Importa las imágenes directamente
import bs1 from './../../assets/bs1.png';
import bs2 from './../../assets/bs2.png';
import bs3 from './../../assets/bs3.png';
import bs4 from './../../assets/bs4.png';

// Importa las imágenes de fondo
import bgcomponent1 from './../../assets/bgcomponent1.png';
import bgcomponent2 from './../../assets/bgcomponent2.png';

const BestSellers = () => {
  const books = [
    {
      id: 1,
      image: bs1, 
      title: 'The lion king',
      category: 'Disney',
    },
    {
      id: 2,
      image: bs2,
      title: 'Aladdin',
      category: 'Disney',
    },
    {
      id: 3,
      image: bs3,
      title: 'Pinocho',
      category: 'Disney',
    },
    {
      id: 4,
      image: bs4,
      title: 'Mulan',
      category: 'Disney',
    },
  ];

  return (
    <div className="best-seller-container">
      <div className="background-image left"></div>
      <div className="background-image right"></div>
      <div className="top-text">
        <h1 className='Lexend-Deca'>Top 4</h1>
        <h2 className='Lexend-Deca'>Best Seller</h2>
      </div>
      <div className="book-list">
        {books.map((book) => (
          <BestSellerCard
            key={book.id}
            image={book.image}
            title={book.title}
            category={book.category}
          />
        ))}
      </div>
    </div>
  );
};

export default BestSellers;