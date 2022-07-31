package forExample;

import java.util.Scanner;

public class b2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//i는 내가 입력한수, 입력한 수가 0보다 크면 입력한 수를 감소시킨다.  
		for (int i = a; i > 0; i--) {
			System.out.println(i);
		}
	}

}
