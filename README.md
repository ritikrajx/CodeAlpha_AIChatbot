# 🤖 Java AI Chatbot

A simple and interactive Java-based chatbot developed as part of the CodeAlpha Java Programming Internship.

## 📌 Overview

The Java AI Chatbot is a console-based application that interacts with users and answers common questions using predefined rules and keyword matching.

The chatbot can respond to greetings, answer basic Java and Object-Oriented Programming (OOP) questions, and provide information about chatbots.

This project demonstrates Java programming, basic text processing, and rule-based response generation.

## ✨ Features

* 💬 Interactive conversation with users
* 👋 Responds to greetings and common messages
* ☕ Answers basic Java-related questions
* 📚 Provides answers to frequently asked questions
* 🧠 Uses rule-based response generation
* 🔎 Matches keywords and phrases in user messages
* 🔤 Performs basic text normalization
* ❓ Provides a help command with example questions
* 🚪 Supports `bye`, `exit`, and `quit` commands
* 🛡️ Handles empty user messages

## 🛠️ Technologies Used

* **Java** — Core programming language
* **Object-Oriented Programming** — Classes and objects
* **Java Collections** — Map and LinkedHashMap
* **Scanner** — Reading user input
* **String Methods** — Processing user messages
* **Regular Expressions** — Basic text normalization
* **Command-Line Interface** — User interaction

## 📚 Concepts Demonstrated

This project demonstrates the following Java concepts:

* Classes and Objects
* Constructors and Methods
* Encapsulation
* Conditional Statements
* Loops
* User Input Handling
* Java Collections Framework
* Map and LinkedHashMap
* String Manipulation
* Basic Text Normalization
* Keyword Matching
* Rule-Based Logic

## 📁 Project Structure

```text
CodeAlpha_Chatbot/
│
├── Main.java
├── Chatbot.java
├── ResponseEngine.java
├── README.md
└── .gitignore
```

### File Description

* **Main.java:** Contains the main method and starts the chatbot application.
* **Chatbot.java:** Handles user input and manages the conversation.
* **ResponseEngine.java:** Matches keywords and returns predefined responses.
* **README.md:** Contains project documentation.
* **.gitignore:** Specifies files that should not be tracked by Git.

## 🧠 How It Works

1. The application starts from `Main.java`.
2. The chatbot displays a welcome message.
3. The user enters a message.
4. The response engine normalizes the message.
5. The engine searches for matching keywords or phrases.
6. The chatbot displays the corresponding response.
7. The conversation continues until the user enters an exit command.

**Note:** This project uses basic text processing and rule-based logic. It does not use a trained machine-learning model or advanced NLP.

## 📋 Sample Menu

The chatbot supports the following topics and commands:

```text
==================================
        JAVA AI CHATBOT
==================================

Hello! I can answer basic questions about Java, OOP,
programming, and this internship project.

Type 'help' to see examples, or 'bye' to exit.

----------------------------------
        AVAILABLE COMMANDS
----------------------------------

1. Greeting              - hello
2. Java Questions        - what is java
3. OOP Questions         - what is oops
4. Class Information     - what is a class
5. Chatbot Information   - what is chatbot
6. NLP Information       - what is nlp
7. Help                  - help
8. Exit                  - bye

----------------------------------
```

**Note:** The commands above describe available topics. The current program does not display a numbered menu; users enter these commands directly into the console.

## ⚙️ Requirements

Before running the project, make sure you have:

* Java Development Kit (JDK) installed
* Visual Studio Code or another Java-compatible editor
* A terminal or command prompt

Check your Java installation:

```bash
java -version
javac -version
```

## ▶️ How to Run

### Step 1: Clone the Repository

Replace the repository name below if you choose a different name on GitHub.

```bash
git clone https://github.com/ritikrajx/CodeAlpha_AIChatbot.git
```

### Step 2: Open the Project Folder

```bash
cd CodeAlpha_AIChatbot
```

### Step 3: Compile the Java Files

```bash
javac Main.java Chatbot.java ResponseEngine.java
```

### Step 4: Run the Application

```bash
java Main
```

### Step 5: Start Chatting

Enter a message in the console and the chatbot will respond.

Type `help` to see example questions.

Type `bye`, `exit`, or `quit` to close the application.

## 🎯 Internship Task

* **Organization:** CodeAlpha
* **Domain:** Java Programming
* **Task:** Artificial Intelligence Chatbot
* **Project Type:** Console-Based Java Application

The objective is to develop a Java-based chatbot that interacts with users and responds to common questions using basic NLP techniques or rule-based logic.

## 👨‍💻 Author

**Ritik Raj**

🎓 B.Tech — Computer Science and Engineering


## 🚀 Future Improvements

* Add more frequently asked questions
* Develop a graphical user interface using Java Swing
* Save conversation history
* Improve keyword matching
* Integrate an NLP library or machine-learning model

## 🌟 Project Purpose

This project was created to strengthen practical Java programming skills and understand how a rule-based chatbot works using classes, collections, user input, and basic text processing.

---

