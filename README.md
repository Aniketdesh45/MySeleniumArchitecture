# Custom Selenium Architecture in Java

## 📌 Project Overview
This project is a **custom-built Selenium-like architecture** created using **Java** 
to understand how Selenium WebDriver works internally.
---

## 🎯 Why I Built This Project
- To understand ""Selenium WebDriver architecture""
- To clearly learn ""interface vs class""
- To practice **OOP concepts** like abstraction and polymorphism
- To understand how **WebDriver, WebElement, and By** are connected
---

## 🏗️ Project Structure
MySeleniumArchitecture │
                       ├── core 
                       │  ├── WebDriver.java 
                       │  ├── ChromeDriver.java 
                       │  
                       ├── locator 
                       │   ├── By.java 
                       │ 
                       ├── element 
                       │   ├── WebElement.java 
                       │ 
                       ├── actions 
                       │   ├── Actions.java 
                       │ 
                       ├── dropdown 
                       │   ├── Select.java 
                       │
                       ├── javascript 
                       │   ├── JavascriptExecutor.java 
                       │ 
                       ├── pages 
                       │   ├── LoginPage.java 
                       │ 
                       ├── base 
                       │   ├── BaseTest.java 
                       │ 
                       ├── utils 
                       │   ├── ConfigReader.java 
                       │   ├── TestData.java 
                       │ 
                       └── tests └── LoginTest.java
---

## 🧠 Key Concepts Covered

- WebDriver as an ""interface""
- Browser classes implementing WebDriver
- WebElement for element-level actions
- By class for locators (Factory pattern)
- JavascriptExecutor interface
- Page Object Model (POM)
- Simple Hybrid framework structure
- Java OOP principles
---
## ▶️ How This Project Works
- This project **does not open a real browser**
- It ""prints actions in the console""
- It simulates how Selenium internally calls methods

### Sample Output:
            Opening Chrome browser with URL 
            Finding element using ID 
            Entering text Clicking element 
            Executing JavaScript
            Closing browser

---

## ❗ Important Note
This is a "" learning-based project"" created to understand Selenium architecture.  
It is **not intended for real automation testing**.

---
## 🧪 Technologies Used
- Java
- Eclipse IDE
- Git & GitHub
---
## 🗣️ How I Explain This in Interview
> "I built a simple custom Selenium architecture in Java to understand
> how WebDriver, WebElement, and locators work internally.
> After that, I organized it into a basic hybrid structure using POM for better clarity."

---
## 👤 Author
  Aniket Deshmukh            
