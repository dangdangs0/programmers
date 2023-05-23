import java.util.HashMap;
class Solution {
    public static HashMap<String, Integer> result=new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] item={"R","T","F","C","M","J","A","N"};
        
        int len=survey.length;
        
        for(int i=0;i<item.length;i++){
            result.put(item[i],0);
        }
        for(int i=0;i<len;i++){
            String front=String.valueOf(survey[i].charAt(0));
            String back=String.valueOf(survey[i].charAt(1));
            
            put(front,back,choices[i]);
        }
        
        for(int i=0;i<item.length;i++){
            //R과 T 비교
            if(result.get(item[i])>result.get(item[i+1])){
                answer+=item[i];
            }
            else if(result.get(item[i])<result.get(item[i+1])){
                answer+=item[i+1];
            }
            else{
                //누가 더 앞에 있는가? a<b가 true임
                if(item[i].charAt(0)>item[i+1].charAt(0)){
                    answer+=item[i+1];
                }
                else{
                    answer+=item[i];
                }
            }
            
            i=i+1;
            
        }
        
        return answer;
    }
    
    public static void put(String front,String back, int n){
        switch(n){
            case 1:
                result.put(front,result.get(front)+3);
                break;
            case 2:
                result.put(front,result.get(front)+2);
                break;
            case 3:
                result.put(front,result.get(front)+1);
                break;
            case 5:
                result.put(back,result.get(back)+1);
                break;
            case 6:
                result.put(back,result.get(back)+2);
                break;
            case 7:
                result.put(back,result.get(back)+3);
                break;
        }
        
        
    }
}
