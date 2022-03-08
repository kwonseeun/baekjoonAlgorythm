package baekjoon;

import java.util.Scanner;

public class baekjoon10818 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr [] = new int [n];
	int min, max;
	min = Integer.MAX_VALUE;
	max = Integer.MIN_VALUE;
	
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		if (min > arr[i])
			min = arr [i];
		
		else if (max < arr[i])
		max = arr[i];
	}
		System.out.println(min + " " + max);
	}
}