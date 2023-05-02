import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] temp=myStr.split("a|b|c");
        
        int count=0;
        if(temp.length == 0){
            String[] o=new String[1];
            o[0]="EMPTY";
            return o;
        }
        else{
            
            for(int i=0;i<temp.length;i++){
                if(!temp[i].equals("")){
                    count++;
                }
            }
        }
        
        String[]answer=new String[count];
        int start=0;
        for(int i=0;i<temp.length;i++){
            if(!temp[i].equals("")){
                answer[start]=temp[i];
                start++;
            }
            
        }
        
        
        return answer;
    }
}
