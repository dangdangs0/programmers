class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int n=numLog[0];
        
        
        for(int i=1;i<numLog.length;i++){
            if(numLog[i]-n==1){//1차이, 즉 w
                answer=answer+"w";
                n=numLog[i];
            }
            if(numLog[i]-n==10){//10차이, 즉 d
                answer=answer+"d";
                n=numLog[i];
            }
            if(numLog[i]-n==-1){//1차이, 즉 s
                answer=answer+"s";
                n=numLog[i];
            }
            if(numLog[i]-n==-10){//10차이, 즉 a
                answer=answer+"a";
                n=numLog[i];
            }
        }
        
        return answer;
    }
}
