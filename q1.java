package kickstartApril2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tt = 1; tt <= t; tt++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int ans[] = new int[n];
            int ml = 0;
            ml = 1;
            ans[0] = 1;
            for(int i = 1; i < n; i++) {
                if(s.charAt(i) > s.charAt(i-1)) {
                    ml++;
                    ans[i] = ml;
                } else {
                    ml = 1;
                    ans[i] = ml;
                }
            }
            for(int val : ans) {
                System.out.print(val +" ");
            }
            System.out.println();
        }
    }
}
