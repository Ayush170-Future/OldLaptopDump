package CSES_ProblemSet;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Apartments {
//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s[] = br.readLine().split(" ");
//        int n = Integer.parseInt(s[0]);
//        int m = Integer.parseInt(s[1]);
//        int k = Integer.parseInt(s[2]);
//        String ds[] = br.readLine().split(" ");
//        String as[] = br.readLine().split(" ");
//        int ans = 0;
//        Arrays.sort(ds);
//        Arrays.sort(as);
//        int si = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = si; j < m; j++) {
//                int is = Integer.parseInt(ds[i]);
//                int js = Integer.parseInt(as[j]);
//                int maxl = is + k;
//                int minl = is - k;
//                if(js <= maxl && js >= minl) {
//                    ans++;
//                    si = i+1;
//                    break;
//                } else {
//                    continue;
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//}
import java.io.*;
import java.util.PriorityQueue;

public class Apartments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int k = Integer.parseInt(st[2]);

        st = br.readLine().split(" ");
        PriorityQueue<Integer> arr = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st[i]));
        }
        st = br.readLine().split(" ");
        PriorityQueue<Integer> brr = new PriorityQueue<>(m);
        for (int i = 0; i < m; i++) {
            brr.add(Integer.parseInt(st[i]));
        }
//        Arrays.sort(arr);
//        Arrays.sort(brr);

        int cnt = 0;
        while(!arr.isEmpty() && !brr.isEmpty()) {
            if((brr.peek() >= arr.peek() - k) && (brr.peek() <= arr.peek() + k)){
                arr.poll();
                brr.poll();
                cnt++;
            } else if(arr.peek() + k < brr.peek()) {
                arr.poll();
            } else if(arr.peek() - k > brr.peek()) {
                brr.poll();
            }
        }
        System.out.println(cnt);
    }
}