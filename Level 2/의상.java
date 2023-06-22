import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashSet<String> key=new HashSet<>();
        HashMap<String, Integer> hash=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            key.add(clothes[i][1]);
            hash.put(clothes[i][1],hash.getOrDefault(clothes[i][1],0)+1);
        }

        Iterator it=key.iterator();
        while(it.hasNext()){
            answer*=(hash.get(it.next())+1);
        }
        return answer-1;
    }
}
