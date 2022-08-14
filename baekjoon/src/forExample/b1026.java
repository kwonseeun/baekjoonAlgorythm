package forExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 옛날 옛적에 수학이 항상 큰 골치거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 
 같은 문제를 내고 큰 상금을 걸었다. 
 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자. 
 S = A[0] x B[0] + ... + A[N-1] x B[N-1]
 S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다. 
 S의 최솟값을 출력하는 프로그램을 작성하시오.
 */ 

public class b1026 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		int arrA[] = new int[n];
		int arrB[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) 
			arrA[i] = Integer.parseInt(st.nextToken());
			
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) 
			arrB[i] = Integer.parseInt(st.nextToken());
			
		br.close();
		
		// 정렬 
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
	}

}
