import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums=s.split(" ");
        int[] num=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            num[i]=Integer.valueOf(nums[i]);
        }
        
        Arrays.sort(num);
        
        answer+=num[0];
        answer+=" ";
        answer+=num[num.length-1];
        return answer;
    }
}
