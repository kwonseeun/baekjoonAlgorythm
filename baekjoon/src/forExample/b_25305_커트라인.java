package forExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b_25305_커트라인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Integer arr[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[K-1]);
	}

}
