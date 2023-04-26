class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int count=0;
        int[] tempanswer=new int[intStrs.length];
        
        for(int j=0;j<intStrs.length;j++){
            String temp="";
            for(int i=s;i<s+l;i++){
                temp=temp+intStrs[j].charAt(i);
            }
            if(Integer.valueOf(temp)>k){
                tempanswer[count]=Integer.valueOf(temp);
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i=0;i<count;i++){
            answer[i]=tempanswer[i];
        }
        return answer;
    }
}
