package baekjoon;

import java.util.Scanner;

public class b2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = 0;

		if (a == b && b == c) {
			result = 10000 + a * 1000;
		}
		if(a == b && b != c) {
			result = 1000 + a * 100;
		}
		if(a == c && a != b) {
			result = 1000 + a * 100;
		}
		if(b == c && a != b) {
			result = 1000 + b * 100;
		}
		if(a != b && b != c && a != c) {
			if(a > b) {
				if(a > c) { // a가 가장 크다.
					result = a * 100;
				}
				else { // c가 가장 크다.
					result = c * 100;
				}
			}
			else {
				if(b > c) { // b가 가장 크다.
					result = b * 100;
				}
				else { // c가 가장 크다.
					result = c * 100;
				}
			}
		}
		System.out.println(result);
	}
}
