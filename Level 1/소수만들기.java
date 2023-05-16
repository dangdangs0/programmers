import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-2){
                break;
            }
            else{
                for(int j=i+1;j<nums.length;j++){
                    if(j==nums.length-1){
                        break;
                    }
                    else{
                        for(int k=j+1;k<nums.length;k++){
                            temp.add(nums[i]+nums[j]+nums[k]);
                        }
                    }
                }
            }
            
        }
        //6, 7, 8, 9 저장되어있음
        Collections.sort(temp);
        
        ArrayList<Boolean> prime=new ArrayList<>();
        prime.add(false);
        prime.add(false);
        
        int last=temp.get(temp.size()-1);
        for(int i=2;i<=last;i++){
            prime.add(i,true);
        }
        for(int i=2;(i*i)<=last;i++){
            if(prime.get(i)){
                for(int j=i*i;j<=last;j+=i){
                    prime.set(j,false);
                }
            }
        }
        
        for(int i=0;i<temp.size();i++){
            if(prime.get(temp.get(i))){
                answer++;
            }
        }

        return answer;
    }
}
