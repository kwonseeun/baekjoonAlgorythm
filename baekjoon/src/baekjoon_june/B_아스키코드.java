package baekjoon_june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_아스키코드 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		br.close();
		
		int n = (int)str.charAt(0);
		
		System.out.println(n);
		
		
	}
}
