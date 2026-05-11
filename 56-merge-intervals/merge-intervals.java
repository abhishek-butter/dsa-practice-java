class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> finall=new ArrayList<>();
        int[] pre=new int[2];
        
        pre=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] n=intervals[i];
            if(n[0]<=pre[1]){
                pre=new int[]{Math.min(pre[0],n[0]),Math.max(n[1],pre[1])}; 
                 
            }
            else{
                
                finall.add(pre);
                pre=n;
                
                
            }
            
            
    
        }
        finall.add(pre);
        int[][] f=new int[finall.size()][2];
        for(int j=0;j<finall.size();j++){
                f[j]=finall.get(j);
            }
        return f;
        
    }
}