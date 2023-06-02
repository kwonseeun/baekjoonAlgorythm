package seul;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner a = new Scanner(System.in);
	 int arr[] = new int[9];
	 int max = arr[0];
	 int count = 0; 
	 
	 for (int i = 0; i < arr.length; i++) {
		arr[i] = a.nextInt();
		if (arr[i] > max) {
			max = arr[i];
			count = i+1;
		}
	 }	
	 System.out.println(max);
	 System.out.println(count);
 	}
}
