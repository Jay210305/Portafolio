import React from 'react';
import BookShopCard from '../../components/BookShopCard/BookShopCard'; // Importa el componente BookShopCard
import './BookShopPage.css'; // Agrega los estilos para esta página
import bs1 from './../../assets/bs1.png';
import bs2 from './../../assets/bs2.png';
import bs3 from './../../assets/bs3.png';
import bs4 from './../../assets/bs4.png';
import HeaderStore from '../../components/HeaderStore/HeaderStore';

const booksData = [
  {
    id: 1,
    title: "The Great Gatsby",
    category: "Disney",
    rating: 4,
    price: 10.99,
    image: bs1
  },
  {
    id: 2,
    title: "To Kill a Mockingbird",
    category: "Disney",
    rating: 5,
    price: 12.99,
    image: bs2
  },
  {
    id: 1,
    title: "The Great Gatsby",
    category: "Disney",
    rating: 4,
    price: 10.99,
    image: bs1
  },
  {
    id: 2,
    title: "To Kill a Mockingbird",
    category: "Disney",
    rating: 5,
    price: 12.99,
    image: bs2
  },
  {
    id: 1,
    title: "The Great Gatsby",
    category: "Disney",
    rating: 4,
    price: 10.99,
    image: bs1
  },
  {
    id: 2,
    title: "To Kill a Mockingbird",
    category: "Disney",
    rating: 5,
    price: 12.99,
    image: bs2
  },
  {
    id: 3,
    title: "1984",
    category: "Dystopian",
    rating: 5,
    price: 8.99,
    image: bs3
  },
  {
    id: 4,
    title: "Brave New World",
    category: "Dystopian",
    rating: 4,
    price: 9.99,
    image: bs4
  },
  {
    id: 5,
    title: "Sapiens",
    category: "Non-fiction",
    rating: 5,
    price: 15.99,
    image: bs1
  }
];

/**
 * El componente BookShopPage muestra una lista categorizada de libros.
 * Cada categoría se muestra con un título y los libros dentro de esa categoría se muestran en una cuadrícula.
 * @component
 * @returns {JSX.Element} El componente BookShopPage renderizado.
 */
const BookShopPage = () => {
  // Agrupa los libros por categoría
  const groupedBooks = booksData.reduce((acc, book) => {
    if (!acc[book.category]) acc[book.category] = [];
    acc[book.category].push(book);
    return acc;
  }, {});

  return (
    <div className="book-shop-page m-5">
        <HeaderStore/>
      {Object.keys(groupedBooks).map((category) => (
        <div key={category} className="book-category-section">
          <h2 className="category-title">{category}</h2>
          <div className="book-category-grid px-5 py-3">
            {groupedBooks[category].map((book) => (
              <BookShopCard
                key={book.id}
                image={book.image}
                title={book.title}
                category={book.category}
                rating={book.rating}
                price={book.price}
              />
            ))}
          </div>
        </div>
      ))}
    </div>
  );
};

export default BookShopPage;
