package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrintAllPermutationOfAString {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        HashMap<Character, Integer> fmap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(fmap.containsKey(c)) {
                fmap.put(c, fmap.get(c) + 1);
            } else {
                fmap.put(c, 1);
            }
        }
        random(s, n, fmap, 1, "");
    }
    public static void random(String s, int n, HashMap<Character, Integer> fmap, int cb, String asf) {

        if(cb > n) {
            System.out.println(asf);
            return;
        }
        for(char c : fmap.keySet()) {
            if(fmap.get(c) > 0) {             // this is level option method with levels of blocks
                fmap.put(c, fmap.get(c) - 1);
                random(s, n, fmap, cb + 1, asf + c);
                fmap.put(c, fmap.get(c) + 1);
            }
        }
    }
}
