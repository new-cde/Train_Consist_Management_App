import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

            // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);
        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Check existence of Sleeper
        System.out.println("Checking if 'Sleeper' exists:");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Contains Sleeper? : true");
        } else {
            System.out.println("Contains Sleeper? : false");
        }

        // Final list state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
    }
}
