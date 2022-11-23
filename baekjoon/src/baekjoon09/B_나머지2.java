package baekjoon09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class B_나머지2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] number = new int[10];
	        for (int i = 0; i < 9; i++) {
	            number[i] = sc.nextInt();

	            number[i]%=42;

	        }
	        sc.close();
	        IntStream stream = Arrays.stream(number);
	        System.out.println(stream.distinct().count());
	}
}
