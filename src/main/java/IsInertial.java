/**
 * An array is defined to be inertial if the following conditions hold:
 * a. it contains at least one odd value (hasOddNumber)
 * b. the maximum value in the array is even (isMaxIsEven)
 * c. every odd value is greater than every even value that is not the maximum value. (2nd max even < min Odd)
 * So {11, 4, 20, 9, 2, 8} is inertial because
 * a. it contains at least one odd value
 * b. the maximum value in the array is 20 which is even
 * c. the two odd values (11 and 9) are greater than all the even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
 *
 * However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c),
 * i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
 *
 * Write a function called isIntertial that accepts an integer array and returns 1 if the array is inertial; otherwise it returns 0.
 * Some examples:
 *
 * input array			return		reason
 * {1}						0		fails condition (a) - the maximum value must be even
 * {2}						0		fails condition (b) - the array must contain at least one odd value.
 * {1, 2, 3, 4} 			0		fails condition (c) - 1 (which is odd) is not greater than all even values other than the maximum (1 is less than 2 which is not the maximum)
 * {1, 1, 1, 1, 1, 1, 2} 	1		there is no even number other than the maximum. Hence, there can be no other even values  that are greater than 1.
 * {2, 12, 4, 6, 8, 11}		1		11, the only odd value is greater than all even values except 12 which is the maximum value in the array.
 * {2, 12, 12, 4, 6, 8, 11}	1		same as previous, i.e., it is OK if maximum value occurs more than once.
 * {-2, -4, -6, -8, -11}	0		-8, which is even, is not the maximum value but is greater than -11 which is odd
 * {2, 3, 5, 7}				0		the maximum value is odd
 * {2, 4, 6, 8, 10}			0	there is no odd value in the array.
 */

class IsInertial {
	static int isInertial(int[] a) {
		
		if (a == null || a.length == 0) {
			return 0;
		}
		
		int max = a[0];
		int[] odds = new int[a.length];
		int[] evens = new int[a.length];
		int oddIndex = 0, evenIndex = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
			
			if(a[i] % 2 == 0)
			{
				evens[evenIndex] = a[i];
				evenIndex++;
			} else {
				odds[oddIndex] = a[i];
				oddIndex++;
			}
		}

		if(max % 2 != 0 || oddIndex == 0)
			return 0;
		
		for (int i = 0; i < oddIndex; i++) {
			for (int j = 0; j < evenIndex; j++) {
				if(odds[i] < evens[j] && evens[j] != max)
					return 0;
			}
		}
		
		return 1;
	}

	static int isInertialArr(int[] a) {
		boolean hasOddNumber = false;
		int minOddNumber = Integer.MAX_VALUE;
		int maxOddNumber = Integer.MIN_VALUE;
		int maxEvenNumber = Integer.MIN_VALUE;
		int secondMaxEvenNumber = Integer.MIN_VALUE;

		for(Integer num : a) {
			if (num%2 != 0) {
				hasOddNumber = true;
				minOddNumber = (num<minOddNumber)? num : minOddNumber;
				maxOddNumber = (num>maxOddNumber)? num : maxOddNumber;
			} else if (num > maxEvenNumber) {
				secondMaxEvenNumber = maxEvenNumber;
				maxEvenNumber = num ;
			} else if (num > secondMaxEvenNumber && num != maxEvenNumber) {
				secondMaxEvenNumber = num ;
			}

		}

		if (hasOddNumber && (maxEvenNumber > maxOddNumber) && (minOddNumber > secondMaxEvenNumber))
			return 1;

		return 0;

	}

}
