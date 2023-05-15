import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> n=new HashMap<>();
        for(int i=0;i<name.length;i++){
            n.put(name[i],yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            int sum=0;
            for(int j=0;j<photo[i].length;j++){
                int temp=n.getOrDefault(photo[i][j],0);
                sum+=temp;
            }
            answer[i]=sum;
        }
        return answer;
    }
}
