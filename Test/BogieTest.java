import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class BogieTest {

    private List<Bogie> createData(int size) {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Bogie("B" + i, i % 120));
        }
        return list;
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> data = createData(100);

        List<Bogie> result = new ArrayList<>();
        for (Bogie b : data) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        for (Bogie b : result) {
            assertTrue(b.capacity > 60);
        }
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> data = createData(100);

        List<Bogie> result = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : result) {
            assertTrue(b.capacity > 60);
        }
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> data = createData(1000);

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : data) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> data = createData(1000);

        long start = System.nanoTime();
        data.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());
        long end = System.nanoTime();

        assertTrue(end - start > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> data = createData(100000);

        List<Bogie> result = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}