class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] eachHang=polynomial.split(" ");
        int number=0;
        int xnumber=0;
        String temp="";
        boolean isRoop=true;
        
        for(int i=0;i<eachHang.length;i++){
            if(isNumber(eachHang[i])){//숫자
                number=number+Integer.valueOf(eachHang[i]);
            }
            else if(eachHang[i].length()==1){ //숫자가 아님, 그냥 계수가 1임 또는 + 연산자
                if(eachHang[i].equals("x")){ 
                    xnumber=xnumber+1;
                }
                else if(eachHang[i].equals("+")){
                    continue;
                }
            }
            
            else{//4x, 3x같은거
                int count=0;
                while(isRoop){
                    if(eachHang[i].charAt(count)=='x'){
                        temp=eachHang[i].replace("x","");
                        xnumber=xnumber+Integer.valueOf(temp);
                        break;
                    }
                    count++;
                }
            }
        }
        
        

        if(number==0){
            if(xnumber==1){
                answer="x";
            }
            else{
                answer=String.valueOf(xnumber)+"x";
            }
            
        }
        else if(xnumber==0){
           answer=String.valueOf(number);
        }
        else{
            if(xnumber==1){
              answer="x + "+String.valueOf(number);
            }
            else{
                answer=String.valueOf(xnumber)+"x + "+String.valueOf(number);
            }
             
        }
        return answer;
    }
    
    public static boolean isNumber(String s){
        try{
            Integer.valueOf(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
