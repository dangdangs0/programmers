class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if((double)Math.abs(dots[1][1]-dots[0][1])/(double)Math.abs(dots[1][0]-dots[0][0]) == (double)Math.abs(dots[3][1]-dots[2][1])/(double)Math.abs(dots[3][0]-dots[2][0])){
            answer=1;
        }
        else if((double)Math.abs(dots[2][1]-dots[0][1])/(double)Math.abs(dots[2][0]-dots[0][0]) == (double)Math.abs(dots[3][1]-dots[1][1])/(double)Math.abs(dots[3][0]-dots[1][0])){
            answer=1;
        }
        else if((double)Math.abs(dots[3][1]-dots[0][1])/(double)Math.abs(dots[3][0]-dots[0][0]) == (double)Math.abs(dots[2][1]-dots[1][1])/(double)Math.abs(dots[2][0]-dots[1][0])){
            answer=1;
        }
        
        return answer;
    }
}
