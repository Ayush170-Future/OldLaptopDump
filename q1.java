package cookoffAprl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class q1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            HashMap<Integer, Integer> map = new HashMap<>();
            int a[] = new int[n];
            int cd = 0;
            for(String r : s1) {
                int temp = Integer.parseInt(r);
                if(map.containsKey(temp)) {
                    int num = map.get(temp);
                    num++;
                    map.put(temp, num);
                } else {
                    cd++;
                    map.put(temp, 1);
                }
            }
            int y = 0;
            for(int i : map.keySet()) {
                int val = map.get(i);
                if(val > 1) {
                    y += val-1;
                }
            }
            int ans = 0;
            if(y >= x) {
                ans = cd;
            } else {
                int val = x-y;
                ans = cd-val;
            }
            System.out.println(ans);
        }
    }
}
