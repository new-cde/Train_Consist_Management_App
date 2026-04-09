import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

class BogieTest {

    Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
    Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

    // 1. Valid Train ID
    @Test
    void testRegex_ValidTrainID() {
        assertTrue(trainPattern.matcher("TRN-1234").matches());
    }

    // 2. Invalid Train ID
    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(trainPattern.matcher("TRAIN12").matches());
        assertFalse(trainPattern.matcher("TRN12A").matches());
        assertFalse(trainPattern.matcher("1234-TRN").matches());
    }

    // 3. Valid Cargo Code
    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(cargoPattern.matcher("PET-AB").matches());
    }

    // 4. Invalid Cargo Code
    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(cargoPattern.matcher("PET-ab").matches());
        assertFalse(cargoPattern.matcher("PET123").matches());
        assertFalse(cargoPattern.matcher("AB-PET").matches());
    }

    // 5. Digit length validation
    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(trainPattern.matcher("TRN-123").matches());
        assertFalse(trainPattern.matcher("TRN-12345").matches());
    }
}