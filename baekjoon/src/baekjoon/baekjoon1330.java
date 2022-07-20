package baekjoon;

import java.util.Scanner;

public class baekjoon1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A를 입력하시오 ");
		int a = sc.nextInt();
		System.out.println("B를 입력하시오 ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else{
			System.out.println();
		}
	}
}
