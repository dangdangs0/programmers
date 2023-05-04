import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp=new int[arr.length];
        int min=0;
        
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        if(arr.length==1){
            answer=new int[1];
            answer[0]=-1;
            return answer;
        }
        else{
            
            Arrays.sort(temp);
            min=temp[0];
            
        }
        answer=new int[arr.length-1];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                continue;
            }
            else{
                answer[count]=arr[i];
                count++;
            }
        }
        return answer;
    }
}
