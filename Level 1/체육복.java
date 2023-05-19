import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] student=new boolean[n];
        int lostlen=lost.length;
        int reservelen=reserve.length;
        
        Arrays.sort(reserve);
        
        for(int i=0;i<n;i++){
            student[i]=true;
        }
        for(int i=0;i<lostlen;i++){
            int t=lost[i]-1;//[1,3]
            student[t]=false;
        }
        for(int i=0;i<reservelen;i++){
            int t=reserve[i]-1;//5명 [4,5] [3,4]
            if(!student[t]){
                student[t]=true;
                reserve[i]=-1;
            }
        }
        
        for(int i=0;i<reservelen;i++){
            if(reserve[i]==-1){
                continue;
            }
            else{
                int t=reserve[i]-1;//[0,2,4]
                if(t==0){
                    student[t+1]=true;            
                }
                else if(t+1==n){
                    //만약 맨 뒤에 애면 앞에 애만 빌려줄 수 있다.
                    student[t-1]=true;
                }
                else{
                    if(!student[t-1]){
                        student[t-1]=true;
                    }
                    else{
                        student[t+1]=true;
                    }
                }
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(student[i]){
                answer++;
            }
        }
        
        return answer;
    }
}
