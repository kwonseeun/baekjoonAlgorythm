package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2438_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
