package forExample;

import java.util.Scanner;

public class b2816 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String[] arr = new String[n];
	        for(int i = 0 ; i<n; i++) {
	        	arr[i] = sc.next();
	        }
	    	for(int i = 0 ;i<n; i++) {
	       		if(arr[i].equals("KBS1")) {//KBS1부터 첫번째로
	       			String tmp = "";
	       			for(int j = i; j>0; j--) {
	        			System.out.print(4);
	        			tmp = arr[j-1];
	        			arr[j-1] = arr[j];
	        			arr[j] = tmp;
	       			}
	       			break;
	        	}
	        	else 
	        		System.out.print(1);
	       	}
	}

}
