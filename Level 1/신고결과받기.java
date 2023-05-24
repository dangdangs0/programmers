import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> noDup=new HashSet<>();
        ArrayList<String> realReport=new ArrayList<>();
        HashMap<String,Integer> time=new HashMap<>();
        HashMap<String,Integer> reporter=new HashMap<>();
        
        for(int i=0;i<id_list.length;i++){
            time.put(id_list[i],0);
            reporter.put(id_list[i],0);
        }
        
        for(int i=0;i<report.length;i++){
            noDup.add(report[i]);
        }
        //apeach frodo는 한번만 나옴
        
        Iterator<String> it=noDup.iterator();
        while(it.hasNext()){
            realReport.add(it.next());
        }
        
        for(int i=0;i<realReport.size();i++){
            String[] temp=realReport.get(i).split(" ");
            //처음은 신고한 사람
            //두번째가 신고당한 사람
            time.put(temp[1],time.get(temp[1])+1);
        }
        
        for(int i=0;i<realReport.size();i++){
            String[] temp=realReport.get(i).split(" ");
            //처음은 신고한 사람
            //두번째가 신고당한 사람
            if(time.get(temp[1])>=k){
                //이메일 받음
                reporter.put(temp[0],reporter.get(temp[0])+1);
            }
        }
        
        for(int i=0;i<id_list.length;i++){
            answer[i]=reporter.get(id_list[i]);
        }
        
        return answer;
    }
}
