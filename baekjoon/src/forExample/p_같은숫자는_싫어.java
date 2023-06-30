package forExample;

import java.util.ArrayList;

public class p_같은숫자는_싫어 {
	   public int[] solution(int []arr) {
	        int[] answer = {};
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        int num = -1; 
	        for(int i = 0; i < arr.length; i++) {
	            System.out.println(num);
	        	if(arr[i] != num) {
	        		list.add(arr[i]);
	        		num = arr[i];
	        	}
	        }
	        answer = new int[list.size()];
	        
	       for(int i=0; i < answer.length; i++){
	           answer[i] = list.get(i);
	       }   
	        return answer;
	   }
}
