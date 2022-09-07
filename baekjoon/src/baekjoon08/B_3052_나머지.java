package baekjoon08;

import java.util.HashSet;
import java.util.Scanner;

public class B_3052_나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> H = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			H.add(sc.nextInt() % 42);
		}
		
		sc.close();
		System.out.println(H.size());
	}

}
