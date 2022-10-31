package baekjoon09;

import java.util.Scanner;

public class B_평균구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int A[] = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > max ) max = A[i]; // 만약 A에서 가져온 값이 max 보다 크면 max에 저장 
			sum+=A[i];
		}
		System.out.println(sum*100.0/max/N);
		
	}
}
