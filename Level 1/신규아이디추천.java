class Solution {
    public String solution(String new_id) {
        String answer = rule(new_id);
        return answer;
    }
    public static String rule(String s){
        //모든 대문자를 소문자로 치환
        s=s.toLowerCase(); 
        //사용 안되는 특수문자 제거
        s=s.replaceAll("[~!@#$%\\^&*\\(\\)=+\\[\\{\\]\\}:?,<>/]","");
        //2개 이상의 .을 하나로 치환
        s=s.replaceAll("\\.{2,}",".");
        //제일 앞이 .으로 시작하면 . 제거
        if(s.charAt(0)=='.'){
            s=s.replaceFirst(".","");
        }
        //제일 뒤가 .으로 끝나면 . 제거하고 s로
        //두번째 인자는 문자열 길이이기 때문에 만약 "abc"에서 c 제거하고 반환하려면 
        //substring(0,2)로 해야됨 즉, 두번째 인자는 s.length()-1이 되고 이것이 (3-1)==2
        if(s.length()!=0 && s.charAt(s.length()-1)=='.'){
            s=s.substring(0,s.length()-1);
        }
        //아이디가 빈 문자열이면 new_id에 "a"
        if(s.length()==0){
            s="a";
        }
        //new_id가 16글자 이상이면 15까지만
        if(s.length()>=16){
            s=s.substring(0,15);
            //마지막이 .이면 . 제거
            if(s.charAt(s.length()-1)=='.'){
                s=s.substring(0,s.length()-1);
            }
        }
        
        //두글자 이하라면, 마지막 문자를 추출해서 new_id길이가 3이 될때까지 반복
        if(s.length()<=2){
            String add=String.valueOf(s.charAt(s.length()-1));
            while(s.length()<=3){
                s+=add;
                if(s.length()==3){
                    break;
                }
            }   
        }
        
        
        return s;
    }
}
