package baekjoon_june;

import java.util.Scanner;

import baekjoon09.B_어린왕자.Main;

public class B_투포인터 {
	 public int solution(int n){

	        int answer = 0, cnt=1;
	        n--;
	        while(n>0){
	            cnt++;
	            n=n-cnt;
	            if(n%cnt==0) answer++;
	        }

	        return answer;
	    }

	    public static void main(String[] args){
	        Main T = new Main();
	        Scanner kb = new Scanner(System.in);
	        int n=kb.nextInt();

	        System.out.print(((B_투포인터) T).solution(n));
	    }
}
