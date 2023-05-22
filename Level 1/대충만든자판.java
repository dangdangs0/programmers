import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        //각각 알파벳 저장해두자
        HashMap<String,Integer> alpha=new HashMap<>();
        char s='A';
        for(int i=0;i<26;i++){
            String temp=String.valueOf(s);
            alpha.put(temp,-1);
            s=(char)(s+1);
        }
        
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                //"ABACD" 중 "A"
                String key=String.valueOf(keymap[i].charAt(j));
                if(alpha.get(key)!=-1 && alpha.get(key)>=j+1){
                    alpha.put(key,j+1);
                }
                else if(alpha.get(key)==-1){
                    alpha.put(key,j+1);
                }
            }
        }
        
        for(int i=0;i<targets.length;i++){
            int sum=0;
            for(int j=0;j<targets[i].length();j++){
                String key=String.valueOf(targets[i].charAt(j));
                
                if(alpha.get(key)==-1){
                    sum=-1;
                    break;
                }
                else{
                    sum+=alpha.get(key);
                }
            }
            answer[i]=sum;
        }
        return answer;
    }
}
