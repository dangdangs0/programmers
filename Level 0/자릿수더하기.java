class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString=String.valueOf(n);
        
        for(int i=0;i<nString.length();i++){
            answer=answer+nString.charAt(i)-'0';
        }
        return answer;
    }
}
