class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int len=s.length();
        int start=1;
        
        for(int i=0;i<len;i++){
            char temp=s.charAt(i);
            for(int j=0;j<index;j++){
                temp=(char)(temp+start);
                if(temp>'z'){
                    temp='a';
                }
                if(skip.contains(String.valueOf(temp))){
                    j=j-1;
                }
            }
            answer+=String.valueOf(temp);
        }
        
        
        return answer;
    }
}
