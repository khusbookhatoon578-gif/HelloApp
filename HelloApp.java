public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments → print default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Case 2: Arguments exist → build names using StringBuilder
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print final greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}