class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int xPValid=board[0]/2;
        int xMValid=(board[0]/2)*-1;
        int yPValid=board[1]/2;
        int yMValid=(board[1]/2)*-1;
        
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("up")){
                if(answer[1]<yPValid){
                    answer[1]++;
                }
            }
            if(keyinput[i].equals("down")){
                if(answer[1]>yMValid){
                    answer[1]--;
                }
            }
            if(keyinput[i].equals("left")){
                if(answer[0]>xMValid){
                    answer[0]--;
                }
            }
            if(keyinput[i].equals("right")){
                if(answer[0]<xPValid){
                    answer[0]++;
                }
            }
        }
        
        return answer;
    }
}
