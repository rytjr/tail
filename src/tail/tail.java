package tail;

import java.util.Scanner;

public class tail {
	
	static Integer[] arr;
	static int Num;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Num = sc.nextInt();
		
		arr = new Integer[Num + 2];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		System.out.print(dp(Num));
	}
	
	public static int dp(int num) {
		
		if(arr[num] == null) {
			arr[num] = (dp(num - 1) + dp(num - 2)) % 15746;
		}
		
		return arr[num];
	}
}