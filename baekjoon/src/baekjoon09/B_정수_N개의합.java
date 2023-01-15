package baekjoon09;

public class B_정수_N개의합 {
	long sum(int[] a)
	{
		// 합계를 입력할 변수 선언
		long sum = 0;
		int count = 0;
		
		// while문을 사용 합계를 구함
		while(count < a.length)
		{
			sum += a[count];
			count++;
		}
		
		// 결과return
		return sum;
	}
}
