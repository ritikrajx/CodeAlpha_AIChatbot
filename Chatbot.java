import java.util.Scanner;

public class Chatbot {
    private final ResponseEngine responseEngine;

    public Chatbot() {
        responseEngine = new ResponseEngine();
    }

    public void start() {
        System.out.println("==================================");
        System.out.println("        JAVA AI CHATBOT");
        System.out.println("==================================");
        System.out.println("Hello! I can answer basic questions about Java, OOP,");
        System.out.println("programming, and this internship project.");
        System.out.println("Type 'help' to see examples, or 'bye' to exit.");
        System.out.println();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("You: ");
                if (!scanner.hasNextLine()) {
                    System.out.println("\\nBot: Goodbye!");
                    break;
                }

                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("bye")
                        || input.equalsIgnoreCase("exit")
                        || input.equalsIgnoreCase("quit")) {
                    System.out.println("Bot: Goodbye! Have a great day.");
                    break;
                }

                System.out.println("Bot: " + responseEngine.getResponse(input));
                System.out.println();
            }
        }
    }
}
