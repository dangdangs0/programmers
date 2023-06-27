class Solution {
    static boolean[] visited;
    static int answer=0;
    static int[][] arr;
    
    public int solution(int k, int[][] dungeons) {
        visited=new boolean[dungeons.length];
        arr=dungeons;
        dfs(0,k);
        return answer;
    }
    
    public static void dfs(int depth, int fatigue){
        for(int i=0;i<arr.length;i++){
            if(visited[i] || arr[i][0]>fatigue){
                continue;
            }
            visited[i]=true;
            dfs(depth+1,fatigue-arr[i][1]);
            visited[i]=false;
        }
        
        if(depth>answer){
            answer=depth;
        }
        
    } 
}
