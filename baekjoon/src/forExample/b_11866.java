package forExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_11866 {
	public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < N + 1; i++){
            q.add(i);
        }

        sb.append("<");

        while(!q.isEmpty()){

            for(int i = 0; i < K - 1; i++){
                q.add(q.poll());
            }
            if(q.size() == 1){
                sb.append(q.poll() + ">");
            } else{
                sb.append(q.poll() + ", ");

            }
        }
        System.out.println(sb);

    }
}
