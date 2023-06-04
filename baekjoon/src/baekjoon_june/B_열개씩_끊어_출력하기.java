package baekjoon_june;

import java.util.Scanner;

public class B_열개씩_끊어_출력하기 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            System.out.print(c);
	            if (i % 10 == 9) {
	                System.out.println();
	 
	            }
	 
	        }
	  }
}
