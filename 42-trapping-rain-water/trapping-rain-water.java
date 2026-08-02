class Solution {
    public int trap(int[] height) {
        int[] maxright=new int[height.length];
        int[] maxleft=new int[height.length];
        int ml=height[0];
        
        for(int i=0;i<height.length;i++){
            ml=Math.max(ml,height[i]);
            maxleft[i]=ml;
            

        }
        int mr=height[height.length-1];
        for(int i=height.length-1;i>-1;i--){
            mr=Math.max(mr,height[i]);
            maxright[i]=mr;
            
        }
        int volume=0;
        for(int i=0;i<height.length;i++){
            volume+=(Math.min(maxleft[i],maxright[i])-height[i]);
            

        }
        return volume;
        
    }
}