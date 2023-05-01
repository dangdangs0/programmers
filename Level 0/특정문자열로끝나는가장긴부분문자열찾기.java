class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index=0;
        for(int i=0;i<myString.length();i++){
            String temp="";
            int start=i;
            
            if(start+pat.length()>myString.length()){
                break;
            }
            else{
                for(int j=0;j<pat.length();j++){
                    temp+=String.valueOf(myString.charAt(start));
                    start++;
                }
                if(temp.equals(pat)){
                    index=start;
                }
            }
            
        }
        
        for(int i=0;i<index;i++){
            answer+=String.valueOf(myString.charAt(i));
        }
        return answer;
    }
}
