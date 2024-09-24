package baekjoon_june;

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

}
