import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("=== UC8 - Filter Passenger Bogies Using Streams ===\n");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 120)); // general bogie

        // Step 2: Display original list
        System.out.println("All Bogies:\n");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Apply Stream Filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):\n");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
    }
}