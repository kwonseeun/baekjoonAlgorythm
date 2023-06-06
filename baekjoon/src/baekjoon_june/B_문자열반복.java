package baekjoon_june;

import java.util.Scanner;

public class B_문자열반복 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt();

	        for(int i=0; i<T; i++) { // T번 만큼 for문 반복

	            int R = sc.nextInt();
	            String S = sc.next();

	            for(int j=0; j<S.length(); j++){ // 문자별로 따로 for문 돌릴 곳
	                for(int k=0; k<R; k++){ // R번 반복 시킬 곳
	                    System.out.print(S.charAt(j)); // print를 썼다.
	                }
	            }
	            System.out.println();
	        }
	    }
}
