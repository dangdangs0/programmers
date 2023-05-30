import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> have=new HashMap<>();
        Arrays.sort(tangerine);
        int big=tangerine[tangerine.length-1];
        for(int i=0;i<big;i++){
            have.put(i,0);
        }
        
        
        for(int i=0;i<tangerine.length;i++){
            have.put(tangerine[i]-1,have.get(tangerine[i]-1)+1);
        }
        
        int max=0;
        if(k==1){
            answer=1;
            return answer;
        }
        while(k!=0){
            for(int i=0;i<big;i++){
                if(max<have.get(i)){
                    max=have.get(i);
                }
            }
            
            for(int i=0;i<big;i++){
                if(have.get(i)==max){
                    k=k-max;
                    answer++;
                    have.put(i,0);
                    
                    if(k<=0){
                        return answer;
                    }
                }
                
            }
            max=0;
        }
        return answer;
    }
}
