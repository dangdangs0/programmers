class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp=' ';
        char[] charArray=my_string.toCharArray();
        
        temp=charArray[num1];
        charArray[num1]=charArray[num2];
        charArray[num2]=temp;
        
        answer=String.valueOf(charArray);
        
        return answer;
    }
}
