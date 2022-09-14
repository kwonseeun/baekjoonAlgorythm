package baekjoon09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1546_평균2 {
	public static void main(String[] args) throws IOException {

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     // 갯수 입력받기
     int N = Integer.parseInt(br.readLine());
     // 점수를 공백을 기준으로 나눠서 받아야하므로 StringTokenizer 만들기
     StringTokenizer st = new StringTokenizer(br.readLine());
     // 최댓값을 구할 변수 만들기
     int max = 0;
     // 점수를 합칠 변수 만들기
     double sum = 0;
     for (int i = 0; i < N; i++) {
         int value = Integer.parseInt(st.nextToken());
         if (max < value) max = value;
         sum += value;
     }
     System.out.println(((sum / max) * 100)/N);
 	
 	}
}
