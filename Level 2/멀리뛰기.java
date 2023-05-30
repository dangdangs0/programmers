class Solution {
    public long solution(int n) {
        long answer = 0;
        // answer=jump(n)%1234567;
        int[] result=new int[n+1];
        result[0]=0;
        if(n==1){
            return 1;
        }
        else{
            result[1]=1;
            result[2]=2;
        }
        
        for(int i=3;i<=n;i++){
            result[i]=(result[i-2]+result[i-1])%1234567;
        }
        
        answer=result[n];
        return answer;
    }
//     public static int jump(int n){
//         if(n==1){
//             return 1;
//         }
//         if(n==2){
//             return 2;
//         }
        
//         return jump(n-1)+jump(n-2);
//     }
}
