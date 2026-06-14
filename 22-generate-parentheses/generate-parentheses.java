class Solution {
    List<String> l;
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        backtrack(n,0,0,"");
        return l; 
    }
    public void backtrack(int n,int open,int close,String s){
        if(close>open)return;
        if(s.length()==2*n){
            
            l.add(s);
            return;
        }
        if(open<n)backtrack(n,open+1,close,s+"(");           

       
        
        if(close<open)backtrack(n,open,close+1,s+")");
               
        
    }
}