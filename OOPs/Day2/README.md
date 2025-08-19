# `this` Keyword in Java  

### 📖 Summary  
- `this` is a reference variable pointing to the current object of a class.  
- It can be used inside **constructors** and **instance methods**.  
- Not allowed in **static methods**.  

### 🔑 Key Uses
1. Differentiate between **instance** and **local variables**.  
2. Invoke another constructor in the same class (`this()`) – **constructor chaining**.  
3. Pass the current object as an argument to another method.  
4. Invoke current object’s methods explicitly.  

### ⚡ Difference
- `this` → Reference to current object.  
- `this()` → Calls another constructor.  

---

### 💻 Code Example
[ThisKeyword.java](ThisKeyword.java)


## 'super' Keyword in Java

The `super` keyword is used to refer to the parent class in Java.

### Key Uses:
- Access parent variables
- Call parent methods
- Call parent constructors

### Code Examples:
- [Access Parent Variable](SuperVariable.java)
- [Call Parent Method](SuperMethod.java)
- [Call Parent Constructor](SuperConstructor.java)

## Anonymous Object:
new Child().display(); → creates anonymous object (no reference).
Object is used once → eligible for garbage collection immediately.
### Equivalent to:
Child obj = new Child();
obj.display();
### Uses:
Commonly used in method chaining or when the object is not reused.
