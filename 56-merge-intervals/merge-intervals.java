class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int a[]=intervals[0];
        
        List<int[]> l=new ArrayList<>();
        for(int j=1;j<intervals.length;j++){
            int i[]=intervals[j];
            if(a[1]>=i[0]){
                a[1]=Math.max(i[1],a[1]);
            }
            else {
                l.add(a);
                a=i;

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