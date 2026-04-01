import java.util.HashMap;
import java.util.Map;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Add bogie-capacity mappings
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        System.out.println("=== UC6 - MAp Bogie to Capacity (HashMap) ===\n");
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
