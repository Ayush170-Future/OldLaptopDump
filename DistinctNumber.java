package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DistinctNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for(String str : s) {
            int val = Integer.parseInt(str);
            set.add(val);
        }
        System.out.println(set.size());
    }
}
