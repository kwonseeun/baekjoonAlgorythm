package forExample;

public class p_문자열_회전 {
	public void test8() {
	    String s = "hello";
			

            for(int i = 0; i < s.length(); i++){
                StringBuilder sb = new StringBuilder(s);
                String subString = sb.substring(0, i);
                sb.delete(0,i);
                sb.append(subString);
                System.out.println(sb.toString());
            }
	}
}
