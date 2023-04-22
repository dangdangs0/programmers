import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray=a.toCharArray();
        
        String answer="";
        
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i]=Character.toLowerCase(charArray[i]);
            }
            else{
                charArray[i]=Character.toUpperCase(charArray[i]);
            }
        }
        answer=String.valueOf(charArray);
        
        System.out.println(answer);
    }
}
