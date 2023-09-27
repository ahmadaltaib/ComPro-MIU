import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMadhavArrayTest {

    @Test
    void isMadhavArrayTest() {
        assertEquals(1, IsMadhavArray.isMadhavChecker(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        assertEquals(1, IsMadhavArray.isMadhavChecker(new int[] {2, 1, 1}));
        assertEquals(1, IsMadhavArray.isMadhavChecker(new int[] {2, 1, 1, 4, -1, -1}));
        assertEquals(0, IsMadhavArray.isMadhavChecker(new int[] {18, 9, 10, 6, 6, 6}));
        assertEquals(0, IsMadhavArray.isMadhavChecker(new int[] {-6, -3, -3, 8, -5, -4}));
        assertEquals(1, IsMadhavArray.isMadhavChecker(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, - 1}));
        assertEquals(1, IsMadhavArray.isMadhavChecker(new int[] {3, 1, 2, 3, 0, 0}));
    }
}
