import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllPossibilitiesTest {
    @Test
    void isAllPossibilitiesTest() {
          assertEquals(AllPossibilities.isAllPossibilities(new int[]{1, 2, 0, 3}),1);
    }

    @Test
    void isAllPossibilitiesTest1() {
        assertEquals(AllPossibilities.isAllPossibilities(new int[]{3, 2, 1, 0} ),1);
    }
    @Test
    void isAllPossibilitiesTest2() {
        assertEquals(AllPossibilities.isAllPossibilities(new int[]{1, 2, 4, 3} ), 0);
    }
    @Test
    void isAllPossibilitiesTest3() {
        assertEquals(AllPossibilities.isAllPossibilities(new int[]{0, 2, 3} ), 0);
    }
    @Test
    void isAllPossibilitiesTest4() {
        assertEquals(AllPossibilities.isAllPossibilities(new int[]{0} ),1);
    }
    @Test
    void isAllPossibilitiesTest5() {
        assertEquals(AllPossibilities.isAllPossibilities(new int[]{} ), 0);
    }
}