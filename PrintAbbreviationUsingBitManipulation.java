package BitManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAbbreviationUsingBitManipulation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        solve(s);
    }
    public static void solve(String s) {

        for(int i = 0; i < (1 << s.length()); i++) {
            int count = 0;
            String ans = "";
            for(int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                int bit = s.length() - 1 - j;
                if((i & (1 << bit)) == 0) {
                    if(count == 0) {
                        ans = ans + ch;
                    } else {
                        ans = ans + count;
                        ans = ans + ch;
                        count = 0;
                    }
                } else {
                    count++;
                }
            }
            if(count != 0) {
                ans = ans + count;
            }
            System.out.println(ans);
        }
    }
}
