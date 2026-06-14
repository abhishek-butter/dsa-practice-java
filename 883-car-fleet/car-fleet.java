class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length<1)return 0;
        List<double[]> l=new ArrayList<>();
        for(int i=0;i<position.length;i++){
            l.add(new double[]{(double)(position[i]),(double)(target-position[i])/speed[i]});
        }
        l.sort((a,b)->Double.compare(b[0],a[0]));
        
        double prev=l.get(0)[1];
        int fleet=1;
        
        for(double[] i:l){
            if(i[1]>prev){
                prev=i[1];
                fleet++;
            }


        }
        return fleet;
        
    }
}