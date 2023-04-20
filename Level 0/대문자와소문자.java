class Solution {
    public String solution(String my_string) {
        String answer = "";
        int temp=0;
        
        for(int i=0;i<my_string.length();i++){
            char ch=my_string.charAt(i);
            if('a'<= ch && ch<='z'){ //소문자면
                temp=ch-'0'-32;
                temp=temp+'0';
                answer=answer+(char)temp;
            }else{
                temp=ch-'0'+32;
                temp=temp+'0';
                answer=answer+(char)temp;
            }
        }
        return answer;
    }
}
