package baekjoon09;

import java.util.Scanner;

public class B_심부름_가는길 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		for (int i = 0; i < 4; i++) {
			result += sc.nextInt();
		}
		
		int min = result / 60;
		int sec = result % 60;
		
		System.out.println(min);
		System.out.println(sec);
	}
}
