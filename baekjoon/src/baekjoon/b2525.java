package baekjoon;
import java.util.*;
public class b2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int minute = 60 * a + b + c;
		
		if (minute >= 1440) {
			minute = minute-1440;
		} 
		
		
		a = minute / 60;
		b = minute % 60;
		
		System.out.println(a + " " + b );
	}

}
