class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int a[]=newInterval;
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] ref=intervals[i];
            if(a[1]<ref[0]){
                l.add(a);
                a=ref;
            }
            else if(a[0]>ref[1]){
                l.add(ref);
               
            }
            else{
                a[1]=Math.max(a[1],ref[1]);
                a[0]=Math.min(a[0],ref[0]);
            }


        }
        l.add(a);
        int r[][]=new int[l.size()][2];
        int c=0;
        for(int i[]:l){
            r[c++]=i;
        }
        return r;
        
    }
}