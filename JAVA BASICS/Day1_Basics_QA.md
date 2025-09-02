# 📘 Day 1 – Core Java Basics

## 1. Java Overview
- Java is a **high-level, object-oriented, platform-independent** language.
- Philosophy: **“Write Once, Run Anywhere” (WORA)** → compiled once into bytecode, runs anywhere with JVM.

---

## 2. Difference Between Java, Python, and C++

| Feature             | Java                                           | Python                         | C++                                 |
| ------------------- | ---------------------------------------------- | ------------------------------ | ----------------------------------- |
| **Type System**     | Statically typed (types fixed at compile time) | Dynamically typed              | Statically typed                    |
| **Compilation**     | Compiles to **bytecode** → runs on JVM         | Interpreted (line by line)     | Compiles directly to machine code   |
| **Memory Mgmt**     | Automatic garbage collection                   | Automatic garbage collection   | Manual memory mgmt (`new/delete`)   |
| **Speed**           | Faster than Python, slower than C++            | Slower (interpreted)           | Fastest (compiled to native code)   |
| **Platform Indep.** | Yes (via JVM)                                  | Yes (cross-platform)           | No (platform dependent binaries)    |
| **Syntax**          | Verbose, strongly typed                        | Very simple, beginner friendly | Complex (supports low-level ops)    |
| **Use Cases**       | Enterprise apps, Android, backend systems      | AI/ML, scripting, prototyping  | Game engines, high-performance apps |

---

## 3. Advantages of Java
- ✅ Platform Independent  
- ✅ Object-Oriented  
- ✅ Robust & Secure (no pointers, strong exception handling)  
- ✅ Automatic Garbage Collection  
- ✅ Rich API & Libraries  - Collections, concurrency, Networking
- ✅ Huge Community & Industry Adoption  -Banking, Enterprise, Backend ,Andriod

---

## 4. Core Components of Java
1. **JVM (Java Virtual Machine)** → Executes Java bytecode.  
2. **JRE (Java Runtime Environment)** → JVM + libraries (needed to run programs).  
3. **JDK (Java Development Kit)** → JRE + compiler + dev tools (needed to develop programs).  

👉 **JDK = JRE + Tools**, **JRE = JVM + Libraries**  

---

## 5. How a Java Program Runs
Write Code → Save Main.java.
- Compilation (javac Main.java) → Converts .java into .class bytecode.
- Class Loader → Loads .class into JVM memory.
- Bytecode Verifier → Ensures no illegal code (security).
- JIT Compiler (Just-In-Time) → Converts bytecode into machine code for execution.
- Execution → Native code runs on CPU, prints result.

---

## 6. Why Only One Public Class per File?
- A `.java` file can have many classes but **only one `public` class**.  
- The **public class name must match the filename** (`Main.java` → `public class Main`).  
- Ensures JVM knows exactly which class to load as entry point.  
- Multiple non-public classes in the same file are allowed.  

---

## 7. Why Java is Platform Independent?  
- Java compiler generates **Bytecode** (.class).  
- Bytecode runs on **JVM** (different JVMs for Windows, Linux, Mac).  
- Same `.class` file works everywhere.  
- Principle: **Write Once, Run Anywhere (WORA)**.  

---


