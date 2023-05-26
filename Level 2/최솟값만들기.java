import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);//오름차순 정렬
        Arrays.sort(B);
        
        int len=A.length;
        
        int size=len;
        size=size-1;
        for(int i=0;i<len;i++){
            answer+=A[i]*B[size];
            size--;
        }
        

        return answer;
    }
}
