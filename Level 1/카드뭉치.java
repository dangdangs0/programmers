import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> c1=new LinkedList<>();
        Queue<String> c2=new LinkedList<>();
        
        int len1=cards1.length;
        int len2=cards2.length;
        for(int i=0;i<len1;i++){
            c1.add(cards1[i]);
        }
        for(int i=0;i<len2;i++){
            c2.add(cards2[i]);
        }
        //각각의 큐에 저장. FIFO
        for(int i=0;i<goal.length;i++){
            if(goal[i].equals(c1.peek())){
                c1.poll();
            }
            else if(goal[i].equals(c2.peek())){
                c2.poll();
            }
            else{//같은게 없다!!
                answer="No";
                return answer;
            }
        }
        return answer;
    }
}
