package baekjoon08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10809_알파벳찾기2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;  //모든 배열의 수를 -1로 초기화
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arr[(int)c - 97] == -1) {  //아스키 코드 이용
                arr[(int)c - 97] = i;  //처음 등장하는 인덱스로 갱신
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
