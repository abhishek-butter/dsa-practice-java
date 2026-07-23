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
                char c=board[i][j];
                if(c=='.')continue;
                if(!s1.add(c))return false;
            }
        }
        for(int i=0;i<imax;i++){
            s1=new HashSet<>();
            for(int j=0;j<jmax;j++){
                char c=board[j][i];
                if(c=='.')continue;
                if(!s1.add(c))return false;
            }
        }
        s1=new HashSet<>();

        for(int i=0;i<imax;i++){
            if(i==3 || i==6){
                s1=new HashSet<>();
                s2=new HashSet<>();
                s3=new HashSet<>();
            }
            
            for(int j=0;j<jmax;j++){
                char c=board[i][j];
                if(c=='.')continue;
                if(j>5){
                    if(!s3.add(c))return false;
                }
                else if(j>2){
                    if(!s2.add(c))return false;
                }      
                else {
                    if(!s1.add(c))return false;
                }
                    
                
                

            }
        }
        return true;
        
    }
}