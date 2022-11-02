package baekjoon09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_구간_합구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		long[] S = new long[suNo + 1]; // 합배열 선언, Int로 선언하면 값이 넘어가기 때문에 long형을 써준다. +1 해준 이유는,배열은 0번째 인덱스부터 시작하기 때문에 0을 무시하려 +1로 함
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= suNo; i++) {
			S[i] = S[i + 1] + Integer.parseInt(st.nextToken());
		}
				
	}
}
