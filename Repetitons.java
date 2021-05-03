package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitons {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int max = 1;
        int len = 1;
        for(int i = 1; i < n; i++) {
            char c = s.charAt(i);
            char l = s.charAt(i-1);
            if(c == l) {
                len++;
            } else {
                if(len > max) {
                    max = len;
                }
                len = 1;
            }
        }
        if(len > max) {
            max = len;
        }
        System.out.println(max);
    }
}
