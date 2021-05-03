package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        String s[] = br.readLine().split(" ");
        long sum = 0;
        long ans = 0;
        for(String str : s) {
            long val = Long.parseLong(str);
            sum += val;
        }
        ans = (n*(n+1))/2 - sum;
        System.out.println(ans);
    }
}
