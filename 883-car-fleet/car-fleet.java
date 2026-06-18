class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<double[]> l=new ArrayList<>();
        
        for(int i=0;i<speed.length;i++){
            double t=(target-position[i])/(double)speed[i];
            l.add(new double[]{position[i],t});
        }
        l.sort((a,b)->Double.compare(b[0],a[0]));
        int fleet=1;
        double prev=l.get(0)[1];
        for(double[] i:l){
            if(i[1]>prev){
                fleet++;
                prev=i[1];
            }
        }
        return fleet;
        
        
    }
}