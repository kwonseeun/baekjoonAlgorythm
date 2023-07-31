package forExample;

import java.util.Scanner;

public class b1003 {

	    class Point {
	        int zeroCount;
	        int oneCount;

	        public Point(int zeroCount, int oneCount) {
	            this.zeroCount = zeroCount;
	            this.oneCount = oneCount;
	        }
	    }

	    static Point[] pointArr = new Point[41];

	    {
	        pointArr[0] = new Point(1, 0);
	        pointArr[1] = new Point(0, 1);

	        for (int idx = 2; idx <= 40; idx++) {
	            pointArr[idx] = new Point(
	                    pointArr[idx - 1].zeroCount + pointArr[idx - 2].zeroCount,
	                    pointArr[idx - 1].oneCount + pointArr[idx - 2].oneCount);
	        }
	    }

	    public static void main(String[] args) {
	        b1003 T = new b1003();

	        Scanner sc = new Scanner(System.in);
	        int caseCount = sc.nextInt();
	        while (caseCount --> 0) {
	            int idx = sc.nextInt();
	            System.out.println(pointArr[idx].zeroCount + " " + pointArr[idx].oneCount);
	    }
	}
}
