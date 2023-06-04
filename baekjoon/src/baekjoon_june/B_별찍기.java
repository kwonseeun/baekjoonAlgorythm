package baekjoon_june;

import java.util.Scanner;

public class B_별찍기 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	 
	        for (int i = 0; i <= n; i++) {
	            int l = 0;
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	                l++;
	            }
	 
	            for (int k = l + 1; k <= n; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	 
	        }
	    }
}
