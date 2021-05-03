package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        String ans = random(n, "");
        System.out.println(ans);
    }
    public static String random(long n, String ssf) {
        if(n == 1) {
            return ssf +"1";
        }
        String ans = "";
        if(n % 2 == 0) {
            ans = random(n/2, ssf  +n +" ");
        } else {
            ans = random(3*n + 1, ssf +n +" ");
        }
        return ans;
    }
}
