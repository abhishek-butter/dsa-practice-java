class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        
        for(int i:nums){
            if(i>left)left=i;
            right+=i;
        }
        if(k==1)return right;
        int ans=99999999;
        while(left<=right){
            int mid=(left+right)/2;
            if(checker(nums,mid,k)){
                ans=Math.min(mid,ans);
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        }
        return ans;
        


        
    }
    public boolean checker(int[] nums,int mid,int k){
        int g=1;
        int s=0;
        for(int i:nums){
            if(s+i>mid){
                s=0;
                g++;

            }
            s+=i;

        }
        return (k>=g)?true:false;
    }
}