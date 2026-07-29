class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       
        
        int count=0;
        
        
        int p[]=intervals[0];
        
        for(int i=1;i<intervals.length;i++){
            int temp[]=intervals[i];
    
            if(temp[0]<p[1]){
                count++;
                if(p[1]>temp[1]){
                    p=temp;
                }
            }
            else  p=temp;
           



        }
        return count;
        
    }
}