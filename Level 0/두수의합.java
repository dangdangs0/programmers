import java.util.ArrayList;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        int lena=a.length();
        int lenb=b.length();
        ArrayList<String> temp=new ArrayList<>();
        StringBuilder are=new StringBuilder(new String(a));
        String atemp="";
        String btemp="";
        atemp=are.reverse().toString();
        StringBuilder bre=new StringBuilder(new String(b));
        btemp=bre.reverse().toString();
        
        char[] cha=atemp.toCharArray();
        char[] chb=btemp.toCharArray();
        
        if(lena>lenb){
            for(int i=0;i<lena;i++){
                temp.add(String.valueOf(cha[i])); //배열 저장
            }
            for(int i=0;i<lena;i++){
                int an=Integer.valueOf(temp.get(i));//
                if(an==10){
                    String number=String.valueOf(an-10);
                    temp.set(i,number);
                    if(i+1==lena){
                        temp.add(lena,"1");
                    }
                    else{
                        temp.set(i+1,String.valueOf(Integer.valueOf(temp.get(i+1))+1));
                    }
                    an=0;
                }
                if(i<lenb){
                    int bn=chb[i]-'0';
                    if(an+bn>=10){
                        String number=String.valueOf(an+bn-10);
                        temp.set(i,number);
                        if(i+1==lena){
                            temp.add(lena,"1");
                        }
                        else{
                            temp.set(i+1,String.valueOf(Integer.valueOf(temp.get(i+1))+1));
                        }
                    }
                    else{
                        temp.set(i,String.valueOf(an+bn));
                    }
                }
                
            }
            
            
        }
        else{
            for(int i=0;i<lenb;i++){
                temp.add(String.valueOf(chb[i]));
            }
            
            for(int i=0;i<lenb;i++){
                int bn=Integer.valueOf(temp.get(i));//
                if(bn==10){
                    String number=String.valueOf(bn-10);
                    temp.set(i,number);
                    if(i+1==lenb){
                        temp.add(lenb,"1");
                    }
                    else{
                        temp.set(i+1,String.valueOf(Integer.valueOf(temp.get(i+1))+1));
                    }
                    bn=0;
                }
                if(i<lena){
                    int an=cha[i]-'0';
                    if(an+bn>=10){
                        String number=String.valueOf(an+bn-10);
                        temp.set(i,number);
                        if(i+1==lenb){
                            temp.add(lena,"1");
                        }
                        else{
                            temp.set(i+1,String.valueOf(Integer.valueOf(temp.get(i+1))+1));
                        }
                    }
                    else{
                        temp.set(i,String.valueOf(an+bn));
                    }
                }
                
            }
        }
        
        for(int i=temp.size()-1;i>=0;i--){
            answer+=temp.get(i);
        }
        return answer;
    }
}
