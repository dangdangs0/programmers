class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array=s.split(" ");
        
        for(int i=0;i<array.length;i++){
            if(array[i].equals("Z")){ //Z이면
                answer=answer-Integer.valueOf(array[i-1]);
            }
            else{//숫자
                answer+=Integer.valueOf(array[i]);
            }
        }
        return answer;
    }
}
