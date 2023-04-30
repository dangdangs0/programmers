class Solution {
    public int solution(int[] arr) {
        int answer =0;
        int count=0;
        int[] temp=new int[arr.length];
        boolean isLoop=true;
        
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        
        while(isLoop){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]=arr[i]/2;
                }
                else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i]=arr[i]*2+1;
                }
                
            }
            for(int i=0;i<arr.length;i++){
                if(temp[i]!=arr[i]){//하나라도 안같으면..
                    isLoop=true;
                    break;
                }
                else{
                    isLoop=false;
                }
            }
            if(!isLoop){
                answer=count;
                break;
            }
            count++;
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
        }
        
        return answer;
    }
}
