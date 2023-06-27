class Solution {
    static int answer=0;
    
    public int solution(int[] numbers, int target) {
        dfs(0,numbers,target,0);
        return answer;
    }
    public static void dfs(int depth, int[] arr, int target,int num){
        if(depth==arr.length){
            if(num==target){
                answer++;
            }
        }
        else{
            dfs(depth+1,arr,target,num-arr[depth]);
            dfs(depth+1,arr,target,num+arr[depth]);
        }
        
    }
}
