import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> result=new ArrayList<>();
        ArrayList<Integer> s=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            arr.add(i,progresses[i]);
            s.add(i,speeds[i]);
        }
        for(int i=0;i<progresses.length;i++){
            queue.add(progresses[i]); // 93, 30, 55
        }

        int count=0;
        while(!queue.isEmpty()){
            int add=0;
            for(int i=0;i<arr.size();i++){
                arr.set(i,arr.get(i)+s.get(i));//30+30
            }

            queue.clear();
            for(int i=0;i<arr.size();i++){
                queue.add(arr.get(i)); // 93, 30, 55
            }
            if(queue.peek()>=100){
                queue.poll();
                arr.remove(0);
                s.remove(0);
                add++;
                for(int i=0;i<arr.size();i++){
                    if(queue.peek()>=100){
                        queue.poll();
                        arr.remove(0);
                        s.remove(0);
                        add++;
                        i=-1;
                    }
                }
                result.add(add);
                count++;
            }
            
            
        }
        
        answer=new int[count];
        for(int i=0;i<count;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}
