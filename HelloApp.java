public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", " using substring
            String result = nameBuilder.toString();
            if (result.length() > 0) {
                result = result.substring(0, result.length() - 2);
            }

            // Print final output
            System.out.println("Hello, " + result + "!");
        }
    }
}