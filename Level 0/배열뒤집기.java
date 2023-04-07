class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=0;i<num_list.length;i++){
            for(int j=num_list.length-i;j>0;j--){
                answer[j-1]=num_list[i];
            }
        }
        return answer;
    }
}
