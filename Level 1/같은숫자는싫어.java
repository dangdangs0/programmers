import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i!=0){
                if(arr[i]==arr[i-1]){
                    continue;
                }
                else{
                    temp[count]=arr[i];
                    count++;
                }
            }
            else{
                temp[count]=arr[i];
                count++;
            }
        }
        
        answer=new int[count];
        for(int i=0;i<count;i++){
            answer[i]=temp[i];
        }
        
        return answer;
    }
}
