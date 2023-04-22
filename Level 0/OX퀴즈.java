class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int total=0;
        
        for(int i=0;i<quiz.length;i++){
            String[] cal=quiz[i].split(" "); //공백 기준 문자열 분리
            total=0;
            if(cal[1].equals("-")){
                total=Integer.valueOf(cal[0])-Integer.valueOf(cal[2]);
                if(total==Integer.valueOf(cal[4])){
                    answer[i]="O";
                }
                else{
                    answer[i]="X";
                }
            }
            else{
                total=Integer.valueOf(cal[0])+Integer.valueOf(cal[2]);
                if(total==Integer.valueOf(cal[4])){
                    answer[i]="O";
                }
                else{
                    answer[i]="X";
                }
            }
        }
        return answer;
    }
}
