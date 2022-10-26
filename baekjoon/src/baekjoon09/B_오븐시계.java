package baekjoon09;

import java.util.Scanner;

public class B_오븐시계 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h, m, mm;
		h = sc.nextInt();
		m = sc.nextInt();
		mm = sc.nextInt();
		
		h += mm / 60; // 60분 이상이면 넘는 만큼 h에 더하고 
		m += mm % 60; // 남은 분을 m에 더한다.
		
		if(m >= 60) {
			h += 1; // m이 60 이상이면 h를 한시간 더하
			m -= 60;  // m은 60을 - 한다.
		}
		
		if(h >= 24) {
			h-= 24;
		}
		System.out.println(h + " " + m);
		
	}
}
