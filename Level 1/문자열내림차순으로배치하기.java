import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch=s.toCharArray();
        
        Arrays.sort(ch);
        
        String temp=String.valueOf(ch);
        StringBuilder sb=new StringBuilder(temp);
        answer=sb.reverse().toString();
        return answer;
    }
}
