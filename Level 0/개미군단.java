class Solution {
    public int solution(int hp) {
        int answer = 0;
        int gen=5;
        int war=3;
        int work=1;
        int count=0;
        int total=0;
        
        while(hp>0){
            if(hp/gen>0){
                count=hp/gen;
                hp=hp-count*gen;
                total=total+count;
            }
            if(hp/war>0){
                count=hp/war;
                hp=hp-count*war;
                total+=count;
            }
            else{
                total=total+hp;
                hp=hp-hp;
            }
        }
        
        answer=total;
        return answer;
    }
}
