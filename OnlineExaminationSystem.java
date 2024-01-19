import java.util.Scanner;

public class OnlineExaminationSystem {
    private static String username;
    private static String password;
    private static int selectedOption;
    private static int timer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        login(scanner);

        // Update Profile and Password
        updateProfileAndPassword(scanner);

        // Selecting answers for MCQs
        selectAnswersForMCQs(scanner);

        // Timer and auto-submit
        startTimer(10); // Set timer duration in seconds

        // Closing session and Logout
        closeSessionAndLogout(scanner);

        scanner.close();
    }

    private static void login(Scanner scanner) {
        System.out.println("===== Login =====");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        // Add authentication logic here (e.g., check credentials in a database)
        System.out.println("Login successful!\n");
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("===== Update Profile and Password =====");
        System.out.print("Enter new password: ");
        password = scanner.nextLine();
        // Add logic to update profile information
        System.out.println("Profile and password updated successfully!\n");
    }

    private static void selectAnswersForMCQs(Scanner scanner) {
        System.out.println("===== Select Answers for MCQs =====");
        System.out.println("1. Option A");
        System.out.println("2. Option B");
        System.out.println("3. Option C");
        System.out.println("4. Option D");
        System.out.print("Select your answer (1-4): ");
        selectedOption = scanner.nextInt();
        // Add logic to process selected MCQ answer
        System.out.println("Answer selected: " + selectedOption + "\n");
    }

    private static void startTimer(int durationInSeconds) {
        System.out.println("===== Timer =====");
        timer = durationInSeconds;
        while (timer > 0) {
            System.out.println("Time remaining: " + timer + " seconds");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer--;
        }
        System.out.println("Time's up! Auto-submitting...\n");
        // Add logic for auto-submit
    }

    private static void closeSessionAndLogout(Scanner scanner) {
        System.out.println("===== Closing Session and Logout =====");
        // Add logic to close the session and log out
        System.out.println("Session closed. Logged out successfully!");
    }
}
