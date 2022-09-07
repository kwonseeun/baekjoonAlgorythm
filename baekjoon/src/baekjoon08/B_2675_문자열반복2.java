package baekjoon08;

import java.util.Scanner;

public class B_2675_문자열반복2 {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt(); // 작업할 횟수
	String[] result = new String[n]; // 결과값을 저장할 배열
    
	// n번만큼 작업을 진행
	for(int i=0;i<n;i++) {
		int num = scan.nextInt(); // 문자를 반복할 횟수
		String str = scan.next(); // 문자열
		String str_num ="";
		// 각 문자를
		for(int j=0;j<str.length();j++) {
			// num번만큼 반복하여 출력
			for(int k=0;k<num;k++) {
				str_num += str.charAt(j);
			}
		}
		result[i] = str_num;
	}
	
	// 결과값을 모아둔 배열 출력
	for(String r:result) {
		System.out.println(r);
	}
	    }
}
