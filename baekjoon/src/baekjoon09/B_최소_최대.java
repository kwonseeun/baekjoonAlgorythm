package baekjoon09;

import java.util.Scanner;

public class B_최소_최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// min 
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min ) min = arr[i];
		}
		
		// max
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		
		
	}
}
