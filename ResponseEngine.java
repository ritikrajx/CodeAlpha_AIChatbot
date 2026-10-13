import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class ResponseEngine {
    private final Map<String, String> responses = new LinkedHashMap<>();

    public ResponseEngine() {
        add("hello", "Hello! How can I help you?");
        add("hi", "Hi! What would you like to know?");
        add("hey", "Hey! Ask me a question about Java or programming.");
        add("how are you", "I am working well. Thanks for asking!");
        add("your name", "My name is Java AI Chatbot.");
        add("who are you", "I am a simple rule-based chatbot made using Java.");
        add("what is java", "Java is a high-level, class-based, object-oriented programming language.");
        add("java", "Java is used to build many kinds of applications and runs on the Java Virtual Machine (JVM).");
        add("what is oops", "OOP stands for Object-Oriented Programming. It organizes programs using classes and objects.");
        add("oops", "The four common OOP principles are encapsulation, inheritance, polymorphism, and abstraction.");
        add("what is a class", "A class is a blueprint used to create objects.");
        add("what is an object", "An object is an instance of a class.");
        add("what is scanner", "Scanner is a Java class commonly used to read input, such as keyboard input.");
        add("what is loop", "A loop repeats a block of code while a condition or iteration rule allows it.");
        add("what is if else", "if-else lets a program choose between different actions based on a condition.");
        add("what is programming", "Programming means writing instructions that a computer can execute.");
        add("what is chatbot", "A chatbot is a program that interacts with a user through messages.");
        add("how does this project work", "I normalize your message, look for known keywords, and return a predefined response.");
        add("what is nlp", "NLP means Natural Language Processing. This project uses basic text normalization and keyword matching, not advanced NLP.");
        add("what is rule based", "A rule-based chatbot uses predefined conditions or keywords to choose its responses.");
        add("what is ai", "Artificial Intelligence is a field focused on creating systems that perform tasks associated with human intelligence.");
        add("internship", "This project is a simple Java chatbot suitable for demonstrating basic OOP, input handling, and rule-based responses.");
        add("features", "My features include greetings, basic Java/OOP FAQs, keyword matching, help, and exit commands.");
        add("help", "Try: hello, what is Java, what is OOP, what is a class, what is NLP, features, or bye.");
        add("thank you", "You are welcome! Feel free to ask another question.");
        add("thanks", "You are welcome!");
        add("good morning", "Good morning! What would you like to learn today?");
        add("good night", "Good night! See you next time.");
    }

    private void add(String keyword, String response) {
        responses.put(normalize(keyword), response);
    }

    private String normalize(String text) {
        return text.toLowerCase(Locale.ROOT)
                   .replaceAll("[^a-z0-9\\\\s]", " ")
                   .replaceAll("\\\\s+", " ")
                   .trim();
    }

    public String getResponse(String userInput) {
        String message = normalize(userInput);

        if (message.isEmpty()) {
            return "Please type a message so I can try to help.";
        }

        // Prefer longer phrases first, so "what is java" wins over "java".
        String bestMatch = null;
        for (String keyword : responses.keySet()) {
            if (containsPhrase(message, keyword)
                    && (bestMatch == null || keyword.length() > bestMatch.length())) {
                bestMatch = keyword;
            }
        }

        if (bestMatch != null) {
            return responses.get(bestMatch);
        }

        return "Sorry, I don't know that yet. Type 'help' to see topics I can answer.";
    }

    private boolean containsPhrase(String message, String keyword) {
        return (" " + message + " ").contains(" " + keyword + " ");
    }
}

