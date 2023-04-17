class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count=0;
        int n=-2;
        
        for(int i=0;i<k;i++){
            n=n+2;
            if(numbers.length<=n){
                n=n-numbers.length;
            }
            answer=numbers[n];
        }
        
        return answer;
    }
}
