import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./LoginPage.css";
import logo from "./../../assets/logo.png";

/**
 * LoginPage component handles user login and redirects based on the user's role.
 * @component
 * @returns {JSX.Element} The rendered LoginPage component.
 */
const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  /**
   * Handles the login process, sending email and password to the server.
   * Redirects to the appropriate page based on the user's role.
   * @async
   * @param {Event} event - The form submission event.
   */
  const handleLogin = async (event) => {
    event.preventDefault();
    try {
      const response = await fetch('http://localhost:3002/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ correo: email, contrasena: password })
      });
      const data = await response.json();
      if (response.ok) {
        console.log('Login successful', data);
        if (data.user && data.user.rol === 'admin') {
          navigate('/admin');
        } else {
          navigate('/inicio');
        }
      } else {
        console.error('Login failed', data.message);
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
          <div
            className="d-flex justify-content-center align-items-center"
            style={{ height: "100vh" }}
          >
            <h1
              className="Lexend-Deca text-start"
              style={{ maxWidth: "400px" }}
            >
              First step to be involved in the literature world.
            </h1>
          </div>
        </div>
        <div className="col-md-6 right-section">
          <div className="register-form">
            <h1 className="Lexend-Deca mb-4">Welcome back!</h1>
            <form onSubmit={handleLogin}>
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
                Sign In
              </button>
            </form>
            <p className="already-account Lexend-Deca">
              Don’t you have an account yet?{" "}
              <a href="/registro" className="sign-in-link Lexend-Deca">
                Sign up
              </a>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default LoginPage;
