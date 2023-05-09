class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len=s.length();
        if(len==4 || len==6){
            try{
            int number=Integer.valueOf(s);
            }catch(NumberFormatException e){
                answer=false;
            }
        }
        else{
            answer=false;
        }
        
        
        return answer;
    }
}
