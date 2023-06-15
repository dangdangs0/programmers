import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set=new HashSet<>();
        int len=elements.length;
        
        for(int i=0;i<len;i++){
            set.add(elements[i]);
        }
        
        int start=2;
        while(start<=len){
            for(int i=0;i<len;i++){
                int sum=0;
                int index=i;
                for(int j=0;j<start;j++){
                    sum+=elements[index];
                    index++;
                    if(index==len) index=0;
                }
                set.add(sum);
            }
            start++;
        }
        
        answer=set.size();
        
        return answer;
    }
}
