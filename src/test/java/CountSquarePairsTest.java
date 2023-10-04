import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSquarePairsTest {
    @Test
    void test() {
        assertEquals(2, CountSquarePairs.countSquarePairs(new int[] {9, 0, 2, -5, 7}));
    }

    @Test
    void test1() {
        assertEquals(0, CountSquarePairs.countSquarePairs(new int[] {9}));
    }

    @Test
    void test2() {
        assertEquals(2, CountSquarePairs.countSquarePairs(new int[] {5, 20, 4, 0}));
    }

    @Test
    void test3() {
        assertEquals(3, CountSquarePairs.countSquarePairs(new int[] {11, 5, 4, 20}));
    }

    @Test
    void test4() {
        assertEquals(2, CountSquarePairs.countSquarePairs(new int[] {9, 0, 2, -5, 7}));
    }


}