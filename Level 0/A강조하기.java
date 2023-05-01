class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch=myString.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                ch[i]='A';
            }
            else if ('A'<ch[i] && ch[i]<='Z'){
                int temp=ch[i]-'0';
                temp=temp+32;
                temp=temp+'0';
                ch[i]=(char)temp;
            }
        }
        answer=String.valueOf(ch);
        return answer;
    }
}
