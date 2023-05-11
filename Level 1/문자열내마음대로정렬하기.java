class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        int len=strings.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(strings[i].charAt(n)>=strings[j].charAt(n)){//sun과 bed
                    if(strings[i].charAt(n)==strings[j].charAt(n)){
                        //c와 c로 같다
                        if(strings[i].compareTo(strings[j])>0){
                            //abce와 abcd
                            String temp=strings[i];
                            strings[i]=strings[j];
                            strings[j]=temp;
                        }
                        
                    }
                    else{
                        String temp=strings[i];
                        strings[i]=strings[j];
                        strings[j]=temp;
                    }
                }
            }
        }
        answer=strings;
        return answer;
    }
}
