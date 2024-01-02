public class StantonMeasure {
    public static void main(String[] args){
		int result = stantonMeasure(new int[] {1});
		System.out.println(result);
		result = stantonMeasure(new int[] {0});
		System.out.println(result);
		result = stantonMeasure(new int[] {3, 1, 1, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {});
		System.out.println(result);
	}

    static int stantonMeasure(int[] a){
        int nCounter = 0;

        int oneCounter = 0;
        for (Integer num : a) {
            if (num == 1)
                oneCounter++;
        }

        for (Integer num : a) {
            if (num == oneCounter)
                nCounter++;
        }
        
        return nCounter;
    }
}
