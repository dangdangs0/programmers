class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int count=2;
        
        for(int i=code;i<=cipher.length();i++){
            answer=answer+cipher.charAt(i-1);
            i=count*code-1;
            count++;
        }
        
        return answer;
    }
}
