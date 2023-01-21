package baekjoon09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_평균은넘겠지 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine()), n, sum, cnt;
		String[] tmp;
		while(c-- > 0) {
			sum = cnt = 0;
			tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			
			for(int i = 1; i < tmp.length; i++) sum += Integer.parseInt(tmp[i]);
			for(int i = 1; i < tmp.length; i++) {
				if(Integer.parseInt(tmp[i]) > sum/n) cnt++;
			}
			bw.write(String.format("%.3f", cnt/(double)n*100) + "%" + "\n");
		}
		bw.flush();
		bw.close();
	}
}
