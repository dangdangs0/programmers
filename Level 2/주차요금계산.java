import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Solution {
    public int[] solution(int[] fees, String[] records) throws ParseException {
        int[] answer = {};
        HashMap<String, Integer> totalT=new HashMap<>();
        //들어온 차가 다시 들어올 수 있으므로 getOrDefault로 이전값에 추가해주자
        //차번호, 누적 주차 시간
        
        for(int i=0;i<records.length;i++){
            String[] temp=records[i].split(" ");
            String carnum=temp[1];
            Date in=new SimpleDateFormat("HH:mm").parse(temp[0]);
            
            if(temp[2].equals("OUT")){
                continue;
            }
            else if(i==records.length-1){
                Date out=new SimpleDateFormat("HH:mm").parse("23:59");
                long diffMin=(out.getTime()-in.getTime())/60000;
                totalT.put(carnum,totalT.getOrDefault(carnum,0)+(int)diffMin);
            }
            
            for(int j=i+1;j<records.length;j++){
                String[] s=records[j].split(" ");
                String find=s[1];
                if(carnum.equals(find)){
                    //OUT이 records에 존재
                    Date out=new SimpleDateFormat("HH:mm").parse(s[0]);
                    long diffMin=(out.getTime()-in.getTime())/60000;
                    totalT.put(carnum,totalT.getOrDefault(carnum,0)+(int)diffMin);
                    break;
                }
                else if(j==records.length-1){
                    //23:59
                    Date out=new SimpleDateFormat("HH:mm").parse("23:59");
                    long diffMin=(out.getTime()-in.getTime())/60000;
                    totalT.put(carnum,totalT.getOrDefault(carnum,0)+(int)diffMin);
                }
            }
        }
        
        HashMap<String, Integer> result=new HashMap<>();
        
        Iterator<String> keys=totalT.keySet().iterator();
        while(keys.hasNext()){
            String key=keys.next();
            int totaltime=(int)totalT.get(key);
            int pay=0;
            if(totaltime<=fees[0]){
                pay=fees[1];
            }else{
                pay+=fees[1];//기본 요금
                int remain=totaltime-fees[0];
                int n=0;
                if(remain%fees[2]!=0){
                    n=remain/fees[2]+1;
                }
                else{
                    n=remain/fees[2];
                }
                n=n*fees[3];
                pay+=n;
            }
            
            result.put(key,pay);
        }
        
        answer=new int[result.size()];
        List<String> list=new ArrayList<>(result.keySet());
        list.sort((s1,s2)->s1.compareTo(s2));
        int start=0;
        for(String key:list){
            answer[start]=result.get(key);
            start++;
        }
        
        return answer;
    }
}
