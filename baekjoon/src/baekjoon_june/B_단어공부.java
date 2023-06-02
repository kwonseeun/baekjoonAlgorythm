package baekjoon_june;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_단어공부 {
	public static void main(String[] args) throws IOException {
		
		// 입력 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		
		// 알파벳별 Counting
		int[] count = new int[26];
		
		int maxValue = 0;
		char maxChar = '?';
		for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'A';
			if (maxValue < ++count[idx]) {
				// 최댓값 업데이트 
				maxValue = count[idx];
				maxChar = str.charAt(i);
			} else if (maxValue == count[idx])
				maxChar = '?';
		}
		bw.write(maxChar);
		br.close();
	}
}
