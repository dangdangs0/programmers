import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> hash=new HashMap<>();
        boolean canBuy=false;
        
        for(int i=0;i<want.length;i++){
            hash.put(want[i],number[i]);
        }
        //banana : 3 apple : 2 ...
        
        int start=0;
        while(start+10<=discount.length){
            HashMap<String,Integer> dis=new HashMap<>();
            for(int i=start;i<start+10;i++){
                //10일간 할인하는거
                dis.put(discount[i],dis.getOrDefault(discount[i],0)+1);
            }
            
            for(int i=0;i<want.length;i++){
                if(dis.get(want[i])==null){
                    canBuy=false;
                    break;
                }
                else if(hash.get(want[i])<=dis.get(want[i])){
                    canBuy=true;
                }
                else{
                    canBuy=false;
                    break;
                }
            }
            if(canBuy){
                answer++;
            }
            
            canBuy=false;
            start++;
        }
        return answer;
    }
}
