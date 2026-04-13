# UC7: Display "Hello" with Multiple Command-Line Arguments using String.join()

## 📌 Description
This Java application accepts zero or more command-line arguments and prints a greeting message.

- If no arguments → "Hello, World!"
- If arguments are provided → "Hello, <names>!"

This implementation uses the **String.join()** method for efficient and clean string concatenation.

---

## ⚙️ Features
- Uses built-in String.join() method
- No loops required
- Automatic delimiter handling
- Default fallback message

---

## 💻 Code

```java
public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String names = String.join(", ", args);

        System.out.println("Hello, " + names + "!");
    }
}