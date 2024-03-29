package baekjoon08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ISBN {
    private static String ISBN = "9780921418";
    private static int mod13 = 3;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (String eachDigit : ISBN.split("")) {
            sum += Integer.parseInt(eachDigit) * getMod123();
        }

        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(br.readLine()) * getMod123();
        }

        System.out.println("The 1-3-sum is " + sum);
    }

    private static int getMod123() {
        if (mod13 == 1) {
            mod13 = 3;
        } else {
            mod13 = 1;
        }
        return mod13;
    }
}
