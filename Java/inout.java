import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        
        // Read the user input
        String name = scanner.nextLine();
        
        // Display the input
        System.out.println("Hello, " + name);
        
        // Close the scanner
        scanner.close();
    }
}