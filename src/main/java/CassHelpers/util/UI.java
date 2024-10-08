package CassHelpers.util;

/**
 * The UI class handles user interface interactions by providing methods for displaying messages, help instructions, and task-related prompts.
 * It also includes methods to print introduction art and error messages.
 */
public class UI {

    protected final static int SEPARATOR_LENGTH = 100;

    /**
     * Draws a line of dashes to visually separate sections in the UI.
     */
    public void drawLine() {
        for (int i = 0; i < SEPARATOR_LENGTH; i += 1) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Displays the introductory ASCII art for the Cassandra application.
     */
    public void displayIntroductionArt() {
        System.out.println("   ___                                               _                   ");
        System.out.println("  / __|   __ _     ___     ___    __ _    _ _     __| |     _ _   __ _   ");
        System.out.println(" | (__   / _` |   (_-<    (_-<   / _` |  | ' \\   / _` |    | '_| / _` |  ");
        System.out.println("  \\___|  \\__,_|   /__/_   /__/_  \\__,_|  |_||_|  \\__,_| " + "  _|_|_  \\__,_|  ");
        System.out.println("_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|" +
                "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| ");
        System.out.println("`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
    }

    /**
     * Displays the introduction section, including a separator, ASCII art, and a welcome message for the Cassandra app.
     */
    public void displayIntroduction() {
        drawLine();
        displayIntroductionArt();
        drawLine();
        System.out.println(" Hello! I'm Cassandra");
        System.out.println(" What can I do for you?");
        drawLine();
    }

    /**
     * Displays help instructions to guide users on the available commands in the Cassandra app.
     * It explains how to add tasks, list them, mark/unmark tasks, and other key features.
     */
    public void displayHelpInstructions() {
        System.out.println("Welcome to Cassandra - Your Task Manager App!");
        System.out.println("Here are the commands you can use:");

        System.out.println("\n1. Add a Todo Task:");
        System.out.println("   todo <task_description>");
        System.out.println("   Example: todo Read a book");

        System.out.println("\n2. Add a Deadline Task:");
        System.out.println("   deadline <task_description> /by <due_date>");
        System.out.println("   Example: deadline Submit assignment /by 2024-09-15");

        System.out.println("\n3. Add an Event Task:");
        System.out.println("   event <event_description> /from <start_date> /to <end_date>");
        System.out.println("   Example: event Team meeting /from 2024-09-15 1400 /to 2024-09-15 1600");

        System.out.println("\n4. List All Tasks:");
        System.out.println("   list");
        System.out.println("   Displays all tasks currently in your list.");

        System.out.println("\n5. Mark a Task as Complete:");
        System.out.println("   mark <task_index>");
        System.out.println("   Example: mark 2");

        System.out.println("\n6. Unmark a Task (set as incomplete):");
        System.out.println("   unmark <task_index>");
        System.out.println("   Example: unmark 2");

        System.out.println("\n7. Find Tasks with similar Descriptions:");
        System.out.println("   find <prompt>");
        System.out.println("   Example: find book");

        System.out.println("\n8. Exit the App:");
        System.out.println("   bye");
        System.out.println("   Exits the application.");

        System.out.println("\nNote:");
        System.out.println(" - Task indices start from 1.");
        System.out.println(" - Date Format : dd-mm-yyyy or dd-mm-yyyy HHmm format or <day-of-the-week> or next <day-of-the-week> (works with HHmm)");
    }

    /**
     * Displays an error message for exceptions caught during application runtime.
     *
     * @param e The exception that occurred.
     */
    public void showError(Exception e) {
        System.out.println(e.getMessage());
    }
}
