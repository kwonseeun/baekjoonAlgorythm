package baekjoon09;

import java.util.Scanner;

public class B_1152_단어의개수2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine(); // 한 라인 입력받기
		S = S.trim(); // 양쪽 공백제거
		String ans[] = S.split(" "); // 공백기준으로 스플릿
		if(ans.length == 1 && ans[0].equals("")) {
			System.out.println(0);
		}else {
			System.out.println(ans.length);
		}
	}
}
