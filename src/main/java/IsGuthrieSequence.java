public class IsGuthrieSequence {
    public static void main(String[] args){
		int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 17, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 2});
		System.out.println(result);
        result = isGuthrieSequence(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1});
		System.out.println(result);
	}

	static int isGuthrieSequence(int[] a){
        if (a[a.length-1] != 1 || a[0] <= 0)
            return 0;

        for (int index=0; index < a.length-1; index++) {
            if(a[index] % 2 == 0 && a[index] / 2 != a[index+1]){
                return 0;
            } else if(a[index] % 2 > 0 && (a[index] * 3 + 1) != a[index+1]){
                return 0;
            }
        }

        return 1;
    }
}
