class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0;i<my_string.length();i++){
            if('A'<=my_string.charAt(i) && my_string.charAt(i)<='Z'){
                int index=my_string.charAt(i)-'A';
                answer[index]++;
            }
            else{
                int index=my_string.charAt(i)-'A'-6; //6개의 문자가 사이에잇음
                answer[index]++;
            }
            
        }
        return answer;
    }
}
