class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] score=new int[3];
        char[] dart=dartResult.toCharArray();
        int go=1;
        for(int i=0;i<dart.length;i++){
            if(dart[i]=='*'){//스타상은 지금 점수랑 이전 점수만!
                if(go==2){//score[0]만 저장되어있는 경우. 실질적 go가 1
                    score[0]*=2;
                }
                else if(go==3){
                    score[0]*=2;
                    score[1]*=2;
                }
                else if(go==4){
                    score[1]*=2;
                    score[2]*=2;
                }
            }
            else if(dart[i]=='#'){//아차상은 현재 점수만! 
                if(go==2){//실질상 하나 던졌는데 아차상 뜬거,,
                    score[0]*=-1;
                }
                else if(go==3){
                    score[1]*=-1;
                }
                else if(go==4){
                    score[2]*=-1;
                }
                
            }
            else if('0'<=dart[i] && dart[i]<='9'){
                if(dart[i]=='1' && dart[i+1]=='0'){//10
                    score[go-1]=10;
                    
                    if(dart[i+2]=='D'){
                        score[go-1]=10*10;
                    }
                    else if(dart[i+2]=='T'){
                        score[go-1]=10*10*10;
                    }
                    i=i+2;
                    go++;
                }
                else{
                    int num=dart[i]-'0';
                    if(dart[i+1]=='S'){
                        score[go-1]=num;
                    }
                    else if(dart[i+1]=='D'){
                        score[go-1]=num*num;
                    }
                    else if(dart[i+1]=='T'){
                        score[go-1]=num*num*num;
                    }
                    go++;
                    i=i+1;
                }
            }
        }
        
        for(int i=0;i<3;i++){
            answer+=score[i];
        }
        return answer;
    }
}
