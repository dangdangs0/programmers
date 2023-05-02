class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str=String.valueOf(n);
        int len=str.length();
        answer=new int[len];
        
        int start=0;
        for(int i=len-1;i>=0;i--){
            answer[start]=str.charAt(i)-'0';
            start++;
        }
        
        return answer;
    }
}
