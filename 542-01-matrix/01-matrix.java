class Solution {
    public int[][] updateMatrix(int[][] mat) {


        Queue<int[]> q=new LinkedList<>();
        int[][] visited=new int[mat.length][mat[0].length];
        int[][] result=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                    visited[i][j] = 1;
                }

            }
        }

        
        

        int count=0;
        

        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                int[] arr=q.poll();
                int r = arr[0];
                int c = arr[1];
                result[r][c]=count;
                
                if(r+1<mat.length && visited[r+1][c]==0){
                    visited[r+1][c]=1;
                    q.add(new int[]{r+1,c});

                }

                if(r-1>-1 && visited[r-1][c]==0){
                    visited[r-1][c]=1;
                    q.add(new int[]{r-1,c});

                }

                if(c+1<mat[0].length && visited[r][c+1]==0){
                    visited[r][c+1]=1;
                    q.add(new int[]{r,c+1});

                }

                if(c-1>-1 && visited[r][c-1]==0){
                     visited[r][c-1]=1;
                     q.add(new int[]{r,c-1});

                }
                    
            }
            count++;
        }


        return result;
        
    }
}