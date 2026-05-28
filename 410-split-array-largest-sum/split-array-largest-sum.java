class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int i:nums){
            right+=i;
            if(i>left)left=i;

        }
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(canSplit(nums,k,mid)){
                ans=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        }

        return ans;

        
    }

    public boolean canSplit(int[] arr,int k,int mid){
        int groups=1;
        int sum=0;

        for(int i:arr){
            if(sum+i>mid){
                groups++;
                sum=0;
            }
            sum+=i;
        }

        return groups<=k;
        
    }
}