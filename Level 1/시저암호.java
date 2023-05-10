class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch=s.toCharArray();
        int tmp=n;
        for(int i=0;i<ch.length;i++){
            tmp=n;
            while(tmp!=0){
                if(ch[i]=='z'){
                    ch[i]='a';
                }
                else if(ch[i]=='Z'){
                    ch[i]='A';
                }
                else if(s.charAt(i)==' '){
                    ch[i]=' ';
                }
                else{
                    ch[i]+=1;
                }
                
                tmp--;
            }
            
        }
        answer=String.valueOf(ch);
        return answer;
    }
}
