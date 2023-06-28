import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<Integer,String> hash=new HashMap<>();
        
        Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length;i++){
            hash.put(i,phone_book[i]);
        }
        
        
        for(int i=0;i<hash.size();i++){
            String temp=hash.get(i);
            int len=temp.length();
            for(int j=i;j<i+2 && j<hash.size();j++){
                if(i==j){
                    continue;
                }
                else{
                    String str=hash.get(j);
                    if(str.length()>=len){
                        str=str.substring(0,len);
                        if(temp.equals(str)){
                            return false;
                        }
                    }
                    else{
                        continue;
                    }
                    
                }
            }
        }
        
        return answer;
    }
}
