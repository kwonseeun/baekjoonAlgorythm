package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

/**두 자연수 a와 b가 있을때, a%b는 a를 b로 나눈 나머지이다. 예를 들어, 7,14,27,38을 3으로 나눈 나머지는 1, 2,0,2이다.
 * 수 10개를 입력 받은뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오 */
public class baekjoon3052 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			HashSet<Integer> h = new HashSet<Integer>();
			
			for (int i = 0; i < 10; i++) {
				h.add(sc.nextInt() % 42);
			} 
			sc.close();
			System.out.println(h.size());
	}

}
