package baekjoon08;

import java.util.Scanner;

public class B_117420_숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String inputs = sc.next();
		sc.close();
		
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += inputs.charAt(i) - '0';
		}
		System.out.println(result);
	}

}
