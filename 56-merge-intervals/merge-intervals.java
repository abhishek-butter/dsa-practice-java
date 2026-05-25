class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> l=new ArrayList<>();
        int[] prev=intervals[0];
        for(int[] n:intervals){
            if(n[0]<=prev[1]){  
                prev=new int[]{prev[0],Math.max(n[1],prev[1])};
            }
            else{
                
                
                l.add(prev);
                prev=n;


            }
            
            
            
        }
        l.add(prev);
        int[][] r=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            r[i]=l.get(i);
        }
        return r;
        
    }
}