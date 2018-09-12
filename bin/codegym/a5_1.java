package codegym;

import java.util.Arrays;

public class a5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2};
		//int[] num2 = Arrays.copyOf(num1, 2);		
		int[] num2 = Arrays.copyOf(num1, num1.length);
		num2[1] = 3;
		System.out.println(num1[1]);
		
		int[]x[] = {{1,2},{3,4,5},{6,7,8,9}};
		int[][]y = x;
		System.out.println(y[2][1]);
		
	}

}
