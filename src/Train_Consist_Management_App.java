import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        // Create HashSet for storing bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        // Display final unique bogie IDs
        System.out.println("=== Train Consist - Unique Bogie IDs ===\n");
        System.out.println("Bogie IDs After Insertion:\n" + bogieIds);

        System.out.println("\nNote:\nDuplicates are automatically ignored by HashSet.\n");
        System.out.println("UC3 uniqueness validation completed...");
    }
}
