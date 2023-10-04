import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPorcupineNumberTest {

    @Test
    void test() {
        assertEquals(139, FindPorcupineNumber.findPorcupineNumber(0));
    }

    @Test
    void test1() {
        assertEquals(139, FindPorcupineNumber.findPorcupineNumber(30));
    }


    @Test
    void test2() {
        assertEquals(139, FindPorcupineNumber.findPorcupineNumber(138));
    }

    @Test
    void test3() {
        assertEquals(409, FindPorcupineNumber.findPorcupineNumber(139));
    }
}
