package baekjoon_june;

import java.util.Scanner;

public class B_최소_최대 {

/* N개의 정수가 주어진다. 이때 최솟값과 최댓값을 구하는 프로그램을 작성하시오 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// 최소값 
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) min = arr[i];
		}
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) max = arr[i];
		}
		
		System.out.println(min+" "+max);
	}
}
