class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=0;i<myString.length();i++){
            String compare="";
            int start=i;
            if(myString.length()<start+pat.length()){
                break;
            }
            else{
                for(int j=0;j<pat.length();j++){//pat길이만큼 분할해서 비교하자
                compare+=String.valueOf(myString.charAt(start));
                start++;
            }
            
                if(compare.equals(pat)){//ex.ban==ana ? 
                    answer++;                
                }
            }
            
        }
        
        return answer;
    }
}
