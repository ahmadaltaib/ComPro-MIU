import java.lang.Math;

public class NextPerfectSquare{
	public static void main(String[] args){
		int result = findNextPerfectSquare(6);
		System.out.println(result);
		result = findNextPerfectSquare(36);
		System.out.println(result);
		result = findNextPerfectSquare(0);
		System.out.println(result);
		result = findNextPerfectSquare(-5);
		System.out.println(result);
	}

    static int findNextPerfectSquare(int n){

        int base = (int)Math.sqrt(n) + 1;

        return (int)Math.pow(base, 2);
	}
}