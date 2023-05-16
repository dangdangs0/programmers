import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failrate=new double[N];
        int totalhuman=stages.length;
        HashMap<Integer,Integer> fail=new HashMap<>();
        HashSet<Integer> have=new HashSet<>();
        for(int i=0;i<stages.length;i++){
            fail.put(stages[i],fail.getOrDefault(stages[i],0)+1);
        }


        int start=0;
        int stage=1;
        ArrayList<Double>sor=new ArrayList<>();
        for(int i=1;i<=N;i++){
            double input=(double)fail.getOrDefault(stage,0)/(double)totalhuman;
            if(Double.isNaN(input)){
                input=0;
            }
            failrate[start]=input;
            sor.add(failrate[start]);

            totalhuman-=fail.getOrDefault(stage,0);
            start++;
            stage++;
        }

        Collections.sort(sor,Collections.reverseOrder());
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(sor.get(i)==failrate[j]){
                    if(have.contains(j+1)){
                        continue;
                    }
                    else{
                        have.add(j+1);
                        answer[i]=j+1;
                        break;
                    }

                }
            }

        }
        
        
        
        return answer;
    }
}
