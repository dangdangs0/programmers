class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int start=i;start<=j;start++){
            if(String.valueOf(start).contains(String.valueOf(k))){
                for(int s=0;s<String.valueOf(start).length();s++){
                    if(String.valueOf(String.valueOf(start).charAt(s)).equals(String.valueOf(k))){
                        answer++;
                    }
                }
                
            }
        }
        return answer;
    }
}
