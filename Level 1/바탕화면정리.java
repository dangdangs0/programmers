class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int top=-1;
        int left=-1;
        int right=0;
        int bottom=0;
        
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    //아이콘 있음
                    if(top==-1){
                        top=i;
                    }
                    else if(top>i){
                        top=i;
                    }
                    
                    if(left==-1){
                        left=j;
                    }
                    else if(left>j){
                        left=j;
                    }
                 
                    if(right<j){
                        right=j;
                    }
                    
                    if(bottom<i){
                        bottom=i;
                    }
                            
                }
            }
        }
        
        answer[0]=top;
        answer[1]=left;
        answer[2]=bottom+1;
        answer[3]=right+1;
        
        
        return answer;
    }
}
