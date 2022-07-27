package baekjoon;

import java.util.Scanner;

public class baekjoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m >= 45) {
			m = m - 45;
		}
		else if (m < 45) {
			m = m + 60 - 45; // 시간을 빌려온다.
			if (h != 0) {
				h = h - 1;
			} else {
				h = 23;
			}
		}
		System.out.println(h + " " + m);
	}
}
