class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<board.length;i++){
            map1=new HashMap<>();
            for(int j=0;j<board[0].length;j++){
                char a=board[i][j];
                if(a=='.')continue;
                map1.put(a,map1.getOrDefault(a,0)+1);
                if(map1.get(a)>1)return false;
            }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<board.length;i++){
            map2=new HashMap<>();
            for(int j=0;j<board[0].length;j++){
                char a=board[j][i];
                if(a=='.')continue;
                map2.put(a,map2.getOrDefault(a,0)+1);
                if(map2.get(a)>1)return false;
            }
        }
        
        HashMap<Character,Integer> map3=new HashMap<>();
        map2=new HashMap<>();
        map1=new HashMap<>();

        for(int i=0;i<board.length;i++){
            if(i==3){
                map1=new HashMap<>();
                map2=new HashMap<>();
                map3=new HashMap<>();

            }
            if(i==6){
                map1=new HashMap<>();
                map2=new HashMap<>();
                map3=new HashMap<>();

            }
            for(int j=0;j<board[0].length;j++){
                
                char a=board[i][j];
                if(a=='.')continue;
                if(j>-1 && j<3){
                    map1.put(a,map1.getOrDefault(a,0)+1);
                    if(map1.get(a)>1)return false;

                }
                if(j>2 && j<6){
                    map2.put(a,map2.getOrDefault(a,0)+1);
                    if(map2.get(a)>1)return false;

                }
                if(j>5 && j<9){
                    map3.put(a,map3.getOrDefault(a,0)+1);
                    if(map3.get(a)>1)return false;

                }
                

            }
        }
        return true;

        

    }
}