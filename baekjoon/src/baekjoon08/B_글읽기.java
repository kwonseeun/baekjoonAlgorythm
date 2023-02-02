package baekjoon08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_글읽기 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        ArrayList<Float> arr1 = new ArrayList();
	        int testcase;
	        testcase=Integer.parseInt(br.readLine());

	        for(int i=0;i<testcase;i++){
	            String[] arr = br.readLine().split(" ");
	            double avg=0;
	            int cnt=0;
	            for(int j=1;j<arr.length;j++){
	                avg+=Integer.parseInt(arr[j])/Integer.parseInt(arr[0]);
	            }
	            for(int j=1;j<arr.length;j++){
	                if(Integer.parseInt(arr[j])>avg) cnt+=1;
	            }

	            arr1.add((float)cnt/(Integer.parseInt(arr[0])));

	        }
	        for(Float x: arr1){
	            System.out.println(String.format("%.3f",x*100)+"%");
	        }
	    }
}
