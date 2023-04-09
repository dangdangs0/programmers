
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count=0;
        int max=0;
        int temp=0;
        
        for(int i=0;i<array.length;i++){  //정렬
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        
        
        for(int i=0;i<array.length;i++){ //최빈값 탐색
            count=0;
            for(int j=i;j<array.length;j++){
                
                if(array[i]==array[j]){
                    count=count+1;
                }
                else break;
            }
            if(max<count){
                max=count;
                answer=array[i];
            }
            else if(max==count){
                answer=-1;
            }
            i=i+count-1;
        }
        
         return answer;
    }
}
