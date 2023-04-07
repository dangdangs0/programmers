class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=0;
        
        while(true){
            num=num+1;
            if(6*num%n==0){ //6조각*피자판 수에 사람인원만큼 나눴을 때 남는 게 없다면 그것이 다같이 잘먹는 피자수
                answer=num;
                return answer;
            }
        }
    }
}
