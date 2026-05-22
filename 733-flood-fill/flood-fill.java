class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        dfs(image,sr,sc,image[sr][sc],color);
        return image;        
    }
    public void dfs(int[][] image,int i,int j,int s,int color){
        if(i<0||j<0||i>image.length-1||j>image[0].length-1||image[i][j]!=s)return;
        image[i][j]=color;
        dfs(image,i+1,j,s,color);
        dfs(image,i-1,j,s,color);
        dfs(image,i,j+1,s,color);
        dfs(image,i,j-1,s,color);
    }
}