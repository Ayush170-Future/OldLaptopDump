package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPermutationByCombinationsWay {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("check the input");
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        System.out.println("post input");
        boolean[] check = new boolean[r+1];
        random(r, 0, 1, "", n, check);
    }
    public static void random(int r, int cb, int b, String ssf, int n, boolean[] check) {

        if(b > n) {
            if(cb == r)
                System.out.println(ssf);
            return;
        }
        for(int i = 0; i < r+1; i++) {
            if(i == 0) {
                random(r, cb, b+1, ssf +"-", n, check);
            } else {
                if(!check[i]) {
                    check[i] = true;
                    random(r, cb + 1, b+1, ssf +i, n, check);
                    check[i] = false;
                }
            }
        }
    }
}
