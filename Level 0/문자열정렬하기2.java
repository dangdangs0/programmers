import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string=my_string.toLowerCase();
        
        char[] charString=my_string.toCharArray();
        Arrays.sort(charString);
        
        answer=String.valueOf(charString);
        
        
        return answer;
    }
}
