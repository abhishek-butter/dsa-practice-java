class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<double[]> l=new ArrayList<>();
        
        for(int i=0;i<position.length;i++){
            l.add(new double[]{position[i],((double)(target-position[i])/speed[i])});
        }
        l.sort((a,b)->Double.compare(b[0],a[0]));
        int count=1;
        double prevtime=l.get(0)[1];
        for(int i=1;i<l.size();i++){
            double temp[]=l.get(i);
            if(temp[1]>prevtime){
                count++;
                prevtime=temp[1];
            }

            
        }
        return count;
    }
}