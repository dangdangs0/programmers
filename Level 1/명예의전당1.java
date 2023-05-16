import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            if(sc.size()==k){
                if(score[i]>sc.get(0)){
                    sc.remove(0);
                    sc.add(score[i]);
                }
            }
            else{
                sc.add(score[i]);
            }
            Collections.sort(sc);
            answer[i]=sc.get(0);
        }
        return answer;
    }
}
