/**
 * A non-empty array of length n is called an array of all possibilities, if it contains all numbers between 0 and n - 1 inclusive.
 * Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possibilities,
 * otherwise it returns 0.
 *
 * Examples:
 * {1, 2, 0, 3} is an array of all possibilities
 * {3, 2, 1, 0} is an array of all possibilities
 * {1, 2, 4, 3} is not an array of all possibilities, (because 0 not included and 4 is too big)
 * {0, 2, 3} is not an array of all possibilities, (because 1 is not included)
 * {0} is an array of all possibilities
 * {} is not an array of all possibilities (because array is empty)
 *
 */

public class AllPossibilities {

    static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        int[] temp = new int[a.length];

        System.out.println(temp);

        for (int j = 0; j < a.length; j++) {
            if (a[j] > a.length - 1 || a[j] < 0) {
                return 0;
            } else {
                temp[a[j]] = 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (temp[i] == 0) {
                return 0;
            }
        }

        return 1;
    }
}
