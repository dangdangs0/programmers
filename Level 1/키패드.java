class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left=10;
        int right=12;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                numbers[i]=11;    
            }
            
            if(numbers[i]%3==1){
                answer+="L";
                left=numbers[i];
            }
            else if(numbers[i]%3==0){
                answer+="R";
                right=numbers[i];
            }
            else{
                //2, 5, 8, 0
                int leftabs=Math.abs((left-1)%3-(numbers[i]-1)%3)
                    +Math.abs((left-1)/3-(numbers[i]-1)/3);
              
                int rightabs=Math.abs((right-1)%3-(numbers[i]-1)%3)
                    +Math.abs((right-1)/3-(numbers[i]-1)/3);;
                
                if(leftabs<rightabs){
                    answer+="L";
                    left=numbers[i];
                }
                else if(leftabs>rightabs){
                    answer+="R";
                    right=numbers[i];
                }
                else{
                    if(hand.equals("right")){
                        answer+="R";
                        right=numbers[i];
                    }
                    else{
                        answer+="L";
                        left=numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}
