import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0]=0;
        answer[1]=0;
        
        HashSet<String> w=new HashSet<>();
        
        int turn=1;
        int count=1;
        String previous="";
        for(int i=0;i<words.length;i++){
            if(w.isEmpty()){
                w.add(words[i]);
                count++;
                previous=words[i];
            }
            else{
                if(w.contains(words[i])){
                    answer[0]=count;
                    answer[1]=turn;

                    return answer;
                }
                else if(previous.charAt(previous.length()-1)!=(words[i].charAt(0))){
                    answer[0]=count;
                    answer[1]=turn;

                    return answer;
                }
                else{
                    w.add(words[i]);
                    count++;
                    previous=words[i];
                    if(count>n){
                        count=1;
                        turn++;
                    }
                }
            }
            
        }

        return answer;
    }
}
