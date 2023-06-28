package forExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_10828 {
	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        Stack<Integer> stack = new Stack<>();

	        int n = Integer.parseInt(br.readLine());

	        StringTokenizer st;

	        for(int i = 0; i < n; i ++){
	            st= new StringTokenizer(br.readLine());

	            String command = st.nextToken();
	            
	            if(command.equals("push")){
	                int num = Integer.parseInt(st.nextToken());
	                stack.push(num);
	            }else if(command.equals("top")){
	                int num = (stack.isEmpty() == true) ? -1 : stack.peek();
	                bw.write(num + "\n");
	            }else if(command.equals("size")){
	                bw.write(stack.size() +"\n");
	            }else if(command.equals("pop")){
	                int num = (stack.isEmpty() == true) ? -1 : stack.pop();
	                bw.write(num + "\n");
	            }else{
	                int num = (stack.isEmpty() == true) ? 1 : 0;
	                bw.write(num + "\n");
	            }
	        }

	        bw.flush();
	        bw.close();
	    }

}
