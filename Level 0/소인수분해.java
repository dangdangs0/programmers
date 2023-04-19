import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        String string="";
        int count=0;
        String a="";
        int[] array=new int[100];
        
        for(int i=2;i<=n;i++){
            if(n%i==0){
                a=String.valueOf(i);
                n=n/i;
                
                if(string.contains(a)){
                    i=1;
                    continue;
                }
                else{
                    string=string+a;
                    array[count]=i;
                    i=1;
                    count++;
                    continue;
                }
            }
        }
        int[] answer = new int[count];
        
        for(int i=0;i<count;i++){
            answer[i]=array[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
