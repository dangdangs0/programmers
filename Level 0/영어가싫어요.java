
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        boolean isRoop=true;
        
        
        while(isRoop){
            numbers=convertNum(numbers);
            for(int i=0;i<numbers.length();i++){
                if('a'<=numbers.charAt(i) && numbers.charAt(i)<='z'){
                    break;
                } //아직 영어가 남아있으면
                else{
                    isRoop=false;
                    break;
                }
            }
            
        }
        answer=Long.parseLong(numbers);
        
        return answer;
    }
    
    public static String convertNum(String s){
        if(s.contains("zero")){
            s=s.replace("zero","0");
        }
        if(s.contains("one")){
            s=s.replace("one","1");
        }
        if(s.contains("two")){
            s=s.replace("two","2");
        }
        if(s.contains("three")){
            s=s.replace("three","3");
        }
        if(s.contains("four")){
            s=s.replace("four","4");
        }
        if(s.contains("five")){
            s=s.replace("five","5");
        }
        if(s.contains("six")){
            s=s.replace("six","6");
        }
        if(s.contains("seven")){
            s=s.replace("seven","7");
        }
        if(s.contains("eight")){
            s=s.replace("eight","8");
        }
        if(s.contains("nine")){
            s=s.replace("nine","9");
        }
        
        return s;
    }
}
