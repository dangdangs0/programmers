class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int index=0;
        
        String onlyNum=my_string.replaceAll("[a-zA-Z]"," ");
        onlyNum=onlyNum.trim(); //공백제거
        
        String[] nums=onlyNum.split(" ");
        
        for(int i=0;i<nums.length;i++){
            if(nums[i].equals(" ")){
                continue;
            }
            else{
                try{//문자열 안에 자연수가 없을수도 있군
                    answer=answer+Integer.valueOf(nums[i]);
                }catch(NumberFormatException e){
                    
                }
                
            }
        }
        
        return answer;
    }
}
