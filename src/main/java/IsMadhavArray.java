/**
 * A Madhav array has the following property.
 *      a[0] =4 a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
 *      The length of a Madhav array must be n*(n+1)/2 for some n.
 * Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array, otherwise it returns 0.
 *
 * Examples
 * IF input is										  return				reason
 * {2, 1, 1} 											1 					2 = 1 + 1
 * {2, 1, 1, 4, -1, -1} 								1 					2 = 1 + 1, 2 = 4 + -1 + -1
 * {6, 2, 4, 2, 2, 2, 1, 5, 0, 0} 						1 					6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0
 * {18, 9, 10, 6, 6, 6} 								0 					18 != 9 + 10
 * {-6, -3, -3, 8, -5, -4} 								0 					-6 != 8 + -5 + -4
 * {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,1, -2, -1}		1 					0 = 0 + 0, 0 = 0 + 0 + 0, 0 = 0 + 0 + 0 + 0, 0 = 1 + 1 + 1 + -2 + -1
 * {3, 1, 2, 3, 0} 										0 					The length of the array is 5, but 5 does not equal n*(n+1)/2 for any value of n.
 */

class IsMadhavArray {
	static int isMadhavArrayChecker(int[ ] a) {

		if(isMadhavArrayLength(a)) {
			return 0;
		}

		int i = 1, counter = 2;
		while (i < a.length) {

			int sum = 0;
			for (int j = 0; j < counter; j++, i++) {
				sum += a[i];
			}

			if (sum != a[0]) {
				return 0;
			}

			if (i == a.length) {
				if (counter*(counter+1)/2 == a.length) {
					return 1;
				}
			} else {
				counter++;
				if ((i+counter) > a.length) {
					return 0;
				}
			}
		}

		return 1;
	}

	static boolean isMadhavArrayLength(int[ ] a){
		for (int i=0; i < a.length; i++) {
			if(a[i] == a.length*(a.length+1)/2 ) {
				return true;
			}
		}

		return false;
	}
}