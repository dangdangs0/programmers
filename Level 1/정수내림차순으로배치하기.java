import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str=String.valueOf(n);
        char[] ch=str.toCharArray();
        
        Arrays.sort(ch);
        
        StringBuilder br=new StringBuilder(new String(ch));
        
        answer=Long.valueOf(br.reverse().toString());
        return answer;
    }
}
