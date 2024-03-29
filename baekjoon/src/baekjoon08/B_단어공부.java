package baekjoon08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_단어공부 {
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s = br.readLine();
	        s = s.toUpperCase(); //전부 대문자로 바꾸기
	        int[] al = new int[26];

	        for(int i=0;i<s.length();i++){
	            al[s.charAt(i)-65]++; //A의 아스키코드 값이 65라서 알파벳 순서대로 index가 됨
	        }

	        int max = -1;
	        int ch = -2;

	        for(int i=0;i<26;i++){
	            if(max < al[i]){
	                max = al[i];
	                ch = i;
	            }
	            else if(max == al[i]){
	                ch = -2; //이게 핵심이었다고 생각함. 아래 글로 서술하겠음
	            }
	        }

	        System.out.println((char)(ch+65)); //아스키코드 63은 ?임
	    }

}
