class Solution {
    public int trap(int[] height) {
        int ml[]=new int[height.length];
        int mr[]=new int[height.length];
        int m=height[0];

        for(int i=0;i<height.length;i++){
            
            m = Math.max(m,height[i]);
            ml[i]=m;
            


        }
        m=height[height.length-1];
        for(int i=height.length-1;i>-1;i--){
            
            m = Math.max(m,height[i]);
            mr[i]=m;


        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(ml[i],mr[i])-height[i];
        }
        return sum;
        
    }
}