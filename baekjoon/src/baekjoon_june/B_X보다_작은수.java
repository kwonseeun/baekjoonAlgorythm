package baekjoon_june;

import java.util.Scanner;

public class B_X보다_작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N];
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			if(A[i] < X) {
				System.out.printf("%d ", A[i]); 
			}
		}
	}
}
