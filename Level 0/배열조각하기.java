import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer;
        ArrayList <Integer> arrList= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            arrList.add(arr[i]);
        }
        
        for(int i=0;i<query.length;i++){
            int count=0;
            if(i%2==0){//짝수 인덱스
                int j=query[i]+1;
                int len=arrList.size();
                count=0;
                
                if(len==j){
                    continue;
                }
                while(count!=len-query[i]-1){
                    arrList.remove(query[i]+1);
                    
                    count++;
                }
            }
            else{//홀수 인덱스
                count=0;
                while(count!=query[i]){
                    arrList.remove(0);
                    count++;
                }
            }
        }
        
        
        answer=new int[arrList.size()];
        for(int i=0;i<arrList.size();i++){
            answer[i]=arrList.get(i);
        }
        return answer;
    }
}
