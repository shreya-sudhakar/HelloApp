public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Check if no arguments are provided
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            message = "Hello, " + names.toString() + "!";
        }

        // Display output
        System.out.println(message);
    }
}