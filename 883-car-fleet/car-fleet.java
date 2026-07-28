class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length<=1)return 1;
        List<double[]> l=new ArrayList<>();

        
        for(int i=0;i<position.length;i++){
            

            double t=(double)(target-position[i])/speed[i];
            l.add(new double[]{position[i],t});
        }
        l.sort((a,b)->Double.compare(b[0],a[0]));
        int fleet=1;
        double[] pf=l.get(0);
        for(int i=1;i<position.length;i++){
            double temp[]=l.get(i);

            if(temp[1]>pf[1]){
                fleet++;
                pf=temp;
            }

        }
        return fleet;
        
    }
}