class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int start=0;
        int index=0;
        int count=0;
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                start=i;
                for(int j=i;j<arr.length;j++){
                    if(arr[j]==2){
                        index=j;
                        count++;
                    }
                }
            }
            
            if(count!=0){
                break;
            }
        }
        
        if(count==0){
            answer=new int[1];
            answer[0]=-1;
        }
        else{
            answer=new int[index-start+1];
            int zero=0;
            for(int i=start;i<=index;i++){
                answer[zero]=arr[i];
                zero++;
            }
        }
        return answer;
    }
}
