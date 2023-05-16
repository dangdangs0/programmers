import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Boolean> prime=new ArrayList<>();
        prime.add(false);//0
        prime.add(false);//1
        
        for(int i=2;i<=n;i++){
            prime.add(true);
        }
        for(int i=2;(i*i)<=n;i++){
            if(prime.get(i)){
                for(int j=i*i;j<=n;j+=i){
                    prime.set(j,false);
                }
            }
        }
        
        for(int i=0;i<=n;i++){
            if(prime.get(i)){
                answer++;
            }
        }
        
        return answer;
    }
}
