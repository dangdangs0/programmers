class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long compare=Long.valueOf(p);
        int len=p.length();
        
        for(int i=0;i<t.length();i++){
            String temp="";
            if(i+len-1==t.length()){
                break;
            }
            for(int j=i;j<len+i;j++){
                temp+=t.charAt(j);
            }
            long tt=Long.valueOf(temp);//314
            
            if(tt<=compare){
                answer++;
            }
        }
        
        
        return answer;
    }
}
