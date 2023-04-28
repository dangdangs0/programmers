class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int len=before.length();
        for(int i=0;i<len;i++){
            after=after.replaceFirst(String.valueOf(before.charAt(i)),"");
        }
        if(after.equals("")){
            answer=1;
        }
        else{
            answer=0;
        }
        
                                
        return answer;
    }
}
