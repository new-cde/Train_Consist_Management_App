import java.util.*;

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

        System.out.println("=== UC7 - Sort Bogies by Capacity (Comparator) ===\n");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add ALL bogies (Passenger + General)
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 120)); // General

        // Step 3: BEFORE SORTING
        System.out.println("Before Sorting:\n");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Sort by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: AFTER SORTING
        System.out.println("\nAfter Sorting By Capacity:\n");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}