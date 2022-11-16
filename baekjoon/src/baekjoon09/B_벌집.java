package baekjoon09;

import java.util.Scanner;

public class B_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 1;
		int cnt = 1;
		
		while (true) {
			if ( n <= start ) break;
			start += 6 * (cnt-1); cnt++;
			System.out.println("start :::" + start);
		}
		System.out.println("n :::" + n);
		System.out.println("cnt :::" + cnt);
		cnt = n > 1 ? cnt - 1 : 1;
		System.out.println(cnt);
	}
}
