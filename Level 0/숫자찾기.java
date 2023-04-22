class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numString=String.valueOf(num);
        
        for(int i=0;i<numString.length();i++){
            if(numString.charAt(i)==(k+'0')){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}
