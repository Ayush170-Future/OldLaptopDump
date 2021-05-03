package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingCombination2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("check in the input");
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        System.out.println("Post input");
        boolean[] arr = new boolean[n];
        random(n, r, 0, -1, arr);
    }
    public static void random(int n, int r, int ci, int li, boolean[] arr) {

        if(ci > r) {
            for(boolean b : arr) {
                if(b == true) {
                    System.out.print("i");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        for(int i = li+1; i < n; i++) {
            if (!arr[i]) {
                arr[i] = true;
                random(n, r, ci+1, i, arr);
                arr[i] = false;
            }
        }

    }
}
