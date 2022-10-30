package baekjoon09;

import java.util.Scanner;

public class B_과제_안내신분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] students = new int[31];
		
		// 온 사람은 출석체크 
		for (int i = 0; i <= 28; i++) {
			int num= sc.nextInt();
			students[sc.nextInt()] ++;
			
			for (int j = 0; j < students.length; j++) {
				if(students[i] == 0)
					System.out.println(i);
			}
			sc.close();
		}
	}
}
