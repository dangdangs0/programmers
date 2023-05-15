class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int start=0;
        switch(a){
            case 1: case 4: case 7:
                start=6;
                break;
            case 2: case 8:
                start=2;
                break;
            case 3: case 11 :
                start=3;
                break;
            case 5 :
                start=1;
                break;
            case 6 :
                start=4;
                break;
            case 9: case 12:
                start=5;
                break;
            case 10:
                start=7;
                break;
        }
        for(int i=0;i<=4;i++){
            if((1+7*i)<=b && b<(1+7*(i+1))){
                int distance=b-(1+7*i);
                answer=week(start+distance);
            }
        }
        return answer;
    }
    
    public String week(int n){
        String word="";
        if(n>=8){
            n=n-7;
        }
        switch(n){
            case 1:
                word="SUN";
                break;
            case 2:
                word="MON";
                break;
            case 3:
                word="TUE";
                break;
            case 4:
                word="WED";
                break;
            case 5:
                word="THU";
                break;
            case 6:
                word="FRI";
                break;
            case 7:
                word="SAT";
                break;
        }
        return word;
    }
}
