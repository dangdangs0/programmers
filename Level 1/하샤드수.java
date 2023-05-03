class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int len=Integer.valueOf(String.valueOf(x).length());
        
        int sum=0;
        String temp=String.valueOf(x);
        for(int i=0;i<len;i++){
            sum+=temp.charAt(i)-'0';
        }
        
        if(x%sum==0){
            answer=true;
        }
        else{
            answer=false;
        }
        return answer;
    }
}
