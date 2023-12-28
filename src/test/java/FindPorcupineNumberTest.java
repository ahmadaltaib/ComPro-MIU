import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPorcupineNumberTest {

    @Test
    void test_f1() {
        assertEquals(0, FindPorcupineNumber.findPorcupineNumber(0));
    }

    @Test
    void test_f2() {
        assertEquals(0, FindPorcupineNumber.findPorcupineNumber(8));
    }

    @Test
    void test_s1() {
        assertEquals(149, FindPorcupineNumber.findPorcupineNumber(139));
    }


    @Test
    void test_s2() {
        assertEquals(29, FindPorcupineNumber.findPorcupineNumber(19));
    }

    @Test
    void test_s3() {
        assertEquals(79, FindPorcupineNumber.findPorcupineNumber(59));
    }
}
