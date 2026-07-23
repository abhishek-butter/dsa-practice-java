class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> s1=new HashSet<>();
        HashSet<Character> s2=new HashSet<>();
        HashSet<Character> s3=new HashSet<>();

        int imax=board.length;
        int jmax=board[0].length;
        for(int i=0;i<imax;i++){
            s1=new HashSet<>();
            for(int j=0;j<jmax;j++){
                if(board[i][j]=='.')continue;
                if(!s1.add(board[i][j]))return false;
            }
        }
        for(int i=0;i<imax;i++){
            s1=new HashSet<>();
            for(int j=0;j<jmax;j++){
                if(board[j][i]=='.')continue;
                if(!s1.add(board[j][i]))return false;
            }
        }
        s1=new HashSet<>();

        for(int i=0;i<imax;i++){
            if(i==3){
                s1=new HashSet<>();
                s2=new HashSet<>();
                s3=new HashSet<>();
            }
            if(i==6){
                s1=new HashSet<>();
                s2=new HashSet<>();
                s3=new HashSet<>();
            }
            for(int j=0;j<jmax;j++){
                if(j>2 && j<6){
                    if(board[i][j]=='.')continue;
                    if(!s2.add(board[i][j]))return false;
                }
                else if(j>5){
                    if(board[i][j]=='.')continue;
                    if(!s3.add(board[i][j]))return false;
                }
                else{
                    if(board[i][j]=='.')continue;
                    if(!s1.add(board[i][j]))return false;
                }
                

            }
        }
        return true;
        
    }
}