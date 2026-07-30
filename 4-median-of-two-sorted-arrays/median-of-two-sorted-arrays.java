class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);

        int left=0;
        int right=nums1.length;
        int al,ar,bl,br;
        int cons=(nums1.length+nums2.length+1)/2;
        while(left<=right){
            int pa=(left+(right-left)/2);
            int pb=cons-pa;

            al=(pa!=0)?nums1[pa-1]:Integer.MIN_VALUE;
            ar=(pa!=nums1.length)?nums1[pa]:Integer.MAX_VALUE;

            bl=(pb!=0)?nums2[pb-1]:Integer.MIN_VALUE;
            br=(pb!=nums2.length)?nums2[pb]:Integer.MAX_VALUE;

            if(al<=br && bl<=ar){
                if((nums1.length+nums2.length)%2==0){
                    return (Math.max(al,bl)+(double)Math.min(ar,br))/2.0;

                }
                else {
                    return Math.max(al,bl);

                }

            }
            else if(al>br){
                right=pa-1;

            }
            else if(bl>ar) left=pa+1;


        }
        return 0;
        
    }
}