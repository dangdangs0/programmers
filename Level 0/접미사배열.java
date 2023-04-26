import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len=my_string.length();
        String[] answer = new String[len];
        
        for(int i=0;i<len;i++){
            answer[i]=my_string;
            my_string=my_string.replaceFirst(String.valueOf(my_string.charAt(0)),"");
            
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
