class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int Maxcount=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int count=dfs(grid,i,j);
                Maxcount=Math.max(count,Maxcount);
            }
        }
        return Maxcount;
        
    }

    public int dfs(int[][] g,int i,int j){
        if(i<0||i>g.length-1||j<0||j>g[0].length-1||g[i][j]==0)return 0;

        g[i][j]=0;

        int right=dfs(g,i+1,j);
        int down=dfs(g,i,j+1);
        int left= dfs(g,i-1,j);
        int up=dfs(g,i,j-1);
        return 1+(up+down+left+right);



    }
}