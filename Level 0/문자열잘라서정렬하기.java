import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        int count=0;
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(temp[i].equals("")){
                count++;
            }
        }
        
        String[] answer=new String[temp.length-count];
        
        int start=0;
        for(int i=count;i<temp.length;i++){
            answer[start]=temp[i];
            start++;
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}
