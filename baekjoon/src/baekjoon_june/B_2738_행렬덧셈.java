package baekjoon_june;

import java.util.Scanner;

/*첫째 줄에 행렬의 크기 N 과 M이 주어진다.
 *  둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 
 *  이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
 *  N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 *  N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.*/
public class B_2738_행렬덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					arr[j][j2] += sc.nextInt();
				}
			}
		}
	}
}
