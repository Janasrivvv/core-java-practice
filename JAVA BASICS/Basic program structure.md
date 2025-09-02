public class Main{
    public static void main(String [] args){
        System.out.println("Hello World");
    }
}

🔎 Explanation
1. public class Main {

public → Access modifier. It means this class can be accessed from anywhere in the project. (If you made it private, no one outside could use it.)

class → Keyword that defines a class. A class is a blueprint for objects, but here we’re just using it as a container for our code.

Main → Name of the class. By convention, the file name should match the class name (Main.java).

👉 Think of this line as: “Hey Java, I’m defining a class called Main that will hold my code.”

2. public static void main(String[] args) {

This is the entry point of every Java program. Let’s split it:

public → Again, it means this method can be accessed from anywhere. Required because JVM needs to call it from outside.

static → Means this method belongs to the class itself, not to an object.
⚡ Without static, you’d have to create an object like:

new Main().main(...);


But since JVM needs to start without creating objects, main must be static.

void → Return type. It means this method doesn’t return any value.

main → Method name. JVM looks specifically for this name to start execution.

String[] args → Command-line arguments.

It’s an array of String objects.

If you run:

java Main hello jana


Then args[0] = "hello", args[1] = "jana".

👉 So this line means: “Here’s a public method named main that the JVM can run directly without objects, doesn’t return anything, and can accept arguments.”

3. System.out.println("Hello World");

System → A built-in Java class in java.lang package. It has useful members for input, output, etc.

out → A static variable inside System that represents the standard output (console).

println() → Method of PrintStream (the type of out). It prints whatever you pass, then moves to the next line.

"Hello World" → A String literal being printed.

👉 This line says: “Send the text Hello World to the console and move to the next line.”

4. Closing braces }

First } closes the main method.

Second } closes the Main class.

⚡ Flow of Execution

You compile: javac Main.java → Creates Main.class.

You run: java Main → JVM searches for public static void main(String[] args).

It executes the code inside → prints "Hello World".
