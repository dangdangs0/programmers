import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            p.add(scoville[i]);
        }
        
        //가장 맵지 않은 것과, 두번째로 매운 것을 꺼낸다.
        while(p.peek()<K){
            if(p.peek()>=K){
                break;
            }
            else{
                int total=0;
                if(p.size()==0){
                    return -1;
                }
                total+=p.poll();
                if(p.size()==0){
                    return -1;
                }
                total=total+(p.poll()*2);
                //첫번째, 두번째 추출함
                p.add(total); //제일 앞에 넣음
                
                answer++;
            }
        }
        
        return answer;
    }
}
