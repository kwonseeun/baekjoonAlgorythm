package baekjoon09;

import java.util.Scanner;

public class B_어린왕자 {
	public class Main
	{
	    /**
	     * 메인 함수
	     *
	     * @param args: [String[]] 매개변수
	     */
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        int length = scanner.nextInt();
	        scanner.nextLine();
	        
	       
	        scanner.close();
	    }
	    
	    /**
	     * 출발/도착점 포함 여부 반환 함수
	     *
	     * @param xo: [int] 출발/도착점의 x좌표
	     * @param yo: [int] 출발/도착점의 y좌표
	     * @param x: [int] 행성의 x좌표
	     * @param y: [int] 행성의 y좌표
	     * @param r: [int] 행성의 반지름
	     *
	     * @return [boolean] 출발/도착점 포함 여부
	     */
	    private static boolean hasContain(int xo, int yo, int x, int y, int r)
	    {
	        return Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2)) < r;
	    }
	}
}
