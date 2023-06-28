class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str=trans(n,k);
        // str=str.replaceAll("0+","0");
        String[] temp=str.split("0");
        
        for(int i=0;i<temp.length;i++){
            if(temp[i].equals("")){
                continue;
            }
            long num=Long.valueOf(temp[i]);
            if(prime(num)){
                answer++;
            }
        }
        return answer;
    }
    
    public static String trans(int n, int k){
        StringBuilder sb=new StringBuilder();
        //sb는 reverse 필요
//         Boolean isLoop=true;
//         while(isLoop){
//             if(n<k){
//                 sb.append(String.valueOf(n));
//                 isLoop=false;
//                 break;
//             }
//             else{
//                 int add=n%k;
//                 sb.append(String.valueOf(add));
//                 n=n/k;
//             }
//         }
        
//         sb.reverse();
//         String s=String.valueOf(sb);
//         return s;
        
        String s=Integer.toString(n,k);
        return s;
    }
    public static boolean prime(long n){
        if(n==1) return false;
        else if(n==2) return true;
        
        for(long div=2;div<=(int)Math.sqrt(n);div++){
            if(n%div==0){
                return false;
            }
        }
        
        return true;
    }
}
