import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] temp=new int[arr.length];
        int count=0;
        
        for(int i=0;i<queries.length;i++){
            count=0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                
                if(arr[j]>queries[i][2]){
                    temp[count]=arr[j];
                    count++;
                }
            }
            if(count==0){
                answer[i]=-1;
            }
            else{
                int[] bigk=new int[count];
                for(int k=0;k<count;k++){
                    bigk[k]=temp[k];
                }
                Arrays.sort(bigk);
                answer[i]=bigk[0];
            }
            
        }
        
        
        
        return answer;
        
    }
}
