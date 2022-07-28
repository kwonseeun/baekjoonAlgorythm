package forExample;

import java.util.Scanner;

public class baekjoon2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 단을 입력해주세요: ");
		int a = sc.nextInt();
		
		System.out.println(a + "단 출력합니다. " );
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
	}
}
