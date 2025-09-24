import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		/* test comment */
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Project Brainstorming!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an idea");
            System.out.println("2. View ideas");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter your idea: ");
                    String idea = scanner.nextLine();
                    // For now we just print it, you can later save to a list or file
                    System.out.println("Idea added: " + idea);
                    break;
                case "2":
                    System.out.println("Feature to view ideas coming soon!");
                    break;
                case "3":
                    running = false;
                    System.out.println("Exiting brainstorming session. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();
    }
}

