package forExample;

import java.util.Scanner;

public class b2023 {
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	re(1,2);
    	re(1,3);
    	re(1,5);
    	re(1,7);
	}
	
	static void re (int cnt, int num) {
		if (cnt == n) {
			if(isprime(num))
				System.out.println(num);
			return;
		}
		for (int i = 1; i <10; i++) {
			if (i == 2 || i == 4 || i == 6 || i == 8) {
				if (isprime(num* 1 0 + 1)) {
					re(cnt+1, num*10+i);
				}
			}
			
		
		}
	}

}
