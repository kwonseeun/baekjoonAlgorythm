package baekjoon_june;

import java.util.Scanner;

public class B_주몽 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int p1=0; p1<n; p1++){
            int sum =0;
            int p2 = p1+1;

            while(p2<n){
                sum = arr[p1];
                sum+=arr[p2++]; // p1와 p2를 더하고 p2를 한칸 증가
                if(sum == m ){ // 더한값이 m과 같으면 answer 증가
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
