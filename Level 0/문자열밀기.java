import java.util.ArrayList;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        ArrayList<String> temp=new ArrayList<String>();
        boolean isRoop=true;
        int len=A.length();
        int count=0;
        
        for(int j=0;j<A.length();j++){
            temp.add(String.valueOf(A.charAt(j)));
        }
        
        while(isRoop){
            String forcheck="";
            for(int j=0;j<A.length();j++){
                forcheck+=temp.get(j);
            }
            
            if(forcheck.equals(B)){
                isRoop=false;
                break;
            }
            else{
                String in=temp.get(len-1);
                temp.add(0,in);
                answer++;
            }
            
            if(answer>len){
                answer=-1;
                isRoop=false;
                break;
            }
        }
        
        return answer;
    }
}
