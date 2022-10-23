package baekjoon09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_나머지 {
	public static void main(String[] args) throws IOException {
		// 1. 반복문을 사용 42로 나눈 나머지값을 배열 변수에 넣는다.
		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 배열 선언
		int rest[] = new int[10];
		
		// 반복문으로 42의 나머지 값을 배열에 순차적으로 넣는다.
		for(int i = 0; i < 10; i++)
		{
			rest[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		// 2. Arrays.sort로 나머지 값 정렬
		Arrays.sort(rest);
		
		// 3. 반복문을 사용해 i != i - 1인 경우 Count++
		int Count = 1;

		// 반복문을 사용해 다른 나머지를 Count한다.
		for(int i = 1; i < 10; i++)
		{
			if(rest[i - 1] != rest[i])
			{
				Count++;
			}
		}
		
		// 4. 결과 출력
		System.out.print(Count);
	}
}
