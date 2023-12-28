public class NUpCount{
	public static void main(String[] args){
		int result = nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
		System.out.println(result);
		result = nUpCount(new int[]{6, 3, 1}, 6);
		System.out.println(result);
		result = nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);
		System.out.println(result);
	}

	static int nUpCount(int[] a, int n){
		int sum = 0, prev_sum = 0, counter = 0;

        for (int i : a) {
            prev_sum = sum;
            sum += i;

            if (prev_sum <= n && sum > n)
                counter ++;
        }

        return counter;
	}
}