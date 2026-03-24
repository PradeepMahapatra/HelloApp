public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments provided
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            if (i > 0) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(args[i]);
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}
