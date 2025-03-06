import React, { useEffect, useState } from 'react';
import { extractColors } from 'extract-colors';
import './BestSellerCard.css';

const BestSellerCard = ({ image, title, category }) => {
  const [bgColor, setBgColor] = useState('rgba(0, 0, 0, 0.15)');

  useEffect(() => {
    const fetchColors = async () => {
      try {
        const colors = await extractColors(image);
        console.log(colors); // For debugging

        if (colors.length > 0) {
          const dominantColor = colors[0]; // Get the first color object
          setBgColor(`rgba(${dominantColor.red}, ${dominantColor.green}, ${dominantColor.blue}, 0.30)`);
        }
      } catch (error) {
        console.error('Error extracting colors:', error);
      }
    };

    fetchColors();
  }, [image]);

  return (
    <div className="book-card" style={{ backgroundColor: bgColor }}>
      <img src={image} alt={title} className="book-image" crossOrigin="anonymous" />
      <h3 className="book-title">{title}</h3>
      <p className="book-category">{category}</p>
    </div>
  );
};

export default BestSellerCard;