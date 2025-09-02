📘 Java Hello World Program – Notes
1. Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

2. Explanation
🔹 public class Main {

public → Access modifier (visible everywhere).

class → Keyword to define a class (blueprint/container of code).

Main → Class name (file should be Main.java).

🔹 public static void main(String[] args) {

public → JVM can access this method from anywhere.

static → Belongs to the class, no object needed.

void → Return type = nothing.

main → Special method name recognized by JVM as the starting point.

String[] args → Array of strings = command-line arguments.

🔹 System.out.println("Hello World");

System → Built-in Java class in java.lang.

out → Static variable of type PrintStream (represents console output).

println() → Prints text + moves cursor to next line.

"Hello World" → String literal printed to console.

🔹 }

First } → Ends the main method.

Second } → Ends the Main class.

3. Execution Flow

Compile: javac Main.java → Generates Main.class.

Run: java Main → JVM calls public static void main(String[] args).

Output:

Hello World
