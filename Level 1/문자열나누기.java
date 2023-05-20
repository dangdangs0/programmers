class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isLoop=true;
        while(isLoop){
            char compare=s.charAt(0);
            int same=0;
            int diff=0;
            for(int i=0;i<s.length();i++){
                if(compare==s.charAt(i)){
                    same++;
                }
                else{
                    diff++;
                }
                
                if(same==diff){
                    answer++;
                    if(i+1!=s.length()){
                        s=s.substring(i+1);    
                    }
                    else{
                        isLoop=false;
                    }
                    break;
                }
                else if(same!=diff && i==s.length()-1){
                    //두개가 다른데 뒤에 더이상 글자가 없을 때
                    answer++;
                    isLoop=false;
                    break;
                }
            }
        }
        return answer;
    }
}
