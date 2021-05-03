package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class WordsWithKSelections {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        String unique = "";
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) {
                unique += c;
                set.add(c);
            }
        }
        System.out.println(unique);
        random(unique, -1, "", k, 1);
    }
    public static void random(String unique, int ci, String asf, int k, int count) {

        if(count > k) {
            System.out.println(asf);
            return;
        }
        int n = unique.length();
        for(int i = ci+1; i < n; i++) {

            random(unique, i, asf + unique.charAt(i), k, count+1);

        }
    }
}