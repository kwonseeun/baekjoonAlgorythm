package baekjoon_june;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2563_색종이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		boolean [][] paper = new boolean[101][101];
		int answer = 0;
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for(int nr = 0; nr < 10; nr++) {
				for(int nc = 0; nc < 10; nc++) {
					if(!paper[r+nr][c+nc]) {
						paper[r+nr][c+nc] = true;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
		
\
	}

}
