import java.util.ArrayList;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int len=bin1.length();
        ArrayList <Integer> intBin1=new ArrayList <Integer>();
        ArrayList <Integer> intBin2=new ArrayList <Integer>();
        
        for(int i=0;i<len;i++){
            intBin1.add(Integer.valueOf(bin1.charAt(i)-'0'));
        }
        for(int i=0;i<bin2.length();i++){
            intBin2.add(Integer.valueOf(bin2.charAt(i)-'0'));
        }
        
        if(len==bin2.length()){
            for(int i=len-1;i>=0;i--){
                if(intBin1.get(i)+intBin2.get(i)>=2){
                    intBin1.set(i,(intBin1.get(i)+intBin2.get(i))-2);

                    if(i==0){
                        intBin1.add(0,1);
                    }
                    else{
                        intBin1.set(i-1,intBin1.get(i-1)+1);
                    }

                }
                else{
                    intBin1.set(i,(intBin1.get(i)+intBin2.get(i)));
                }
            }
            for(int i=0;i<intBin1.size();i++){
                answer+=String.valueOf(intBin1.get(i));
            }
        }
        else if(len>bin2.length()){ // "1011" "010"
            int temp=bin2.length()-1;
            for(int i=len-1;i>=0;i--){
                if(temp>=0){
                    if(intBin1.get(i)+intBin2.get(temp)>=2){
                        intBin1.set(i,(intBin1.get(i)+intBin2.get(temp))-2);
                        if(i==0){
                            intBin1.add(0,1);
                        }
                        else{
                            intBin1.set(i-1,intBin1.get(i-1)+1);
                        }
                    }
                    else{
                        intBin1.set(i,(intBin1.get(i)+intBin2.get(temp)));
                    }   
                }
                else{
                    if(intBin1.get(i)>=2){
                        intBin1.set(i,intBin1.get(i)-2);
                        if(i==0){
                            intBin1.add(0,1);
                        }
                        else{
                            intBin1.set(i-1,intBin1.get(i-1)+1);
                        }
                    }
                }
                
                temp--;
            }
            for(int i=0;i<intBin1.size();i++){
                answer+=String.valueOf(intBin1.get(i));
            }
        }
        else if(len<bin2.length()){
            int temp=len-1;
            for(int i=bin2.length()-1;i>=0;i--){
                if(temp>=0){
                    if(intBin2.get(i)+intBin1.get(temp)>=2){
                        intBin2.set(i,(intBin2.get(i)+intBin1.get(temp))-2);
                        if(i==0){
                            intBin2.add(0,1);
                        }
                        else{
                            intBin2.set(i-1,intBin2.get(i-1)+1);
                        }
                    }
                    else{
                        intBin2.set(i,(intBin2.get(i)+intBin1.get(temp)));
                    }   
                }
                else{
                    if(intBin2.get(i)>=2){
                        intBin2.set(i,intBin2.get(i)-2);
                        if(i==0){
                            intBin2.add(0,1);
                        }
                        else{
                            intBin2.set(i-1,intBin2.get(i-1)+1);
                        }
                    }
                }
                
                temp--;
            }
            for(int i=0;i<intBin2.size();i++){
                answer+=String.valueOf(intBin2.get(i));
            }
        }
        
        
        
        return answer;
    }
}
