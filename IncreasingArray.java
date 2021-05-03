package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        long ans = 0;
        for(int i = 1; i < n; i++) {
            int c = Integer.parseInt(s[i]);
            int p = Integer.parseInt(s[i-1]);
            if(c < p) {
                ans += p-c;
                s[i] = s[i-1];
            }
        }
        System.out.println(ans);
    }
}
