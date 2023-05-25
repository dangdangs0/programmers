class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c=s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(i==0){
                if('a'<=c[i] && c[i]<='z'){
                    c[i]=(char)(c[i]-32);//대문자
                }
            }
            else{
                if(c[i-1]==' '){
                    if('a'<=c[i] && c[i]<='z'){
                        c[i]=(char)(c[i]-32);//대문자
                    }
                }
                else{
                    if('A'<=c[i] && c[i]<='Z'){
                        c[i]=(char)(c[i]+32);//소문자
                    }
                }
            }
        }
        
        answer=String.valueOf(c);
        return answer;
    }
}
