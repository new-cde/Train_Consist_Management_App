import java.util.LinkedHashSet;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper"); // will be ignored automatically

        System.out.println("=== UC5 - Preserve Insertion Order of Bogies ===\n");
        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
        System.out.println("\nNote:\nLinkedHashSet preserves insertion order and removes duplicates automatically.\n ");
    }
}
