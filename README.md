Error Handling in Java: Errors vs. Exceptions
Error handling in Java is essential to ensure that programs run smoothly even when unexpected issues arise. Java provides a mechanism called Exception Handling to manage runtime errors and prevent program crashes.

Errors in Java
Errors are serious problems that occur due to system-level failures. These are usually unchecked and cannot be handled by the program. Errors typically indicate problems that should not be recovered from.

Common Types of Errors:
StackOverflowError – Occurs when a function calls itself recursively without a base condition.

OutOfMemoryError – Happens when the JVM runs out of memory.

VirtualMachineError – Indicates that the JVM is in a critical state.

AssertionError – Raised when an assertion fails.



Exceptions in Java
Exceptions are issues that occur during the execution of a program. Unlike errors, exceptions can be handled using try-catch blocks.

Types of Exceptions
Checked Exceptions (Compile-time exceptions)

Must be handled using try-catch or declared using throws.

Examples: IOException, SQLException

Unchecked Exceptions (Runtime exceptions)

Occur due to programming errors.

Examples: NullPointerException, ArrayIndexOutOfBoundsException


Exception Handling in Java
Java provides four key exception-handling mechanisms:

a) Using try-catch
The try block contains the code that might throw an exception, and the catch block handles it.

java
Copy
Edit
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
