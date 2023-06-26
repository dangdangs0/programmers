import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index=1;
        boolean isLoop=true;
        
        ArrayList<Integer> pr=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        
        int max=0;
        for(int i=0;i<priorities.length;i++){
            pr.add(priorities[i]);
            if(priorities[i]>max){
                max=priorities[i];
            }
            arr.add(i);
        }
        
        while(isLoop){
            
            if(max==pr.get(0)){
                if(location==arr.get(0)){
                    isLoop=false;
                    return index;
                }
                else{
                    pr.remove(0);
                    arr.remove(0);
                    index++;
                    max=0;
                }
            }
            else{
                pr.add(pr.get(0));
                arr.add(arr.get(0));
                pr.remove(0);
                arr.remove(0);
            }
            
            for(int i=0;i<pr.size();i++){
                if(pr.get(i)>max){
                    max=pr.get(i);
                }
            }
        }
        
        return answer;
    }
}
