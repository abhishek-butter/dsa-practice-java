class Solution {
    int count=0;
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    
                }

            }
        }

        while(!q.isEmpty()){
            int size=q.size();
            boolean work=false;
            for(int k=0;k<size;k++){
                int[] arr=q.poll();

                if(arr[0]+1<grid.length&&grid[arr[0]+1][arr[1]]==1){
                    grid[arr[0]+1][arr[1]]=2;
                    q.add(new int[]{arr[0]+1,arr[1]});
                    work=true;
                    
                }
                if(arr[0]-1>=0&&grid[arr[0]-1][arr[1]]==1){
                    grid[arr[0]-1][arr[1]]=2;
                    q.add(new int[]{arr[0]-1,arr[1]});
                    work=true;
                    
                }
                if(arr[1]+1<grid[0].length&&grid[arr[0]][arr[1]+1]==1){
                    grid[arr[0]][arr[1]+1]=2;
                    q.add(new int[]{arr[0],arr[1]+1});
                    work=true;
                    
                }
                if(arr[1]-1>=0 && grid[arr[0]][arr[1]-1]==1){
                    grid[arr[0]][arr[1]-1]=2;
                    q.add(new int[]{arr[0],arr[1]-1});
                    work=true;
                    
                }
                

            }
            if(work){
                count++;

            }
            
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return -1;
            }
        }
        return count;
        
    }

    
}