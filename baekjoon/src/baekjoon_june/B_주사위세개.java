package baekjoon_june;

import java.util.Scanner;

public class B_주사위세개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short A = sc.nextShort();
		short B = sc.nextShort();
		short C = sc.nextShort();
		
		if(A==B && B==C) {
			System.out.printf("%d", (10000+(A*1000)));
		} else if(A==B || B==C || A==C) {
			if(A==B || B==C) {
				System.out.printf("%d", (1000+(B*100)));
			} else if(A==C) {
				System.out.printf("%d", (1000+(A*100)));
			}
		} else if(A!=B && B!=C) {
			if(A>B && A>C) {
				System.out.printf("%d", (A*100));
			} else if(B>C && B>A) {
				System.out.printf("%d", (B*100));
			} else if(C>A && C>B) {
				System.out.printf("%d", (C*100));
			}
		}
		
	}
}
