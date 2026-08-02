class Solution {
    public int trap(int[] height) {
        int[] maxright=new int[height.length];
        int[] maxleft=new int[height.length];
        int ml=height[0];
        
        for(int i=0;i<height.length;i++){
            maxleft[i]=ml;
            ml=Math.max(ml,height[i]);

        }
        int mr=height[height.length-1];
        for(int i=height.length-1;i>-1;i--){
            maxright[i]=mr;
            mr=Math.max(mr,height[i]);
        }
        int volume=0;
        for(int i=0;i<height.length;i++){
            int addition=(Math.min(maxleft[i],maxright[i])-height[i]);
            volume+=(addition>0)?addition:0;

        }
        return volume;
        
    }
}