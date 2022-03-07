package baekjoon;

import java.util.Scanner;

public class backjoon2558 {

	public static void main(String[] args) {
		/*(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		 * 
		 *       4 7  2 ........ (1)
		 * X     3 8  5 .........(2)
		 * -------------
		 *     2 3 6  0 .........(3)
		 *   3 7 7 6    .........(4)
		 * 1 4 1 6      .........(5)
		 * ------------
		 * 1 8 1 7 2 9 ..........(6)  
		 * (1)과 (2) 위치에 들어갈 세 자리 자연수가 주어질 때 (3),(4),(5),(6) 위치에 들어갈 값을 구하시오 
		 * */
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b%100));
		System.out.println(a*b);
	}

}
