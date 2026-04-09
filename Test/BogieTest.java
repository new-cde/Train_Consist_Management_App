import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

class BogieTest  {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Helper method → FILTER LOGIC (IMPORTANT)
    private List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    // TEST 1: Capacity > threshold
    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("General", 120),
                new Bogie("AC Chair", 56)
        );

        List<Bogie> result = filterBogies(list);

        assertEquals(2, result.size());
    }

    // TEST 2: Capacity equal to threshold (60 should NOT come)
    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("AC Chair", 60)
        );

        List<Bogie> result = filterBogies(list);

        assertTrue(result.isEmpty());
    }

    // TEST 3: Capacity less than threshold
    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First Class", 24)
        );

        List<Bogie> result = filterBogies(list);

        assertTrue(result.isEmpty());
    }

    // TEST 4: Multiple matching bogies
    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("General", 120),
                new Bogie("AC Chair", 56)
        );

        List<Bogie> result = filterBogies(list);

        assertEquals(2, result.size());
    }

    // TEST 5: No bogies match
    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First Class", 24),
                new Bogie("AC Chair", 56)
        );

        List<Bogie> result = filterBogies(list);

        assertTrue(result.isEmpty());
    }
}
