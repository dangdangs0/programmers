class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int service=0;
        int remain=0;
        
        do{
            service+=chicken/10; //108마리
            remain=chicken%10; //1장
            remain+=chicken/10;//1장 + 108장.. remain 총 109장
            
            chicken=remain;
        }while(remain>=10);
        
        
        
        answer=service;
        
        return answer;
    }
}
