import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //오름차순 정렬
        Arrays.sort(people);
        ArrayList<Integer> line=new ArrayList<>();
        for(int i=0;i<people.length;i++){
            line.add(people[i]);
        }
        
        int size=line.size();
        while(line.size()!=0){
            if(line.get(size-1)==limit){
                answer++;
                line.remove(size-1);
            }
            else if(line.get(size-1)+line.get(0)<=limit){
                answer++;
                line.remove(size-1);
                if(line.size()==0){
                    break;
                }
                line.remove(0);
            }
            else{
                answer++;
                line.remove(size-1);
            }
            
            size=line.size();
        }
        
        return answer;
    }
}
