class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=gcd(n,m);
        int small=n*m/max;
        answer[0]=max;
        answer[1]=small;
        return answer;
    }
    public int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
