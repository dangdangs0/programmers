class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len=phone_number.length();
        char[] ch=phone_number.toCharArray();
        
        for(int i=0;i<len-4;i++){
            ch[i]='*';
        }
        answer=String.valueOf(ch);
        return answer;
    }
}
