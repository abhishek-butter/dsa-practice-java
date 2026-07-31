class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)return findMedianSortedArrays(nums2,nums1);
        int left=0;
        int right=nums1.length;
        int al,bl,ar,br;
        int tl=nums1.length+nums2.length;

        while(left<=right){

            int pa=(left+(right-left)/2);
            int pb=((tl+1)/2)-pa;

            al=(pa!=0)?nums1[pa-1]:Integer.MIN_VALUE;
            bl=(pb!=0)?nums2[pb-1]:Integer.MIN_VALUE;

            ar=(pa!=nums1.length)?nums1[pa]:Integer.MAX_VALUE;
            br=(pb!=nums2.length)?nums2[pb]:Integer.MAX_VALUE;

            if(al<=br && bl<=ar){
                if(tl%2==0){
                    return ((double)Math.max(bl,al)+Math.min(br,ar))/2.0;

                }
                else return (double)Math.max(bl,al);
                
            }
            else if(al>br)right=pa-1;
            else left=pa+1;



        }
        return 0;

        
    }
}