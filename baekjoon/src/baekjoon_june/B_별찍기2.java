package baekjoon_june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_별찍기2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			for(int j = a; j > i +1; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
