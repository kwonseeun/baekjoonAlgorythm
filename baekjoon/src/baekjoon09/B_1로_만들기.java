package baekjoon09;

import java.util.Scanner;

public class B_1로_만들기 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();

	        // 해당 인덱스의 수를 연산하기 위한 최솟값 저장 배열
	        int[] dp = new int[n + 1];

	        dp[1] = 0;

	        for (int i = 2; i < dp.length; i++) {

	            dp[i] = dp[i - 1] + 1;

	            if (i % 3 == 0) {
	                if (dp[i / 3] + 1 < dp[i]) {
	                    dp[i] = dp[i / 3] + 1;
	                }
	            }
	            if (i % 2 == 0) {
	                if (dp[i / 2] + 1 < dp[i]) {
	                    dp[i] = dp[i / 2] + 1;
	                }
	            }
	        }

	        System.out.println(dp[n]);

	    }
}
