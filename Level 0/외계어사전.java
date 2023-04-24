class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        String temp="";
        
        for(int i=0;i<dic.length;i++){
            temp=dic[i];
            for(int j=0;j<spell.length;j++){
                
                temp=temp.replaceFirst(spell[j],"");
                
            }
            if((dic[i].length()-temp.length())==spell.length){
                //길이차가 spell 길이만큼 나면, 그니까 모두 하나씩 사용
                answer=1;
                break;
            }
            else{
                answer=2;
            }
        }
        return answer;
    }
}
