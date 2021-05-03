package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintCombinations {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("check in the input");
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        random(r, 0, 1, "", n);
    }
    public static void random(int r, int cb, int b, String ssf, int n) {

        if(b > n) {
            if(cb == r) {
                System.out.println(ssf);
            }
            return;
        }

        random(r, cb, b+1, ssf + "-", n);
        random(r, cb+1, b+1, ssf +"i", n);
    }
}