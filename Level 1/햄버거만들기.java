import java.util.ArrayList;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int len=ingredient.length;
        ArrayList<Integer> ham=new ArrayList<>();
        int index=0;
        
        for(int i=0;i<len;i++){
            ham.add(ingredient[i]);
            if(ham.get(index)==3 && i+1 !=len && i>=2){
                if(ham.size()>=3 && ingredient[i+1]==1 && ham.get(index-2)==1 && ham.get(index-1)==2){
                    answer++;
                    
                    for(int j=0;j<3;j++){
                        ham.remove(ham.size()-1);
                    }
                    i=i+1;
                    index=index-3;
                    
                }
            }
            index++;
        }
        
        
        
        return answer;
        //시간 초과 (4,5, 7,8)
//         StringBuilder sb=new StringBuilder();
//         boolean isLoop=true;
        
//         for(int i=0;i<len;i++){
//             sb.append(String.valueOf(ingredient[i]));
//         }
//         String ham=sb.toString();
//         int pre=ham.length();
//         int p=0;
//         while(isLoop){
//             ham=ham.replaceFirst("1231","");
            
//             if(p==ham.length()){
//                 break;
//             }
            
//             p=ham.length();
//         }
        
//         int post=ham.length();
//         answer=(pre-post)/4;
        
    }
}
