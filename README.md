# TutorialsNinga Web Application Testing

## Table of Contents
- [Overview](#overview)
- [Important Test Cases](#important-test-cases)
- [Tools Used](#tools-used)
- [Project Design](#project-design)
- [Applied Principles](#applied-principles)


## Overview
**TutorialsNinga** is an E-commerce platform that showcases features like product browsing, shopping cart, and checkout processes for electronic devices such as mobiles, laptops, and more.

For more information, visit the [TutorialsNinga website](https://lnkd.in/dpBg-CEN).

## Important Test Cases
The following are the main test cases designed for the TutorialsNinga application:

1. **User Registration**: Verify that a user can register with valid data.
2. **User Login**: Verify that a user can log in with a valid email and password.
3. **Password Reset**: Verify that a user can successfully reset their password.
4. **Product Search**: Verify that a logged-in user can search for any product.
5. **Currency Switch**: Verify that a logged-in user can switch between currencies randomly.
6. **Category Selection**: Verify that a logged-in user can select different categories randomly.
7. **Add to Cart**: Verify that a logged-in user can add a product to the shopping cart.
8. **Add to Wishlist**: Verify that a logged-in user can add a product to the wishlist.
9. **Add to Compare List**: Verify that a logged-in user can add a product to the compare list.
10. **Order Creation**: Verify that a logged-in user can create a successful order.

## Tools Used
- **Selenium 4**: For browser automation.
- **Build Automation**: Maven for managing project dependencies.
- **Test Framework**: TestNG for organizing and executing tests.
- **Data Generation**: 
  - Java Faker for generating realistic test data.
  - Java Random library for data-driven testing.

## Project Design
The project follows the **Page Object Model (POM)** and **Page Factory** design patterns to enhance maintainability and readability of the test code.

### Page Object Model (POM)
- Each page of the application is represented as a class.
- Methods in these classes represent actions that can be performed on the page.

### Page Factory
- Utilizes annotations for initializing page elements, reducing boilerplate code.

## Applied Principles
The project incorporates various software engineering principles, including:

1. **SOLID Principles**: Specifically focusing on the Single Responsibility Principle to ensure that each class has one reason to change.
2. **Java and OOP**: Utilizing object-oriented programming concepts, including inheritance.
3. **Assertions in Test Cases**: To validate expected outcomes against actual results.

