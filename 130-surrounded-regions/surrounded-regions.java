class Solution {
    
    public void solve(char[][] board) {
        

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0||j==0||i==board.length-1||j==board[0].length-1){
                    if(board[i][j]=='O'){
                    dfs(board,i,j);
                    }   

                }
                
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')board[i][j]='X';

                
                
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='#')board[i][j]='O';

                
                

                
                
            }
        }
       
    }
    public void dfs(char[][] b,int i,int j){

        if(i<0||j<0||i>b.length-1||j>b[0].length-1||b[i][j]=='X'||b[i][j]=='#')return ;
        
        b[i][j]='#';
        
        

        dfs(b,i+1,j);
        dfs(b,i-1,j);
        dfs(b,i,j+1);
        dfs(b,i,j-1);
       

    }
}