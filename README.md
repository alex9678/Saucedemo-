# Saucedemo Automation Testing Project

Welcome to the Saucedemo Automation Testing Project repository! This project focuses on testing the functionality of the Saucedemo website.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Overview Video](#overview-video)
- [Allure Reports](#allure-reports)
- [Installation and Usage](#installation-and-usage)
- [Project Links](#project-links)

## Introduction
[Saucedemo](https://www.saucedemo.com/) is an e-commerce website providing a diverse range of products and features for online shoppers. With its user-friendly interface and robust functionalities, Saucedemo offers customers a seamless shopping experience. The website includes features such as product browsing, search capabilities, user account management, shopping cart functionality, and secure checkout processes. Additionally, it may incorporate product reviews, recommendations, and order tracking to enhance the overall shopping experience.

## Features
- **Login Functionality Testing:**
  - Validate the login process using various credentials.
- **Product Management:**
  - Test the addition and removal of products across different pages.
- **Sorting Products:**
  - Verify product sorting based on price and name criteria.
- **Checkout Process Testing:**
  - Ensure a smooth end-to-end checkout process, covering cart management to payment.
- **Menu Functionality Testing:**
  - Test menu functionalities such as logout, navigating back to the main page, and clearing the cart.
- **End-to-End Testing:**
  - Execute comprehensive end-to-end scenarios to ensure seamless system integration.

## 📑 Technologies & Skill & Features
| Technologies      | Description |
| ----------- | ----------- |
| **Java:**      | The project is developed using Java, providing a robust and widely used programming language for automation.       |
| **TestNG:**   | TestNG is used as the testing framework, offering powerful test configuration options, parallel execution, and detailed reporting.        |
| **Selenium WebDriver:**   | The project includes Selenium WebDriver for automating browser interactions        |
| **Page Object Model (POM):**   | The project follows the POM design pattern, enhancing test maintainability and reusability by separating page elements and actions.        |
| **Allure Reports:**   | Test results are documented using Allure Reports, providing a clear and interactive visualization of test execution.        |
| **Jenkins:**   | Continuous integration and continuous delivery (CI/CD) platform for automated builds and deployments.        |

## Overview Video
Click to Watch a video demonstration of the project:

[![Project Demo]()]()

## Allure Reports 
![allure1](https://github.com/alex9678/Saucedemo-/blob/main/screenShots/allure1.png)
![allure2](https://github.com/alex9678/Saucedemo-/blob/main/screenShots/allure2.png)
![allure3](https://github.com/alex9678/Saucedemo-/blob/main/screenShots/allure3.png)

## Installation and Usage
Follow these steps to clone the repository, run tests, and view Allure reports:

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/alex9678/Saucedemo-.git
    ```

2. **Build and Run Tests:**
    ```bash
    mvn clean test
    ```

3. **Generate and View Allure Reports:**
    ```bash
    mvn allure:serve
    ```

Once you execute these commands, you should be able to see the test results and generated Allure reports in your browser.

## Project Links
- **Project Website:** [Visit Saucedemo Automation Project]
- **Software Test Description (STD):** [View STD on GitHub](https://github.com/alex9678/Saucedemo-/blob/main/STD%20saucedemo.pdf)


