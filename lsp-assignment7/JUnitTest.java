import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest implements AverageStrategy {

    @Test
    @DisplayName("Test Case 1 for Compute1")
    void TestCompute1 () throws EmptyListException {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(80);
        list.add(70);
        list.add(100);
        list.add(100);
        System.out.println("The Grade average of these grades is " + AverageStrategy.compute1(list)+"%");
        System.out.println();
        assertTrue(AverageStrategy.compute1(list)==90);
    }

    @Test
    @DisplayName("Test Case 1 for Compute2")
    void TestCompute2 () throws EmptyListException {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(80);
        list.add(70);
        list.add(100);
        list.add(100);
        System.out.println("If we drop the lowest 2 scores, the grade average is now  "
                + AverageStrategy.compute2(list)+"%");
        System.out.println();
        assertEquals(100, AverageStrategy.compute2(list));
    }

    @Test
    @DisplayName("Test Case 2 for Compute1")
    void TestCompute3 () throws EmptyListException {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(75);
        list.add(86);
        list.add(42);
        list.add(100);
        System.out.println("The Grade average of these grades is " + AverageStrategy.compute1(list)+"%");
        System.out.println();
        assertEquals(80, AverageStrategy.compute1(list));
    }

    @Test
    @DisplayName("Test Case 2 for Compute2")
    void TestCompute4 () throws EmptyListException {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(75);
        list.add(86);
        list.add(42);
        list.add(100);
        System.out.println("If we drop the lowest 2 scores, the grade average is now  "
                + AverageStrategy.compute2(list)+"%");
        System.out.println();
        assertEquals(AverageStrategy.compute2(list),95);
    }
}
