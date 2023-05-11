class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] temp=new int[n][n];
        
        for(int i=0;i<n;i++){
            int[] t=trans(arr1[i],n);//9이면 int배열은 0 1 0 0 1
            for(int j=0;j<n;j++){
                temp[i][j]=t[j];
            }
            int[] b=trans(arr2[i],n);
            for(int j=0;j<n;j++){
                if(temp[i][j]!=1){
                    temp[i][j]=b[j];    
                }
            }
        }
        
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++){
                if(temp[i][j]==0){
                    str+=" ";
                }
                else{//1일때
                    str+="#";
                }
            }
            answer[i]=str;
        }
        
        return answer;
    }
    
    public int[] trans(int n,int size){
        //10진수->2진수
        String ret="";
        int[] arr=new int[size];
        if(n<2){
            ret+=String.valueOf(n);
        }
        while(n>=2){
            ret+=String.valueOf(n%2);
            n=n/2;
            
            if(n<2){
                ret+=n;
            }
        }
        while(ret.length()!=size){
            ret+="0";
        }
        String test="";
        StringBuilder sb=new StringBuilder(ret);
        test=sb.reverse().toString();

        for(int i=0;i<size;i++){
            arr[i]=test.charAt(i)-'0';//char to int
        }
        return arr;
    }
}
