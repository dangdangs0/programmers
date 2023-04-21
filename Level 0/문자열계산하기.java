class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int a,b;
        int num=0;
        
        String[] array=my_string.split(" ");
        
        num=Integer.parseInt(array[0]);
        for(int i=1;i<array.length;i++){
            if(array[i].equals("+")){
                num=num+Integer.parseInt(array[i+1]);
            }
            else{
                num=num-Integer.parseInt(array[i+1]);
            }
            i=i+1;
        }
        
        answer=num;
        
        
        return answer;
    }
}
