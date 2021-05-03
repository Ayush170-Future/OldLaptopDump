package com.company;
import java.io.*;

public class PrintAllPermutation {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("check the input");
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        System.out.println("post input");
        int[] blank = new int[n];
        random(blank, 1, n, r);
    }
    public static void random(int[] blank, int ci, int n, int r) {

        if(ci > r) {

            for (int j = 0; j < n; j++) {
                System.out.print(blank[j] +" ");
            }
            System.out.println();
            return;
        }
        for(int j = 0; j < n; j++) {
            if(blank[j] == 0) {
                blank[j] = ci;
                random(blank, ci+1, n, r);
                blank[j] = 0;
            }
        }
    }
}
