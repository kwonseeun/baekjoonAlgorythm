package forExample;

import java.util.Arrays;

public class P_완주하지못한_선수 {
	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        int i;
	        for (i = 0; i < completion.length; i++) {
	            if(!participant[i].equals(completion[i])) {
	                return participant[i];
	            }
	        }
	        return participant[i];
	    }
}
