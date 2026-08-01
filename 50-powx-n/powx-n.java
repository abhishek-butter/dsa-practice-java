class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        if(n<0){
            x=1/x;
            nn=Math.abs(nn);
            
        }
        long t=nn;
        int c=0;
        double r=1;
        double cp=x;        
        while(t!=0){
        if(t%2==1)r*=(cp);
            cp*=cp;
            t=t/2;
        }
        return r;



        
    }
}