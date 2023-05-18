import java.util.Arrays;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder output=new StringBuilder();
        
        int lenx=X.length();
        int leny=Y.length();
        int tofindzero=0;
        
        
        int[] xx=new int[10];
        int[] yy=new int[10];
        
        for(int i=0;i<lenx;i++){
            int n=X.charAt(i)-'0';
            xx[n]+=1;
        }
        for(int i=0;i<leny;i++){
            int n=Y.charAt(i)-'0';
            yy[n]+=1;
        }
        //xx[0]=2, xx[1]=1; 그 외 나머지는 다 0
        //yy[2]=1, yy[3]=1 .. 
        
        for(int i=0;i<10;i++){
            if(xx[i]==yy[i] && xx[i]!=0 &&yy[i]!=0){
                output.append(String.valueOf(i).repeat(xx[i]));
                tofindzero+=i;
            }
            else if(xx[i]<yy[i] && xx[i]!=0){
                output.append(String.valueOf(i).repeat(xx[i]));
                tofindzero+=i;
            }
            else if(xx[i]>yy[i] && yy[i]!=0){
                output.append(String.valueOf(i).repeat(yy[i]));
                tofindzero+=i;
            }
        }
        String str=output.toString();
    
        if(str.length()==0){
            answer="-1";
        }
        else if(tofindzero==0){
            answer="0";
        }
        else{
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            
            StringBuilder sb=new StringBuilder(new String(temp));
            answer=sb.reverse().toString();
        }
        return answer;
    }
}
