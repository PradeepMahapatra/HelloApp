public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join names using StringBuilder
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            // Add comma only if not last element
            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }

        // Print final greeting
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}
