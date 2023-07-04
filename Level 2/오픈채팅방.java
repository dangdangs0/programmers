import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> user=new HashMap<>();
        int count=0;
        for(int i=0;i<record.length;i++){
            String[] temp=record[i].split(" ");
            if(temp[0].equals("Leave")){
                count++;
                continue;
            }
            user.put(temp[1],temp[2]);//uid4567이 이름변경하면 알아서 변경
            if(!temp[0].equals("Change")){
                count++;
            }
        }
        
        String[] answer = new String[count];
        int index=0;
        for(int i=0;i<record.length;i++){
            String[] temp=record[i].split(" ");
            if(temp[0].equals("Enter")){
                answer[index]=user.get(temp[1])+"님이 들어왔습니다.";
                index++;
            }
            else if(temp[0].equals("Leave")){
                answer[index]=user.get(temp[1])+"님이 나갔습니다.";
                index++;
            }
            else{
                //Change
                continue;
            }
        }
        return answer;
    }
}
