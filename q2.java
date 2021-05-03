package cookoffAprl;
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            String[] s1 = br.readLine().split(" ");
            int a[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s1[i]);
            }
            StringBuffer ans = new StringBuffer();
            int temp = 0;
            for(int i : a) {
                temp = temp ^ i;
            }
            ans.append(temp);
            ans.append("/n");
            for(int i = 0; i < q; i++) {
                String s2[] = br.readLine().split(" ");
                int ind = Integer.parseInt(s2[0]) - 1;
                a[ind] = Integer.parseInt(s2[1]);
                temp = 0;
                for(int j : a) {
                    temp = temp ^ j;
                }

            }
            System.out.println(ans);
        }
    }
}
