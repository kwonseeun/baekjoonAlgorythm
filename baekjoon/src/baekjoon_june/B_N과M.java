package baekjoon_june;

import java.util.Scanner;

public class B_N과M {
	    static int N, M;
	    static int[] arr;
	    static boolean[] isUsed;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        N = sc.nextInt();
	        M = sc.nextInt();

	        isUsed = new boolean[N + 1];
	        arr = new int[M + 1];

	        recursion(0);
	    }

	    private static void recursion(int idx) {
	        if (idx == M) {
	            for (int i = 0; i < M; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
	            return;
	        }

	        for (int i = 1; i <= N; i++) {
	            if (!isUsed[i]) {
	                isUsed[i] = true;
	                arr[idx] = i;
	                recursion(idx + 1); // arr의 인덱스를 +1 시켜준다.
	                isUsed[i] = false;
	            }
	        }
	  }
}
