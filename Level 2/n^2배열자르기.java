import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long left, long right) {
        int size=(int)(right-left)+1;
        int[] answer = new int[size];
        
        for(long i=0;i<size;i++){
            long a=left/n+1;
            long b=left%n+1;
            answer[(int)i]=(int)(a > b ? a : b);
            
            left++;
        }
        return answer;
    }
}
