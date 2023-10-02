import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCountTest {

    @Test
    void primeCount() {
        assertEquals(PrimeCount.primeCount(10, 30), 6);
        assertEquals(PrimeCount.primeCount(11, 29), 6);
        assertEquals(PrimeCount.primeCount(20, 22), 0);
        assertEquals(PrimeCount.primeCount(1, 1), 0);
        assertEquals(PrimeCount.primeCount(5, 5), 1);
        assertEquals(PrimeCount.primeCount(6, 2), 0);
        assertEquals(PrimeCount.primeCount(-10, 6), 3);
    }
}