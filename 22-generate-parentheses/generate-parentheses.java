class Solution {
    List<String> l;
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        gen(n,0,0,"");
        return l;
        
    }
    public void gen(int n,int oc,int cc,String s){
        if(cc>oc)return;
        if(s.length()==2*(n)){
            l.add(s);
            return;
        }
        if(oc<n){
            gen(n,oc+1,cc,s+"(");
        }
        if(cc<oc)gen(n,oc,cc+1,s+")");

    }
}