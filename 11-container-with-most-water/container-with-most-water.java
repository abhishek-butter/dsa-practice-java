class Solution {
    public int maxArea(int[] height) {
        int maxv=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int r=height[right];
            int l=height[left];
            int small=(r>l)?l:r;
            maxv=Math.max(maxv,(right-left)*small);
            if(r>l){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxv;

        

    }
}