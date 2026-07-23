class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int prev[]=intervals[0];

        List<int[]> l=new ArrayList<>();
        if(intervals.length<=1)return intervals;
        

        for(int i=1;i<intervals.length;i++){
            int ca[]=intervals[i];
            if(ca[0]<=prev[1])prev[1]=Math.max(ca[1],prev[1]);
            else{
                l.add(prev);
                prev=ca;

            }
           
        
        }
         l.add(prev);
        int result[][]=new int[l.size()][2];
        int j=0;
        for(int[] i:l){
            result[j++]=i;

        }
        return result;
        
    }
}