import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> player=new HashMap<>();
        for(int i=0;i<participant.length;i++){
            player.put(participant[i],player.getOrDefault(participant[i],0)+1);
        }
        for(int i=0;i<completion.length;i++){
            int t=player.get(completion[i]);
            player.put(completion[i],t-1);
        }
        
        for(int i=0;i<participant.length;i++){
            if(player.get(participant[i])>=1){
                answer=participant[i];
                break;
            }
        }
        
        
        return answer;
    }
}
