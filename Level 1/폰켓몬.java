import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> pokemon=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            pokemon.add(nums[i]);
        }
        
        int a=pokemon.size();
        int b=nums.length/2;
        
        if(a>b){
            answer=b;
        }
        else if(a<b){
            answer=a;
        }
        else{
            answer=a;
        }
        return answer;
    }
}
