import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    String type;   // Passenger or Goods
    int capacity;

    Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 60));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("General", "Passenger", 90));

        bogies.add(new Bogie("Cargo", "Goods", 1000));
        bogies.add(new Bogie("Cargo", "Goods", 1200)); // duplicate type to test grouping

        // Step 2: Group bogies by TYPE
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("   " + b);
            }
            System.out.println();
        }
    }
}