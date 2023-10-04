/**
 * Define a square pair to be the tuple <x, y> where:
 * - x and y are positive,
 * - non-zero integers,
 * - x < y and x + y is a perfect square.
 *
 * A perfect square is an integer whose square root is also an integer, e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not.
 * Write a function named countSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the array.
 *
 * You may assume that:
 * - There exists a function named isPerfectSquare that returns true if its argument is a perfect square and false otherwise.
 *      E.G., isPerfectSquare(4) returns true and isPerfectSquare(8) returns false.
 * - There are no duplicate values in the array,
 *      i.e, you don't have to deal with an array like {2, 7, 2, 2}.
 *
 * Examples:
 * Input                return              reason
 * {9, 0, 2, -5, 7}	      2	                The square pairs are <2, 7> and <7, 9>. Note that <-5, 9> and <0, 9> are not square pairs, even though they sum to perfect squares,
 *                                          because both members of a square pair have to be greater than 0.
 *                                          Also, <7,2> and <9,7> are not square pairs because the first number has to be less than the second number.
 *
 * {9}	                  0             	The array must have at least 2 elements
 *
 * {11, 5, 4, 20}         3                 because the only square pairs that can be constructed from those numbers are <5, 11>, <5, 20> and <4, 5>.
 */
public class CountSquarePairs {
    static int countSquarePairs(int[] a){
        int countSquarePairs = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] > 0 && a[j] > 0){
                    if(a[i] < a[j]){
                        if(isPerfectSquare(a[i] + a[j])){
                            countSquarePairs ++;
                        }
                    }
                }
            }
        }

        return countSquarePairs;
    }

    static boolean isPerfectSquare(int element){
        boolean isPerfectSquare = false;
        if(element >= 0){
            double sqrtResult = Math.sqrt(element);
            int base = (int) sqrtResult;
            if((sqrtResult - base) == 0){
                isPerfectSquare = true;
            }
        }

        return isPerfectSquare;
    }
}
