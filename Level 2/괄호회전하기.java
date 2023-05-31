import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len=s.length();
        ArrayList<String> arr=new ArrayList<>();
        
        for(int i=0;i<len;i++){
            arr.add(String.valueOf(s.charAt(i)));
        }
        //ArrayList에 문자열 하나하나씩 담아두기
        
        for(int i=0;i<len;i++){
            Stack<String> stack=new Stack<>();
            int count=len;
            int start=0;
            Boolean isError=false;
            while(count!=0){
                if(arr.get(start).equals("[") || arr.get(start).equals("(") || arr.get(start).equals("{")){
                    stack.push(arr.get(start));
                }
                else{
                    if(stack.isEmpty()){
                        //비어있는데 "]"같은 애들 들어왔다?
                        isError=true;
                        break;
                    }
                    else{
                        if(arr.get(start).equals("]")){
                            if(stack.peek().equals("[")){
                                stack.pop();
                            }
                            else{
                                break;
                            }
                        }
                        else if(arr.get(start).equals(")")){
                            if(stack.peek().equals("(")){
                                stack.pop();
                            }
                            else{
                                break;
                            }
                        }
                        else if(arr.get(start).equals("}")){
                            if(stack.peek().equals("{")){
                                stack.pop();
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
                
                start++;
                count--;
            }
            String temp=arr.get(0);
            arr.remove(0);
            arr.add(temp);
            
            if(isError){
                continue;
            }
            else if(stack.isEmpty()){
                answer++;
            }
            
            
            
        }
        
        return answer;
    }
}
