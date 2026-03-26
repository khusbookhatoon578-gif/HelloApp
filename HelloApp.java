public class HelloApp {
    public static void main(String[] args) {
        
        String message;

        // Check if any command-line arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default message
            message = "Hello, World!";
        }

        // Display the greeting
        System.out.println(message);
    }
}