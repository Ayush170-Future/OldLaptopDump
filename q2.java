package kickstartApril2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tt = 1; tt <= t; tt++) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            int dp[] = new int[n];
            String s[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int len = 1;
            int max = Integer.MIN_VALUE;
            dp[0] = 1;
            int diff = arr[1] - arr[0];
            dp[1] = 2;
            len = 2;
            int ci = -1;
            max = len;
            int bvi = 1;
            for(int i = 2; i < n; i++) {
                int d = arr[i] - arr[bvi];
                if(d == diff) {
                    len++;
                    dp[i] = len;
                    bvi = i;
                } else {
                    if(ci == -1) {
                        len++;
                        dp[i] = len;
                        ci = i;
                        bvi = i-1;
                    } else {
                        len = dp[i-1] - dp[ci] + 1;
                        ci = i;
                        dp[i] = len;
                        bvi = i-1;
                    }
                }
                if(dp[i] > max) {
                    max = dp[i];
                }

                if(i != ci) {
                    if(i-1 != ci)
                        diff = arr[i] - arr[i-1];
                }
            }
            System.out.println("Case #" +tt +": " +max);
        }
    }
}














