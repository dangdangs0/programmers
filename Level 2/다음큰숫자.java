class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean isLoop=true;
        String stand=Integer.toBinaryString(n);
        int countone=One(stand);
        
        int next=n+1;
        while(isLoop){
            
            
            String t=Integer.toBinaryString(next);
            int c=One(t);
            
            if(c==countone){
                answer=next;
                isLoop=false;
                break;
            }
            
            next++;
            
        }
        
        return answer;
    }
    
    public static int One(String s){
        int counting=0;
        int len=s.length();
        char[] c=s.toCharArray();
        for(int i=0;i<len;i++){
            if(c[i]=='1'){
                counting++;
            }
        }
        
        return counting;
    }
}
