import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a=0,b=0; //음수 두개 곱한거랑 양수 두개 곱한 값 중 제일 큰 것 확인
        
        Arrays.sort(numbers);
        
        a=numbers[numbers.length-1]*numbers[numbers.length-2];
        
        if(numbers.length==2){
            answer=a;
        }
        else{
            if(numbers[0]<0&&numbers[1]<0){
            b=numbers[0]*numbers[1];
        }
        
        if(a<b){
            answer=b;
        }
        else{
            answer=a;
        }
        
        }
        return answer;
    }
}
