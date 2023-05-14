class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain=0;
        int coke=0;
        while(n>=a){
            coke+=n/a*b;
            remain=n%a;
            
            n=remain+n/a*b;
            remain=0;
        }
        answer=coke;
        return answer;
    }
}
