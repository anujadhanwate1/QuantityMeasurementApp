import org.example.LengthUnit;
import org.junit.jupiter.api.Test;
import org.example.LengthUnit.*;
import static org.junit.jupiter.api.Assertions.*;

public class LengthUnitTest {
    @Test
    public void testFeetEquality_SameValue() {
        LengthUnit L1 = new LengthUnit(1,Length.FEET);
        LengthUnit L2 = new LengthUnit(1,Length.FEET);
        assertEquals(L1,L2);
    }
    @Test
    public void testFeetEquality_DifferentValue() {
        LengthUnit L1 = new LengthUnit(1,Length.FEET);
        LengthUnit L2 = new LengthUnit(4,Length.FEET);
        assertNotEquals(L1,L2);
    }
    @Test
    public void testInchEquality_SameValue() {
        LengthUnit L1 = new LengthUnit(1,Length.INCH);
        LengthUnit L2 = new LengthUnit(1,Length.INCH);
        assertEquals(L1,L2);
    }
    @Test
    public void testInchEquality_DifferentValue() {
        LengthUnit L1 = new LengthUnit(1,Length.INCH);
        LengthUnit L2 = new LengthUnit(5,Length.INCH);
        assertNotEquals(L1,L2);
    }
    @Test
    public void testFeetInchComparison_SameValue() {
        LengthUnit L1 = new LengthUnit(1,Length.FEET);
        LengthUnit L2 = new LengthUnit(12,Length.INCH);
        assertEquals(L1,L2);
    }
    @Test
    public void testFeetInchComparison_DifferentValue() {
        LengthUnit L1 = new LengthUnit(1,Length.FEET);
        LengthUnit L2 = new LengthUnit(5,Length.INCH);
        assertNotEquals(L1,L2);
    }

    @Test
    public void testInchEquality_SameReference() {
        LengthUnit L1 = new LengthUnit(1, Length.INCH);
        assertEquals(L1,L1);
    }

    @Test
    public void testFeetEquality_SameReference() {
        LengthUnit L1 = new LengthUnit(1, Length.FEET);
        assertEquals(L1,L1);
    }
    @Test
    public void testInchEquality_NullComparison() {
        LengthUnit L1 = new LengthUnit(1, Length.FEET);
        assertNotEquals(L1,null);
    }
    @Test
    public void testFeetEquality_NullComparison() {
        LengthUnit L1 = new LengthUnit(1, Length.FEET);
        assertNotEquals(L1,null);
    }
}
