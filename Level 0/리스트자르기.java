class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a=slicer[0];
        int b=slicer[1];
        int c=slicer[2];
        int len=num_list.length;
        
        
        if(n==1){
            answer=new int[b+1];
            for(int i=0;i<=b;i++){
                answer[i]=num_list[i];
            }
        }
        else if(n==2){
            answer=new int[len-a];
            int count=0;
            for(int i=a;i<len;i++){
                answer[count]=num_list[i];
                count++;
            }
        }
        else if(n==3){
            answer=new int[b-a+1];
            int count=0;
            for(int i=a;i<=b;i++){
                answer[count]=num_list[i];
                count++;
            }
        }
        else{
            
            
            if((a+b)/c ==0){
                answer= new int[1];
            }
            else{
                int size=(b-a+1)/c + (b-a+1)%c;
                if(a==0){
                    answer=new int[size];
                }
                else{
                    answer=new int[size];
                }
                
            }
            
            int count=0;
            for(int i=a;i<=b;i=i+c){
                answer[count]=num_list[i];
                count++;
            }
        }
        return answer;
    }
}
