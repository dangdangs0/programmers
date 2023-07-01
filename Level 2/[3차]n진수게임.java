class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder result=new StringBuilder();
        int line=t*m;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=line;i++){
            sb.append(Integer.toString(i,n));
        }
        
        int count=0;
        int first=p-1;
        for(int i=0;i<sb.length();i++){
            if(i==first){
                result.append(String.valueOf(sb.charAt(i)));
                first+=m;
                count++;
                if(count==t){
                    break;
                }
            }
        }
        
        answer=result.toString().toUpperCase();
        return answer;
    }
}
