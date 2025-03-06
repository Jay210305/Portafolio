import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from "./components/Header/Header";
import BuyNow from "./components/BuyNow/BuyNow";
import RegisterPage from './pages/RegisterPage/RegisterPage';
import LoginPage from './pages/LoginPage/LoginPage';
import MainPage from './pages/MainPage/MainPage';
import BookShopPage from './pages/BookShopPage/BookShopPage';
import ControlPanel from './pages/ControlPanel/ControlPanel';
import BooksPage from './pages/BooksPage/BooksPage';
import UsersPage from './pages/UsersPage/UsersPage';
import AddBookPage from './pages/AddBookPage/AddBookPage';
import EditBookPage from './pages/EditBookPage/EditBookPage';
import AddCategoryPage from './pages/AddCategoryPage/AddCategoryPage';

/**
 * App component is the main application component that sets up routing for the entire application.
 * It uses React Router to define routes for different pages.
 * @component
 * @returns {JSX.Element} The rendered App component.
 */
function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/" element={<LoginPage />} />
          <Route path="/inicio" element={<MainPage />} />
          <Route path="/tienda" element={<BookShopPage />} />
          <Route path="/registro" element={<RegisterPage />} />
          <Route path="/admin" element={<ControlPanel />} />
          <Route path="/add-book" element={<AddBookPage />} />
          <Route path="/edit-book/:id" element={<EditBookPage />} />
          <Route path="/add-category" element={<AddCategoryPage />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
