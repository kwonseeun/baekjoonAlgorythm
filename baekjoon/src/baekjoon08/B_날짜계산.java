package baekjoon08;

import java.util.Scanner;

public class B_날짜계산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt(), s = scan.nextInt(), m = scan.nextInt();
		
		int year = 0;
		while(true) {
			year++;
			if((year-e)%15 == 0 && (year-s)%28 == 0 && (year-m)%19 == 0) break;
		}
		System.out.print(year);
	}
}
