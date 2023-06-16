import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> arr=new ArrayList<>();
        
        int count=0;
        
        if(cacheSize==0){
            return cities.length*5;
        }
        for(int i=0;i<cities.length;i++){
            String s=cities[i].toLowerCase();
            if(arr.contains(s)){
                arr.remove(s);
                arr.add(s);//제일 뒤로 보내줌
                answer=answer+1;
            }
            else{
                if(count==cacheSize){//ex. count가 3이됨
                    arr.remove(0);//제일 사용 안된거 제거
                    arr.add(s);
                    answer=answer+5;
                }
                else{
                    arr.add(s);
                    answer=answer+5;
                    count++;
                }
                
            }
        }
        
        return answer;
    }
}
