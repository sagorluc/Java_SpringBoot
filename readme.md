# Java & Spring Boot Development Environment Setup

This guide helps you set up a Java and Spring Boot development environment on your local machine using **VS Code**.

---

## 🛠️ 1. Install Java JDK

To build and run Java and Spring Boot applications, you need to install the **Java Development Kit (JDK)**.

### ✅ Step-by-step:
- Download the latest LTS version of Java JDK from Oracle or OpenJDK:
  👉 [Download Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Choose your operating system and download the installer.
- Follow the installation instructions.

### ⚙️ 2. Install Visual Studio Code (VS Code)
If you don’t already have it, install VS Code:

👉 Download VS Code


### 🔌 3. Install Java Extensions in VS Code
Open VS Code and install the following essential extensions from the Extensions tab (Ctrl+Shift+X):

Java Extension Pack (by Microsoft)

Includes: Language Support for Java™, Maven, Debugger for Java, etc.

Spring Boot Extension Pack

Includes: Spring Boot Tools, Spring Initializr, Spring Boot Dashboard

You can install both by searching or using these links:

👉 Java Extension Pack

👉 Spring Boot Extension Pack

### 🌱 4. Set Up Spring Boot Project
The easiest way to create a Spring Boot project is to use Spring Initializr.

🧪 Option 1: Use Spring Initializr in VS Code
Open Command Palette (Ctrl+Shift+P)

Type: Spring Initializr: Generate a Maven/Gradle Project

Select language, dependencies, project name, etc.

The project will be downloaded and opened in VS Code.

🧪 Option 2: Use Spring Initializr website
👉 Spring Initializr Website

Customize your project and download the .zip

Extract and open in VS Code

### 📖 Spring Boot Documentation
To learn more about Spring Boot, check the official documentation:

👉 Spring Boot Official Docs

🚀 Run Your Spring Boot App
Once your project is open:

Locate the main class with @SpringBootApplication

Click the "Run" button (usually appears near main() method), or

Run from terminal:
```
./mvnw spring-boot:run
```

or if using Gradle:

```
./gradlew bootRun
```

You now have a full Java + Spring Boot development environment ready with:

Java JDK installed

VS Code configured with Java and Spring extensions

Spring Boot app ready to run and develop