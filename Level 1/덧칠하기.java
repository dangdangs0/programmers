class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean isLoop=true;
        
        boolean[] wall=new boolean[n];
        for(int i=0;i<n;i++){
            wall[i]=true;
        }
        for(int i=0;i<section.length;i++){
            wall[section[i]-1]=false;//까진 부분 1.2.5
        }
        
        while(isLoop){
            int index=0;
            for(int i=0;i<n;i++){
                if(wall[i]){//모두가 다 트루,,
                    isLoop=false;
                }
                else{//제일 처음 false를 구하자
                    index=i;
                    isLoop=true;
                    break;
                }
            }
            
            if(!isLoop){
                break;
            }
            for(int i=0;i<m;i++){
                //롤러 크기
                wall[index]=true;
                index++;
                if(index==wall.length){
                    break;
                }
            }
            answer++;//한번 칠함
        }
        
        
        return answer;
    }
}
