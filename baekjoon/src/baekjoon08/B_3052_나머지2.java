package baekjoon08;

import java.util.Scanner;

public class B_3052_나머지2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt() % 42;
		}
		
		for (int i = 0; i < 10; i++) {
			int tmp = 0;
			for (int j = i+1; j < 10; j++) {
				
				if (num[i] == num[j]) {
					tmp ++;
				}
			}
			if (tmp == 0) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}
