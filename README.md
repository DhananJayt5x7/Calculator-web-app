# Calculator Web Application

## Project Overview
This project is a web-based calculator application built using Java Servlets and JSP. It allows users to perform basic arithmetic operations and view the history of calculations.

## Features
- **Arithmetic Operations:** Supports addition, subtraction, multiplication, and division.
- **Calculation History:** Stores and displays the history of previous calculations.
- **User-Friendly Interface:** A simple and intuitive interface for performing calculations.

## Technologies Used
- **Java:** Core language for back-end logic.
- **Servlets:** Handles the business logic and request processing.
- **JSP (JavaServer Pages):** Used for displaying results and calculation history.
- **HTML/CSS:** Basic structure and styling of the web pages.

## Project Structure
- **src/main/java/com/yourpackage/servlets/**
  - `CalculatorServlet.java`: Handles arithmetic operations.
  - `HistoryServlet.java`: Displays the history of calculations.
- **src/main/webapp/**
  - `index.jsp`: Main page for user input.
  - `result.jsp`: Displays the result of calculations.
  - `history.jsp`: Displays the history of past calculations.
- **src/main/resources/**
  - `application.properties`: Configuration file for the application (if needed).

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/DhananJayt5x7/calculator-webapp.git
2. Navigate to the project directory:
    ```bash
    cd calculator-webapp
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, etc.).
4. Run the application using your IDE's built-in server or a local Tomcat server.
5. Access the application in your web browser at
   ```bash
   localhost:8080/calculator/index.html .
