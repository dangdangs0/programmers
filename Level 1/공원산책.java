class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x=0;
        int y=0;
        int maxX=park.length-1;
        int maxY=park[0].length()-1;
        boolean check=false;
        boolean[][] isOk=new boolean[maxX+1][maxY+1];
        
        for(int i=0;i<maxX+1;i++){
            for(int j=0;j<maxY+1;j++){
                if(park[i].charAt(j)=='S'){
                    x=i;
                    y=j;
                    isOk[i][j]=true;
                }
                else if(park[i].charAt(j)=='O'){
                    isOk[i][j]=true;
                }
                else{
                    isOk[i][j]=false;
                }
            }
        }
        
        for(int j=0;j<routes.length;j++){
            String[] temp=routes[j].split(" ");
            String direct=temp[0];
            int len=Integer.valueOf(temp[1]);
            int tempx=x;
            int tempy=y;
            check=false;
            
            switch(direct){
                  case "E":
                    //j값 더함
                    for(int i=0;i<len;i++){
                        tempy++;
                        if(tempy>maxY){
                            check=false;
                            break;
                        }
                        if(isOk[tempx][tempy]){
                            //true면 갈 수 있음
                            check=true;
                        }
                        else{
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        y=tempy;
                    }
                    break;
                    
                case "W":
                    //j값 더함
                    for(int i=0;i<len;i++){
                        tempy--;
                        if(tempy<0){
                            check=false;
                            break;
                        }
                        if(isOk[tempx][tempy]){
                            //true면 갈 수 있음
                            check=true;
                        }
                        else{
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        y=tempy;
                    }
                    break;
                    
                case "S":
                    //j값 더함
                    for(int i=0;i<len;i++){
                        tempx++;
                        if(tempx>maxX){
                            check=false;
                            break;
                        }
                        if(isOk[tempx][tempy]){
                            //true면 갈 수 있음
                            check=true;
                        }
                        else{
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        x=tempx;
                    }
                    break;
                    
                case "N":
                    //j값 더함
                    for(int i=0;i<len;i++){
                        tempx--;
                        if(tempx<0){
                            check=false;
                            break;
                        }
                        if(isOk[tempx][tempy]){
                            //true면 갈 수 있음
                            check=true;
                        }
                        else{
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        x=tempx;
                    }
                    break;
            }
            
        }
        
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}
