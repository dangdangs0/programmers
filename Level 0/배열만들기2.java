class Solution {
    public int[] solution(int l, int r) {
        int[] temp = new int[1000000];
        int start=l;
        int count=0;
        
        for(int i=l;i<=r;i++){
            String str=String.valueOf(start);
            str=str.replace("5","");
            str=str.replace("0","");
            
            if(str.equals("")){
                temp[count]=start;
                count++;
            }
            start++;
        }
        int[] answer;
        if(count==0){
            answer=new int[1];
            answer[0]=-1;
        }
        else{
            answer=new int[count];
            for(int i=0;i<count;i++){
                answer[i]=temp[i];
            }
        }
        
        return answer;
    }
}
