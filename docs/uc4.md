# UC4: Display "Hello" with Multiple Command-Line Arguments

## 📌 Description
This application accepts multiple names as command-line arguments and displays a personalized greeting.

If no arguments are provided, it defaults to:
Hello, World!

---

## 🚀 Features
- Accepts multiple names
- Displays a single greeting message
- Uses default value when no input is given

---

## ⚙️ How It Works

1. Program starts execution
2. Checks if command-line arguments exist
3. If yes:
   - Reads all names
   - Joins them with commas
4. If no:
   - Uses "World" as default
5. Prints greeting

---

## 🧠 Concepts Used
- Command-line arguments (`args[]`)
- Conditional statements (`if-else`)
- Looping (optional)
- String joining (`String.join()`)
- String handling

---

## 💻 Code Example

```java
public class HelloApp {
    public static void main(String[] args) {
        String message;

        if (args.length > 0) {
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
    }
}