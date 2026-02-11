import org.example.QuantityMeasurement;
import org.junit.jupiter.api.Test;
import org.example.QuantityMeasurement.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {
    @Test
    public void testFeetEquality_SameValue() {
        Feet F1 = new Feet(1.0);
        Feet F2 = new Feet(1.0);
        assertTrue(F1.equals(F2));
    }
    @Test
    public void testFeetEquality_DifferentValue() {
        Feet F1 = new Feet(1.0);
        Feet F2 = new Feet(2.0);
        assertFalse(F1.equals(F2));
    }
    @Test
    public void testFeetEquality_NullComparison() {
        Feet F1 = new Feet(1.0);
        assertFalse(F1.equals(null));
    }
    @Test
    public void testFeetEquality_Nonnumeric() {
        Feet F1 = new Feet(1.0);
        assertFalse(F1.equals("one"));
    }
    @Test
    public void testFeetEquality_SameReference() {
        Feet F1 = new Feet(1.0);
        assertTrue(F1.equals(F1));
    }

    @Test
    public void testInchEquality_SameValue() {
        Inch F1 = new Inch(1.0);
        Inch F2 = new Inch(1.0);
        assertTrue(F1.equals(F2));
    }
    @Test
    public void testInchEquality_DifferentValue() {
        Inch F1 = new Inch(1.0);
        Inch F2 = new Inch(2.0);
        assertFalse(F1.equals(F2));
    }
    @Test
    public void testInchEquality_NullComparison() {
        Inch F1 = new Inch(1.0);
        assertFalse(F1.equals(null));
    }
    @Test
    public void testInchEquality_Nonnumeric() {
        Inch F1 = new Inch(1.0);
        assertFalse(F1.equals("one"));
    }
    @Test
    public void testInchEquality_SameReference() {
        Inch F1 = new Inch(1.0);
        assertTrue(F1.equals(F1));
    }

}
