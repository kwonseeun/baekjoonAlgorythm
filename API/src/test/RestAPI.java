package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestAPI {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("----- 시작 : HttpURLConnection사용 POST방식 Rest API TEST -----");
		  
		try {
			StringBuilder vStringBuilder = new StringBuilder();
			String vStringLine;
			 
			URL vURL = new URL("https://reqres.in/api/users");
			HttpURLConnection vHttpURLConnection = (HttpURLConnection) vURL.openConnection();
			
			vHttpURLConnection.setConnectTimeout(5000);
			vHttpURLConnection.setReadTimeout(5000);
			vHttpURLConnection.setRequestProperty("User-agent","Mozilla/4.0");
			vHttpURLConnection.addRequestProperty("", "");
			vHttpURLConnection.setRequestMethod("POST");
			vHttpURLConnection.setDoOutput(true);
			
			if (vHttpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader vBufferedReader = new BufferedReader( new InputStreamReader(vHttpURLConnection.getInputStream(), "utf-8"));
				
				while ((vStringLine = vBufferedReader.readLine()) != null) {
					vStringBuilder.append(vStringLine).append("\n");
				}
				
				vBufferedReader.close();
				
				System.out.println("\n");
				System.out.println("요청 성공");
				System.out.println("\t" + vHttpURLConnection.getResponseCode());
				System.out.println("\t" + vHttpURLConnection.getResponseMessage());
				System.out.println("\t" + vStringBuilder.toString());
				
			} else if (vHttpURLConnection.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
				System.out.println("\n");
				System.out.println("요청 성공 ");
				System.out.println("\t" + vHttpURLConnection.getResponseCode());
				System.out.println("\t" + vHttpURLConnection.getResponseMessage());
				System.out.println("\t" + vStringBuilder.toString());
			}
			
		} catch (Exception e) {
			System.err.println("ex: " + e.toString());
		}
		System.out.println("\n");
		System.out.println("종료 : HttpURLConnection사용 Post방식 RestAPI 테스트");
		
	}
}
