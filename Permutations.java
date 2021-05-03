//package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n <= 3) {
            if(n == 1) {
                System.out.println(1);
            } else
                System.out.println("NO SOLUTION");
        } else if(n == 4) {
            System.out.println("3 1 4 2");
        } else {
            String ans = "";
            String even = "";
            String odd = "";
            for(int i = 1; i <= n; i++) {
                if((i & 1) != 1) {
                    even += i +" ";
                } else {
                    odd += i +" ";
                }
            }
            System.out.println(odd + even);
        }
    }
}
