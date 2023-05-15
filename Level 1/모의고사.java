class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] first=new int[answers.length];
        int start=1;
        for(int i=0;i<answers.length;i++){
            first[i]=start;
            start++;
            if(start>5){
                start=1;
            }
        }
        
        int[] second=new int[answers.length];
        int se=1;
        for(int i=0;i<answers.length;i++){
            if(i%2==0){
                second[i]=2;
            }
            else{
                second[i]=se;
                se++;
                if(se>5){
                    se=1;
                }
                else if(se==2){
                    se=3;
                }
            }
        }
        
        int[] third=new int[answers.length];
        int thi=3;
        int count=0;
        for(int i=0;i<answers.length;i++){
            third[i]=thi;
            count++;
            
            if(count==2){
                if(thi==3){
                    thi=1;
                }
                else{
                    thi++;
                    if(thi==3){
                        thi=4;
                    }
                    else if(thi>5){
                        thi=3;
                    }
                }
                
                count=0;
            }
        }
        
        int one=0,two=0,three=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==first[i]){
                one++;
            }
            if(answers[i]==second[i]){
                two++;
            }
            if(answers[i]==third[i]){
                three++;
            }
        }
        
        if(one>two){
            if(one>three){
                answer=new int[1];
                answer[0]=1;
            }
            else if(one<three){
                answer=new int[1];
                answer[0]=3;
            }
            else{
                answer=new int[2];
                answer[0]=1;
                answer[1]=3;
            }
        }
        else if(one<two){
            if(two>three){
                answer=new int[1];
                answer[0]=2;
            }
            else if(two<three){
                answer=new int[1];
                answer[0]=3;
            }
            else{
                answer=new int[2];
                answer[0]=2;
                answer[1]=3;
            }
        }
        else{
            if(two>three){
                answer=new int[2];
                answer[1]=2;
                answer[0]=1;
            }
            else if(two<three){
                answer=new int[1];
                answer[0]=3;
            }
            else{
                answer=new int[3];
                answer[0]=1;
                answer[1]=2;
                answer[2]=3;
            }
        }
        return answer;
    }
}
