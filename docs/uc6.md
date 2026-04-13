# UC6: Display "Hello" with Multiple Command-Line Arguments using substring()

## 📌 Description
This Java program accepts zero or more command-line arguments and prints a greeting.

- If no arguments → "Hello, World!"
- If arguments are given → "Hello, <names>!"

It uses:
- Enhanced for loop
- StringBuilder
- substring() method to remove trailing delimiter

---

## ⚙️ Features
- Handles multiple inputs
- Cleaner delimiter handling using substring()
- Default fallback message
- Efficient string construction

---

## 💻 Code

```java
public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        System.out.println("Hello, " + names + "!");
    }
}