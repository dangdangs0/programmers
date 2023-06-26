import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String>arr1=new ArrayList<>();
        ArrayList<String>arr2=new ArrayList<>();
        
        for(int i=0;i<str1.length()-1;i++){
            char front=str1.charAt(i);
            char back=str1.charAt(i+1);
            
            if(!('a'<=Character.toLowerCase(front) && Character.toLowerCase(front)<='z')){
                continue;
            }
            else if(!('a'<=Character.toLowerCase(back) && Character.toLowerCase(back)<='z')){
                continue;
            }
            else{
                //알파벳
                String temp=String.valueOf(front)+String.valueOf(back);
                arr1.add(temp);
            }
        }
        
        for(int i=0;i<str2.length()-1;i++){
            char front=str2.charAt(i);
            char back=str2.charAt(i+1);
            
            if(!('a'<=Character.toLowerCase(front) && Character.toLowerCase(front)<='z')){
                continue;
            }
            else if(!('a'<=Character.toLowerCase(back) && Character.toLowerCase(back)<='z')){
                continue;
            }
            else{
                //알파벳
                String temp=String.valueOf(front)+String.valueOf(back);
                arr2.add(temp);
            }
        }
        
        int intersect=0;
        int union=0;
        
        int size1= arr1.size();
        int size2=arr2.size();
        
        if(arr1.size()==0 && arr2.size()==0){
            return 1*65536;
        }
        
        
        if(arr1.size()>=arr2.size()){
            for(int i=0;i<arr1.size();i++){
                for(int j=0;j<arr2.size();j++){
                    if(arr1.get(i).toLowerCase().equals(arr2.get(j).toLowerCase())){
                        arr1.remove(i);
                        arr2.remove(j);
                        i=-1;
                        intersect++;
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0;i<arr2.size();i++){
                for(int j=0;j<arr1.size();j++){
                    if(arr2.get(i).toLowerCase().equals(arr1.get(j).toLowerCase())){
                        arr2.remove(i);
                        arr1.remove(j);
                        i=-1;
                        intersect++;
                        break;
                    }
                }
            }
        }
        
        union=size1+size2-intersect;
        
        answer=(int)Math.floor((double)intersect/union*65536);
        return answer;
    }
}
