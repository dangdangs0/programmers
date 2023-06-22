import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        String temp=s.replace("{","").replace("}","");
        String[] t=temp.split(",");
        
        HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<t.length;i++){
            h.put(Integer.valueOf(t[i]),h.getOrDefault(Integer.valueOf(t[i]),0)+1);
        }
        
        List<Integer> keySet=new ArrayList<>(h.keySet());
        
        keySet.sort((o1,o2)->h.get(o2).compareTo(h.get(o1)));
        
        int[] answer = new int[h.size()];
        int start=0;
        for(Integer key:keySet){
            answer[start]=key;
            start++;
        }
        
        
        return answer;
    }
}
