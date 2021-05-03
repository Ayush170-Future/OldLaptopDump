package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPermutation2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        boolean[] check = new boolean[n];
        random(n, check, 0, "", s);
    }
    public static void random(int n, boolean[] check, int ci, String asf, String s) {

        if(ci > n) {
            System.out.println(asf);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                random(n, check, ci+1, asf + s.charAt(ci), s);
                check[i] = false;
            }
        }
    }
}
