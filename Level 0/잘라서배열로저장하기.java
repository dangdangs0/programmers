class Solution {
    public String[] solution(String my_str, int n) {
        int len=my_str.length()/n;
        String temp="";
        
        if(my_str.length()%n>0){
            len=len+1;
        }
        String[] answer = new String[len];
        
        for(int i=0;i<len;i++){
            for(int j=0;j<n;j++){
                if(my_str.length()<n){
                    temp=my_str;
                }
                else{
                    temp=temp+my_str.charAt(j);
                }
            }
            answer[i]=temp;
            my_str=my_str.replaceFirst(temp,"");
            temp="";
            
        }
        
        return answer;
    }
}
