class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] ch=my_string.toCharArray();
        
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=' ';
        }
        
        String temp=String.valueOf(ch);
        temp=temp.replace(" ","");
        
        answer=temp;
        return answer;
    }
}
