import React from 'react';
import './BookShopCard.css'; // Make sure to add your custom styles here.
import { FaStar } from 'react-icons/fa'; // Importing star icon from react-icons

const BookShopCard = ({ image, title, category, rating, price }) => {
  // Create an array to hold the stars
  const stars = Array(5).fill(0);

  return (
    <div className="book-shop-card ">
      <img src={image} alt={title} className="book-image" />
      <h3 className="book-title">{title}</h3>
      <p className="book-category">{category}</p>

      <div className="book-rating">
        {stars.map((_, index) => (
          <FaStar
            key={index}
            size={12}
            color={index < rating ? "#FFD700" : "#dcdcdc"} // Yellow stars for rating
          />
        ))}
      </div>

      <div className="book-shop-footer">
        <span className="book-price">{`$${price}`}</span>
        <button className="buy-now-btn">Buy Now</button>
      </div>
    </div>
  );
};

export default BookShopCard;