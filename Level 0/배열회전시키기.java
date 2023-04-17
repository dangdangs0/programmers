class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0;i<numbers.length;i++){
                if(i==0){
                    answer[i]=numbers[numbers.length-1];
                }
                else{
                    answer[i]=numbers[i-1];
                }
            }
        }else{
            for(int i=0;i<numbers.length;i++){
                if(i+1==numbers.length){
                    answer[i]=numbers[0];
                }
                else{
                    answer[i]=numbers[i+1];
                }
                
            }
        }
        return answer;
    }
}
