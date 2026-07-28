class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int left=0;
        int right=(nums1.length<nums2.length)?nums1.length:nums2.length;
        int aleft=0;
        int aright=0;
        int bleft=0;
        int bright=0;
        int small[]=(nums1.length<nums2.length)?nums1:nums2;
        int big[]=(small==nums1)?nums2:nums1;
        while(left<=right){
            int leftp=left+(right-left)/2;
            int rightp=((small.length+big.length+1)/2)-leftp;
            aleft=(leftp==0)?Integer.MIN_VALUE:small[leftp-1];
            aright=(leftp==small.length)?Integer.MAX_VALUE:small[leftp];

            bright=(rightp!=big.length)?big[rightp]:Integer.MAX_VALUE;
            bleft=(rightp!=0)?big[rightp-1]:Integer.MIN_VALUE;

            if(bleft<=aright && aleft<=bright){
                if((nums1.length+nums2.length)%2==0){
                    return ((((double)Math.max(aleft,bleft))+Math.min(aright,bright))/2.0);
                }
                else return Math.max(aleft,bleft);
            }
            else if ( bleft>aright)left=leftp+1;
            else if (aleft>bright)right=leftp-1;


        }
        return 0;
        
    }
}