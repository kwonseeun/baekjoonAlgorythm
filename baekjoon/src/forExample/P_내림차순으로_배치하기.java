package forExample;

import java.util.Arrays;

public class P_내림차순으로_배치하기 {
	 public long solution(long n) {
	        String[] list = String.valueOf(n).split("");
	        Arrays.sort(list);
	 
	        StringBuilder sb = new StringBuilder();
	        for (String aList : list) sb.append(aList);
	 
	        return Long.parseLong(sb.reverse().toString());
	  }
}
