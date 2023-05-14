import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> num=new HashSet<>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                num.add(numbers[i]+numbers[j]);
            }
        }
        
        answer=new int[num.size()];
        
        Iterator<Integer> it=num.iterator();
        int a=0;
        while(it.hasNext()){
            answer[a]=it.next();
            a++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
