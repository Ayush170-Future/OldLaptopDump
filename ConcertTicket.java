package CSES_ProblemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class ConcertTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        PriorityQueue<Integer> h = new PriorityQueue<>();
        PriorityQueue<Integer> t = new PriorityQueue<>();
        for(String str : s1) {
            int val = Integer.parseInt(str);
            h.add(val);
        }
        int ma[] = new int[m];
        for(int i = 0; i < m; i++) {
            int val = Integer.parseInt(s2[i]);
            ma[i] = val;
        }
        for(int i = 0; i < m; i++) {
            int val = ma[i];
            for(int p : h) {
                if(p <= val) {
                    System.out.println(p);
                    h.poll();
                    break;
                } else {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}