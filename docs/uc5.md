# UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop

## 📌 Description
This application accepts zero or more command-line arguments and displays a greeting.

- If names are provided → displays all names
- If no names → defaults to "Hello, World!"

---

## 🚀 Features
- Uses enhanced for loop (for-each loop)
- Handles multiple inputs efficiently
- Provides default output when no input is given
- Clean and readable implementation

---

## ⚙️ How It Works

1. Program starts
2. Checks if arguments are provided
3. If no arguments:
   - Displays "Hello, World!"
4. If arguments exist:
   - Iterates using enhanced for loop
   - Builds comma-separated names
5. Prints greeting

---

## 🧠 Concepts Used

- Command-line arguments (`args[]`)
- Enhanced for loop (`for-each`)
- Conditional statements (`if-else`)
- StringBuilder
- Array length check (`args.length`)
- String concatenation

---

## 💻 Code Example

```java
public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            message = "Hello, " + names.toString() + "!";
        }

        System.out.println(message);
    }
}