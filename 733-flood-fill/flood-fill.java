class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        int prevcolour=image[sr][sc];
        int visited[][]=new int[image.length][image[0].length];
        while(!q.isEmpty()){
            int arr[]=q.poll();
            int r=arr[0];
            int c=arr[1];
            visited[r][c]=1;
            
            image[r][c]=color;
            
            if(r+1<image.length && image[r+1][c]==prevcolour && visited[r+1][c]==0){
                q.add(new int[]{r+1,c});
            }
            if(c+1<image[0].length && image[r][c+1]==prevcolour && visited[r][c+1]==0){
                q.add(new int[]{r,c+1});
            }
            if(r-1>-1 && image[r-1][c]==prevcolour && visited[r-1][c]==0){
                q.add(new int[]{r-1,c});
            }
            if(c-1>-1 && image[r][c-1]==prevcolour && visited[r][c-1]==0){
                q.add(new int[]{r,c-1});
            }


            
            
        }
        return image;

        
    }
}