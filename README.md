# QuizGame (Java)

Simple console-based quiz application written in Java.

## Overview
QuizGame displays a series of multiple-choice questions, accepts user answers from the console, and prints the final score.

## Project structure
- QuizHome.java — application entry point (contains `main`)
- QuestionService.java — contains questions and logic to display them and collect answers
- Question.java — model class for a question (expected to exist in the project)
- README.md — this file

## Prerequisites
- Java JDK installed (recommended: Java 17 LTS or later)
- Windows (instructions below use Command Prompt or PowerShell)
- (Optional) Visual Studio Code for editing and running

## Build and run (Windows)
Open Command Prompt or PowerShell and run:

1. Change directory to the project folder:
   cd "c:\Users\Chinmay Raj Shah\OneDrive\Desktop\java\QuizGame"

2. Compile:
   javac *.java

3. Run:
   java QuizHome

## Notes and tips
- The program expects option numbers as input (1–4). Invalid input may throw an exception; consider adding input validation if needed.
- If you use `Scanner(System.in)` in multiple places, avoid closing the Scanner if other code still needs System.in. Closing the Scanner will close System.in.
- To run from VS Code, open the folder, install the Java Extension Pack, then use the Run/Debug or Code Runner options.

## Contributing
- Fork the repo, make changes, and open a pull request.
- Keep changes small and include tests where applicable.

## License
MIT License — see LICENSE file or add one if needed.
