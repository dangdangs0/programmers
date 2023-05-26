class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count=0;
        int remove=0;
        
        while(!s.equals("1")){
            count++;
            int previous=s.length();
            //1. 0제거
            s=s.replace("0","");
            int now=s.length();
            remove+=previous-now;
            if(s.equals("1")){
                break;
            }
            
            //2. s의 길이(now)를 2진법으로 표현한 문자열이 s
            s=binaray(now);
            
            if(s.equals("1")){
                break;
            }
        }
        
        answer[0]=count;
        answer[1]=remove;
        return answer;
    }
    
    public static String binaray(int n){
        StringBuilder sb=new StringBuilder();
        while(n>=2){
            sb.append(String.valueOf(n%2));
            n=n/2;
            
            if(n<2){
                sb.append(String.valueOf(n));
                break;
            }
        }
        
        String bin=sb.reverse().toString();
        
        return bin;
    }
}
