class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i=0;i<db.length;i++){
            if(!db[i][0].equals(id_pw[0])){ //아이디 일치하지 않음
                if(answer.equals("")){
                    answer="fail";
                }
            }
            else{//일치함!
                if(!db[i][1].equals(id_pw[1])){//아이디만 일치하고 비밀번호 틀림
                    answer="wrong pw";
                }
                else{
                    answer="login";
                    break;
                }
            }
        }
        return answer;
    }
}
