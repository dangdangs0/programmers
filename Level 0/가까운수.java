import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int a=0;
        int b=0;
        boolean isSmall=false;
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            if(array[i]<=n){
                if(i==array.length-1){
                    answer=array[i];
                }
                else if(n<=array[i+1]){
                    a=n-array[i]; //차
                    b=array[i+1]-n; //차
                    if(a>b){
                        answer=array[i+1];
                    }
                    else if(a<b){
                        answer=array[i];
                    }
                    else{//a==b
                        answer=array[i];
                    }
                }
            }
            else if(n<array[0]){
                answer=array[0];
            }
                
        }
        return answer;
    }
}
