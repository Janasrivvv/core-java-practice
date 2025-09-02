# 📘 Java Hello World Program – Detailed Notes

## 1. Program Code
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
````

---

## 2. Line-by-Line Explanation

### 🔹 `public class Main {`

* **public** → Access modifier, visible from anywhere.
* **class** → Declares a class (a fundamental building block in Java).
* **Main** → Class name. By convention, the filename must match (`Main.java`).

---

### 🔹 `public static void main(String[] args) {`

* **public** → The JVM must access this method externally.
* **static** → Method belongs to the class, not an instance (no object creation needed).
* **void** → Return type indicating nothing is returned.
* **main** → The special entry point that JVM searches for when execution begins.
* **String\[] args** → Array of strings storing command-line arguments.

  * Example: `java Main hello jana` → `args[0] = "hello"`, `args[1] = "jana"`.

---

### 🔹 `System.out.println("Hello World");`

* **System** → A core Java class in `java.lang` package.
* **out** → A static member of `System`, an instance of `PrintStream`.
* **println()** → Prints output followed by a newline.
* **"Hello World"** → A string literal to be printed.

---

### 🔹 Closing Braces `}`

* The first `}` terminates the `main` method.
* The second `}` terminates the `Main` class.

---

## 3. Execution Workflow

1. **Compilation**

   ```
   javac Main.java
   ```

   Produces a bytecode file `Main.class`.
   
3. **Execution**

   ```
   java Main
   ```

   JVM invokes the `main` method.

4. **Output**

   ```
   Hello World
   ```

---
