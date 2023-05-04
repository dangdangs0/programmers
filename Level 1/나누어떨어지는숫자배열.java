import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] temp=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                temp[i]=arr[i];
                count++;
            }
        }
        
        if(count==0){
            answer=new int[1];
            answer[0]=-1;
        }
        else{
            answer=new int[count];
            int start=0;
            for(int i=0;i<temp.length;i++){
                if(temp[i]!=0){
                    answer[start]=temp[i];
                    start++;
                }
            }

            Arrays.sort(answer);
        }
        
        return answer;
    }
}
