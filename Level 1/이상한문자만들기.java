class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch=s.toCharArray();
        int start=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                start=0; //초기화!
            }
            else{
                if(start%2==0){
                    if('a'<=ch[i]&&ch[i]<='z'){
                        ch[i]-=32;
                    }
                }
                else{
                    if('A'<=ch[i]&&ch[i]<='Z'){
                        ch[i]+=32;
                    }
                }
                start++;
            }
            
        }
        answer=String.valueOf(ch);
        return answer;
    }
}
