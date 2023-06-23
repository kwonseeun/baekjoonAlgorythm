package forExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P_정수내림차순으로_배치 {
	 public long solution(long n) {
	      long answer = 0;
	        String strResult="";
	        String strn = String.valueOf(n);
	        List<String> slist = Arrays.asList(strn.split(""));
	        List<Integer> ilist = new ArrayList<Integer>();
	        for(String s : slist) {
	            ilist.add(Integer.parseInt(s));
	        }
	        ilist.sort(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2-o1;
	            }
	        });
	        for(Integer i : ilist) {
	            strResult+=String.valueOf(i);
	        }
	        answer = Long.parseLong(strResult);
	        return answer; 
	  }
}
