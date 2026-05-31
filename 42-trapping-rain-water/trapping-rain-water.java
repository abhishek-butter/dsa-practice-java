class Solution {
    public int trap(int[] height) {
        int ml[]=new int[height.length];
        int mr[]=new int[height.length];
        
        ml[0]=height[0];
        mr[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            ml[i]=Math.max(ml[i-1],height[i]);
        }
        for(int i=height.length-2;i>-1;i--){
            mr[i]=Math.max(mr[i+1],height[i]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(ml[i],mr[i])-height[i];
        }

        return sum;

        
    }
}