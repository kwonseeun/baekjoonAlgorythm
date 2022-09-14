package baekjoon09;

import java.util.Scanner;

public class B_1152_단어의개수3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		sc.close();
		
		if (input.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(input.split(" ").length);
		}
	}
}
