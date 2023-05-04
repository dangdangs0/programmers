

class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] ch=n_str.toCharArray();
        boolean isZero=true;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                isZero=false;
            }
            if(ch[i]=='0' && isZero){
                ch[i]='-';
            }
        }
        
        String temp=String.valueOf(ch);
        answer=temp.replace("-","");
        return answer;
    }
}
