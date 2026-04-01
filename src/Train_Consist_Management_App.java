import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie count: " + trainConsist.size());

        System.out.println("Current train consist: " + trainConsist);
    }
}
