# GEMINI.md

This document outlines the structure of the `clojure-exercises` project and the process for generating and adding new exercises. The goal of this project is to learn Clojure by implementing exercises.

---

## Project Structure and Naming Conventions

The project is organized into the following directories:

-   `src/exercises`: Contains the source code for the exercises. Each exercise has its own subdirectory.
-   `test/exercises`: Contains the tests for the exercises. Each exercise's test file is placed directly under this directory.
-   `script`: Contains utility scripts for running tests and exercises.

**Naming Conventions**:

-   **Files and Directories on Disk**: Use `cbt_<exercise-number>_<description>` for all file and directory names, where `<exercise-number>` is in the hundreds with the first digit as the chapter number (e.g., `cbt_406_my_new_exercise` for the sixth exercise based on chapter 4). This is a requirement for the Clojure runtime to be able to map namespaces to files correctly.
-   **Clojure Namespaces**: Use `cbt-<exercise-number>-<description>` for Clojure namespaces (e.g., `exercises.cbt-406-my-new-exercise.solution`).

### Exercise Structure

Each exercise is composed of three files:

1.  `src/exercises/<exercise_name>/README.md`: A markdown file containing the instructions for the exercise. This should include a problem statement, tasks to be completed, and any constraints or hints.
2.  `src/exercises/<exercise_name>/solution.clj`: A Clojure file. The namespace should follow the pattern `exercises.cbt-<exercise-number>.<description>.solution`. This file should contain a minimal stub implementation that allows the tests to compile and run, but fails the tests (e.g., returns nil, empty collections, or incorrect values), so students can see failing tests and then implement the correct solution.
3.  `test/exercises/<exercise_name>_test.clj`: A Clojure file containing the tests for the exercise. The namespace for this test file must be `exercises.cbt-<exercise-number>.<description>-test`.

---

## How to Add a New Exercise

To add a new exercise, follow these steps:

1.  **Create a new directory** for the exercise under `src/exercises/`. The directory name must use `cbt_<exercise-number>_<description>` where `<exercise-number>` is in the hundreds with the first digit as the chapter number (e.g., `src/exercises/cbt_406_my_new_exercise` for the sixth exercise based on chapter 4).
2.  **Create the exercise files**:
    *   Inside the new directory, create a `README.md` file with the exercise instructions.
    *   Create a `solution.clj` file. Its namespace must be `exercises.cbt-<exercise-number>.<description>.solution` (e.g., `(ns exercises.cbt-406.my-new-exercise.solution)`). This file should contain a minimal stub implementation that allows the tests to compile and run, but fails the tests (e.g., returns nil, empty collections, or incorrect values).
3.  **Create a test file**:
    *   Create a test file named `cbt_<exercise-number>_<description>_test.clj` directly under `test/exercises/` (e.g., `test/exercises/cbt_406_my_new_exercise_test.clj`).
    *   Its namespace must be `exercises.cbt-<exercise-number>.<description>-test` (e.g., `(ns exercises.cbt-406.my-new-exercise-test)`).
    *   This file should contain comprehensive tests for the exercise.

---

## How to Generate Exercises

The AI will be asked to generate exercises. When generating an exercise, the AI should **always** follow these process and conventions:

1.  Come up with an interesting, worthwhile problem that tests the student's understanding of a particular concept, idea, or function from the chapter in a non-trivial way. Avoid trivial exercises like "use function X to do Y". Instead, create problems that solve interesting, real-world-like scenarios that are at some level unrelated to programming. More difficult exercises should test the interplay of multiple concepts simultaneously.
2.  Create a new exercise following the structure and naming conventions defined in "How to Add a New Exercise".
3.  The `README.md` should clearly explain the problem and the tasks in an engaging way.
4.  The `solution.clj` should contain a minimal stub implementation that allows the tests to compile and run, but fails the tests (e.g., returns nil, empty collections, or incorrect values), so students can see failing tests and then implement the correct solution.
5.  The `<exercise_name>_test.clj` should contain comprehensive tests that verify the correctness of the solution.

---

## How to Run Tests

To run the tests for all exercises, execute the `test.bat` script from the root of the project:

```bash
script\\test.bat
```
