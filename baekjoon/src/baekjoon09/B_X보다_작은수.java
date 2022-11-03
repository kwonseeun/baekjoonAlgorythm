package baekjoon09;

import java.util.Scanner;

public class B_X보다_작은수 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine(); //수열의 갯수, 정수X 
        String input2 = sc.nextLine(); //수열
        
        int intX = Integer.parseInt(input1.split(" ")[1]); //정수 X
        int serialNum = Integer.parseInt(input1.split(" ")[0]); 
        String[] serial = input2.split(" ");
        String result = "";
       
        System.out.println(result.trim());
    }
}
