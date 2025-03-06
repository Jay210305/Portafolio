import React, { useState } from 'react';
import './CommonQuestions.css'; // Add your styles here
import { FaChevronDown, FaChevronUp } from 'react-icons/fa'; // Importing arrow icons

const CommonQuestions = () => {
  const [openQuestion, setOpenQuestion] = useState(null);

  const toggleQuestion = (index) => {
    setOpenQuestion(openQuestion === index ? null : index);
  };

  return (
    <div className="common-questions m-5">
      <div className="common-questions-left-section">
        <h1 className='Lexend-Deca'>Common Questions</h1>
        <p className='Lexend-Deca'>
          Find answers to the most frequently asked questions about using our platform, covering topics ranging from copyright issues to how to organize your personal online library.
        </p>
      </div>

      <div className="common-questions-right-section Lexend-Deca">
        <div className="question-container" onClick={() => toggleQuestion(1)}>
          <div className="question-header">
            <h6>How can I place an order?</h6>
            {openQuestion === 1 ? <FaChevronUp /> : <FaChevronDown />}
          </div>
          {openQuestion === 1 && (
            <div className="answer">
              <p>Simply choose your books and follow the checkout process.</p>
            </div>
          )}
        </div>

        <div className="question-container" onClick={() => toggleQuestion(2)}>
          <div className="question-header">
            <h6>Can I return a book?</h6>
            {openQuestion === 2 ? <FaChevronUp /> : <FaChevronDown />}
          </div>
          {openQuestion === 2 && (
            <div className="answer">
              <p>Yes, you can return any book within 30 days of purchase, provided it is in good condition.</p>
            </div>
          )}
        </div>

        <div className="question-container" onClick={() => toggleQuestion(3)}>
          <div className="question-header">
            <h6>Do you offer student discounts?</h6>
            {openQuestion === 3 ? <FaChevronUp /> : <FaChevronDown />}
          </div>
          {openQuestion === 3 && (
            <div className="answer">
              <p>Yes, we offer a 10% discount for students with a valid student ID.</p>
            </div>
          )}
        </div>

        <div className="question-container" onClick={() => toggleQuestion(4)}>
          <div className="question-header">
            <h6>How do I contact the customer service?</h6>
            {openQuestion === 4 ? <FaChevronUp /> : <FaChevronDown />}
          </div>
          {openQuestion === 4 && (
            <div className="answer">
              <p>You can contact our customer service through the 'Contact Us' section on our website or by calling +51 972935062.</p>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};

export default CommonQuestions;