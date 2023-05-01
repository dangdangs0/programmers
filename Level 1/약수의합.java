class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int start=1;
        while(start<=n){
            if(n%start==0){//약수
                answer+=start;
            }
            start++;
        }
        return answer;
    }
}
