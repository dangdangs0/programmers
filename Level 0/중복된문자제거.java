class Solution {
    public String solution(String my_string) {
        String answer = "";
        String temp=my_string;
        boolean isOnly=false;
        
        for(int i=0;i<my_string.length();i++){
            for(int j=i;j<my_string.length();j++){
                if(answer.contains(String.valueOf(my_string.charAt(j)))){
                    break;
                }
                else{
                    answer=answer+my_string.charAt(i);
                    break;
                }
            }
        }
        return answer;
    }
}
