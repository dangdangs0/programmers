import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        ArrayList<Integer> sc=new ArrayList<>();
        int len=score.length;
        
        if(len<m){
            return answer;
        }
        for(int i=0;i<len;i++){
            sc.add(score[i]);
        }
        
        Collections.sort(sc,Collections.reverseOrder());
        int count=len/m;
        
        // while(sc.size()>=m){
        //     answer+=sc.get(m-1)*m;
        //     for(int i=0;i<m;i++){
        //         sc.remove(0);
        //     }
        // }
        
        int index=m-1;
        for(int j=0;j<count;j++){
            answer+=sc.get(index)*m;
            index+=m;
        }
        return answer;
    }
}
