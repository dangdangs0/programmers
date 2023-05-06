class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int count=0;
        
        for(int i=0;i<picture.length;i++){
            char[] ch=picture[i].toCharArray();
            String temp="";

            for(int j=0;j<ch.length;j++){
                for(int z=0;z<k;z++){
                    temp+=ch[j];   
                }
            }
            for(int j=0;j<k;j++){
                answer[count]=temp;
                count++;
            }
        }
        
        return answer;
    }
}
