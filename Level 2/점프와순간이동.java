import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        String bina=Integer.toBinaryString(n);
        int len=bina.length();
        
        for(int i=0;i<len;i++){
            if(bina.charAt(i)=='1'){
                ans++;
            }
        }

        return ans;
    }
}
