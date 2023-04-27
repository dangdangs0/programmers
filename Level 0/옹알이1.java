class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean once=false;
        int count=0;
        for(int i=0;i<babbling.length;i++){
            String temp=babbling[i];
            if(temp.contains("aya")){
                temp=temp.replaceFirst("aya"," ");
                once=true;
            }
            if(temp.contains("ye")){
                temp=temp.replaceFirst("ye"," ");
                once=true;
            }
            if(temp.contains("woo")){
                temp=temp.replaceFirst("woo"," ");
                once=true;
            }
            if(temp.contains("ma")){
                temp=temp.replaceFirst("ma"," ");
                once=true;
            }
            
            if(once){
                temp=temp.replace(" ","");
                if(temp.equals("")){//옹알이~
                    count++;   
                }
            }
            once=false;
            
        }
        answer=count;
        return answer;
    }
}
