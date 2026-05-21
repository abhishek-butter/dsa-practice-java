class Solution {
    

    public int maxAreaOfIsland(int[][] grid) {
        int max=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
        
    }
    public int dfs(int[][] g,int i,int j){
        if(i<0||j<0||i>g.length-1||j>g[0].length-1||g[i][j]==0)return 0;

        g[i][j]=0;
        int up=dfs(g,i-1,j);
        int down=dfs(g,i+1,j);
        int right=dfs(g,i,j+1);
        int left=dfs(g,i,j-1);

        return (1+up+down+right+left);
    }
}
