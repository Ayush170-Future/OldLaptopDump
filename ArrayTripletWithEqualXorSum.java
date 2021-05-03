package BitManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ArrayTripletWithEqualXorSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int ans = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int xors = 0;
        int i = 0;
        for(String ss : s) {
            int val = Integer.parseInt(ss);
            xors = xors ^ val;
            if(sumMap.containsKey(xors)) {
                int length = i - sumMap.get(xors);
                ans += length;
            } else {
                sumMap.put(xors, i);
            }
            i++;
        }
        System.out.println(ans);
    }
}