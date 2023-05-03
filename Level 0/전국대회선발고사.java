import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
    
        int[] temp=new int[rank.length];
        int[] sort=new int[rank.length];
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                temp[i]=rank[i];
                sort[i]=rank[i];
            }
        }
        
        Arrays.sort(sort);
        
        int count=0;
        int[] small=new int[3];
        for(int i=0;i<rank.length;i++){
            if(sort[i]==0){
                continue;
            }
            else{
                small[count]=sort[i];
                    count++;
            }
            
            if(count==3){
                break;
            }
        }
        
        int[] ranking=new int[3];
        int s=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<rank.length;j++){
                if(small[i]==temp[j]){
                    ranking[s]=j;
                    s++;
                }
            }
        }
        
        answer=10000*ranking[0]+100*ranking[1]+ranking[2];
        
        
        
        return answer;
    }
}
