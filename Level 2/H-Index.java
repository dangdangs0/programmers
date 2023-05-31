import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max=citations[citations.length-1];
        
        for(int i=0;i<=citations[citations.length-1];i--){
            int count=0;
            for(int j=0;j<citations.length;j++){
                if(max<=citations[j]){
                    count++;
                }
            }
            if(count>=max){
                answer=max;
                break;
            }
            max--;
        }
        
        return answer;
    }
}
