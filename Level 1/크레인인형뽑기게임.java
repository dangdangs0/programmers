import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size=board.length;
        Stack<Integer> basket=new Stack<>();
        int previous=0;
        for(int i=0;i<moves.length;i++){
            int find=moves[i]-1;//[0,4,2,4,0,1,0,3] 
            if(basket.empty()){
                previous=0;
            }
            else{
                previous=basket.peek();
            }
               
            for(int j=0;j<size;j++){
                if(board[j][find]==0 && j==size-1){
                    continue;
                }
                else{
                    if(board[j][find]!=0){
                        basket.push(board[j][find]);
                        board[j][find]=0;
                        
                        if(previous==basket.peek()){//팡팡
                            basket.pop();
                            basket.pop();
                            answer+=2;
                        }
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
