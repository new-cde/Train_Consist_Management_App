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

        System.out.println("=== UC10 - Total Seating Capacity Using reduce() ===\n");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 120));

        // Step 2: Display bogies
        System.out.println("Train Bogies:\n");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Calculate total using reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 4: Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}