class Solution {
    public String solution(int[] food) {
        String answer = "";
        String front="";
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                front+=String.valueOf(i);
            }
        }
        StringBuilder sb=new StringBuilder(front);
        String back=sb.reverse().toString();
        answer+=front;
        answer+="0";
        answer+=back;
        return answer;
    }
}
