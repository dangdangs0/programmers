import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        HashMap<String,Integer> dic=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int A=65;
        for(int i=0;i<26;i++){
            char c=(char)A;
            dic.put(String.valueOf(c),i+1);
            A++;
        }
        //해시에 값 추가
        int next=27;
        
        LZW(dic,arr,msg);
        
        answer=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
    
    public static void LZW(HashMap<String, Integer> dic, ArrayList<Integer> arr, String msg){
        for(int i=0;i<msg.length();i++){
            String str=msg.substring(0,i+1);
            if(!dic.containsKey(str)){
                dic.put(str,dic.size()+1);
                arr.add(dic.get(msg.substring(0,i)));
                LZW(dic,arr,msg.substring(i));
                break;
            }
            else{
                if(i+1==msg.length()){
                    arr.add(dic.get(msg.substring(0,i+1)));
                }
            }
        }
    }
}
