import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        if(arr.length==1){
            return arr[0];
        }
        
        int pregreat=0;
        for(int i=0;i<arr.length-1;i++){
            if(pregreat==0){
                int gcd=gcd(arr[i],arr[i+1]);
                pregreat=gcd*(arr[i]/gcd)*(arr[i+1]/gcd);
            }
            else{
                int gcd=gcd(pregreat,arr[i+1]);
                pregreat=gcd*(pregreat/gcd)*(arr[i+1]/gcd);//최소공배수
            }
        }
        answer=pregreat;
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
