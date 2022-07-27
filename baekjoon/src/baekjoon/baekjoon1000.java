package baekjoon;

import java.util.Scanner;

// 14681번 
public class baekjoon1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // x 좌표 
		int y = sc.nextInt(); // y 좌표 
		
		if ( x > 0 && y > 0 ) {
			System.out.println("1");
		} else if(x < 0 && y > 0  ) {
			System.out.println("2");
		}else if(x < 0 && y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}
}
