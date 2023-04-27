class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int len=my_string.length();
        String[][] cutting=new String[len/m][m];
        
        int count=0;
        for(int i=0;i<len/m;i++){
            for(int j=0;j<m;j++){
                cutting[i][j]=String.valueOf(my_string.charAt(count));
                count++;
            }
        }
        
        for(int i=0;i<len/m;i++){
            answer=answer+cutting[i][c-1]; //입력값은 인덱스가 아니더라
            
        }
        
        return answer;
    }
}
