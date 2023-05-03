class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len=arr.length;
        int i=0;
        while(len>Math.pow(2,i)){
            i++;
        }
        
        int size=(int)Math.pow(2,i);
        answer=new int[size];
        for(int j=0;j<len;j++){
            answer[j]=arr[j];
        }
        
        for(int j=len;j<size;j++){
            answer[j]=0;
        }
        return answer;
    }
}
