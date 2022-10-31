package baekjoon09;

import java.util.Scanner;

public class B_숫자의합_구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N의 숫자를 입력받는다. 
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray(); // sNum을 char[] 형 변수에 변환하여 저장 
		int sum = 0; // 초기화 
		
		for (int i = 0; i < cNum.length; i++) {
			sum+= cNum[i] - '0'; // cNum에 있는 char값을 저장 후 아스키코드로 변환하고, int형으로 바꿔줄 때는 문자열로 마이너스를 해준다. 
		}
		System.out.println(sum);
	}
}
/* N값 입력받기 
 * 길이 N의 숫자를 입력받아 String형 변수에 sNum을 저장하기
 * int형 변수 sum 선언하기 
 * for(cNum 길이만큼 반복하기) {
 * 배열의 각 자릿값을 정수형으로 변환하여 sum에 누적하기 
 * }*/
