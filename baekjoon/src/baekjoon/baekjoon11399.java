package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**인하은행에는 ATM이 1대밖에 없다. 지금 이 ATM앞에 N명의 사람들이 줄을 서있다. 사람은 1번부터 N번까지 번호가 매겨져 있으며, i번 사람이 돈을 인출하는데 걸리는 시간은 Pi분이다.
 * 줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때, 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램을 작성하시오.
 * */
public class baekjoon11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//  사람의 수 입력 
		int num = sc.nextInt();
		
		int [] time = new int[num];
		
		// 걸리는 시간을 배열에 입력받는다. 
		for (int i = 0; i < num; i++) {
			time[i] = sc.nextInt();
		}
		
		int min = 0; // 각 사람들이 인출하는데 필요한 최소시간
		int sum = 0; // 총합을 저장할 변수
		// 걸리는 시간이 누적되므로 시간이 짧은 순으로 오름차순 정렬을 해준다.
		Arrays.sort(time);
		
		for (int i = 0; i < time.length; i++) {
			min+=time[i];
			sum+=min;
		}
		System.out.println(sum);
	}

}
