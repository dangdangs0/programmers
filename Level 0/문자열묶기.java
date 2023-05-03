class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int max=0;
        for(int i=0;i<strArr.length;i++){
            if(max<strArr[i].length()){
                max=strArr[i].length();
            }
        }
        
        int[] temp=new int[max];
        
        int good=0;
        for(int i=0;i<max;i++){
            for(int j=0;j<strArr.length;j++){
                if(i+1==strArr[j].length()){
                    temp[i]++;
                }
            }
            if(good<temp[i]){
                good=temp[i];
            }
        }
        
        answer=good;
        
        
        return answer;
    }
}
