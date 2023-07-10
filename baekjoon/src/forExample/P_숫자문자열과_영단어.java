package forExample;

public class P_숫자문자열과_영단어 {
	 public int solution(String s) {
	        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        String str="", answer="";
	        
	        // 숫자면 반환, 영어면 해당위치 숫자로 바꾸기 
	        for(int i=0;i<s.length();i++){
	            if(!Character.isDigit(s.charAt(i))){
	                str+=s.charAt(i);
	                if(str!=""){
	                    for(int j=0;j<number.length;j++){
	                        if(str.equals(number[j])){
	                            answer+=j;
	                            str="";
	                        }
	                    }
	                }
	            }else
	                answer += s.charAt(i);
	        }
	        return Integer.parseInt(answer);
	    }
}
