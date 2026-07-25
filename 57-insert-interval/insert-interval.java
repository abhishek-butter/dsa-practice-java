class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int prev[]=newInterval;
        List<int[]> l=new ArrayList<>();
        for(int i[]:intervals){
            if(prev[1]<i[0]){
                l.add(prev);
                prev=i;
            }
            else if(prev[0]>i[1]){
                l.add(i);

            }
            else{
                prev[0]=Math.min(prev[0],i[0]);
                prev[1]=Math.max(prev[1],i[1]);
            }
        }
        l.add(prev);
        int r[][]=new int[l.size()][2];
        int c=0;
        for(int[] i:l){
            r[c++]=i;
            
        }
        return r;

        
        
    }
}