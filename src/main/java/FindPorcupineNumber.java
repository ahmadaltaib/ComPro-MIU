/**
 * A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9 and the next prime number that follows it also ends with the digit 9.
 * For example 139 is a porcupine number because:
 *      a. it is prime
 *      b. it ends in a 9
 *      c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149 is the next prime number after 139.
 *
 * Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is greater than n.
 * So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would findPorcupineNumber(138).
 * But findPorcupineNumber(139) would return 409 which is the second porcupine number.
 *
 * You may assume that:
 *  - A porcupine number greater than n exists.
 *  - A function isPrime exists that returns 1 if its argument is prime, otherwise it returns 0. E.G., isPrime(7) returns 1 and isPrime(8) returns 0.
 *
 * Hint: Use modulo base 10 arithmetic to get last digit of a number.
 */
class FindPorcupineNumber {
    static int findPorcupineNumber(int n) {

        if (!validateInput(n))
            return 0;

        return findNextPrime(n);
    }

    static boolean validateInput(int n) {
        return (isPrimeNumber(n) && (n % 10 == 9))? true : false;
    }

    static int findNextPrime(int n) {
        int x = n;

        while (true) {
            x++;
            if (isPrimeNumber(x) && (x % 10 == 9))
                return x;
        }
    }

    static boolean isPrimeNumber(int n) {
		if(n <= 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
