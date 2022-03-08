package baekjoon;

import java.util.Scanner;

public class backjoon2882_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if (minute < 45) {
			hour--;
			minute = 60 - (45-minute);
			
			if (hour < 0) {
				hour = 24;
			}
			System.out.println(hour + " " + minute);
		}else {
			System.out.println(hour + " " + (minute-45));
		}
	}
}
