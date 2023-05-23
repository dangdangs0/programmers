import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        int size=players.length;
        int call=callings.length;
        
        HashMap<String,Integer>runner=new HashMap<>();
        HashMap<Integer,String>rank=new HashMap<>();
        
        String[] answer = new String[size];
        for(int i=0;i<size;i++){
            runner.put(players[i],i+1);
            rank.put(i+1,players[i]);
        }
        //mumu : 1 , soe : 2, poe : 3, kai : 4, mine : 5
        //1: mumu ... 
        
        for(int i=0;i<call;i++){
            int prerank=runner.get(callings[i]);
            //prerank:4
            String frontpeople=rank.get(prerank-1);
            //3등은 poe
            
            runner.put(callings[i],prerank-1);
            //3등으로 바꿈
            rank.put(prerank-1,callings[i]);
            //3등은 kai
            runner.put(frontpeople,prerank);
            //poe는 4등
            rank.put(prerank,frontpeople);
            //4등은 poe
        }
        
        for(int i=1;i<=size;i++){
            answer[i-1]=rank.get(i);
        }
        
        
        
        //9~13번 시간초과
//         ArrayList<String> running=new ArrayList<>();
        
//         for(int i=0;i<size;i++){
//             running.add(players[i]);
//         }
        
//         for(int i=0;i<call;i++){
//             int index=running.indexOf(callings[i]);
//             //index는 3이 됨
//             running.remove(index);
//             running.add(index-1,callings[i]);
//         }
        
//         for(int i=0;i<size;i++){
//             answer[i]=running.get(i);
//         }
        return answer;
    }
}
