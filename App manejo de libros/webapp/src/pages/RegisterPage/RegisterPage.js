import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './RegisterPage.css';
import logo from './../../assets/logo.png';

/**
 * RegisterPage component renders the registration form for new users.
 * It handles user input and sends the registration data to the server.
 * @component
 * @returns {JSX.Element} The rendered RegisterPage component.
 */
const RegisterPage = () => {
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  /**
   * Handles the registration process by sending user data to the server.
   * @async
   * @param {Event} event - The form submission event.
   */
  const handleRegister = async (event) => {
    event.preventDefault();
    try {
      const response = await fetch('http://localhost:3002/register', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nombre: username, correo: email, contrasena: password })
      });
      const data = await response.json();
      if (response.ok) {
        console.log('Registration successful', data);
      } else {
        console.error('Registration failed', data.message);
      }
    } catch (error) {
      console.error('Network error', error);
    }
  };

  return (
    <div className="container-fluid">
      <div className="row">
        <div className="col-md-6 left-section">
          <div className="logo-section">
            <img src={logo} alt="Logo" className="logo" />
            <span className="logo-text kadwa-font">LibroHub</span>
          </div>
          <div className="d-flex justify-content-center align-items-center" style={{ height: "100vh" }}>
            <h1 className="Lexend-Deca text-start" style={{ maxWidth: "500px" }}>
              Be the first to know about new releases, discounts and exclusive offers.
            </h1>
          </div>
        </div>
        <div className="col-md-6 right-section">
          <div className="register-form">
            <h1 className='Lexend-Deca mb-4'>Create account</h1>
            <form onSubmit={handleRegister}>
              <div className="form-group">
                <input
                  type="text"
                  placeholder="Username"
                  className="form-control custom-input Lexend-Deca"
                  value={username}
                  onChange={(e) => setUsername(e.target.value)}
                />
              </div>
              <div className="form-group">
                <input
                  type="email"
                  placeholder="Email"
                  className="form-control custom-input Lexend-Deca"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                />
              </div>
              <div className="form-group">
                <input
                  type="password"
                  placeholder="Password"
                  className="form-control custom-input Lexend-Deca"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                />
              </div>
              <button type="submit" className="btn sign-up-button Lexend-Deca">
                Sign Up
              </button>
            </form>
            <p className="already-account Lexend-Deca">
              Already have an account?{' '}
              <a href="/" className="sign-in-link Lexend-Deca">
                Sign in
              </a>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default RegisterPage;
