import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack=new Stack<>();
        int len=s.length();
        char[] c=s.toCharArray();
        
        for(int i=0;i<len;i++){
            if(c[i]=='('){
                stack.push(Character.valueOf(c[i]));
            }
            else{
                if(stack.empty()){
                    return false;
                }
                else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                
            }
        }
        
        if(!stack.empty()){
            //(만 남아있을 수 있다는 뜻
            answer=false;
        }

        return answer;
    }
}
