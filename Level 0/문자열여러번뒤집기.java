class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] strChar=my_string.toCharArray();
        char[] temp=my_string.toCharArray();
        int count=0;
        
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<strChar.length;j++){
                temp[j]=strChar[j];
            }
            count=queries[i][1];
            for(int j=queries[i][0];j<=queries[i][1];j++){
                strChar[j]=temp[count];
                count--;
            }
        }
        
        answer=String.valueOf(strChar);
        return answer;
    }
}
