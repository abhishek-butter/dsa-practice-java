class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i:nums){
            r+=i;
            if(i>l)l=i;
        }
        int ans=0;
        while(l<=r){
            int m=(l+r)/2;
            if(check(nums,k,m)){
                ans=m;
                r=m-1;

            }
            else l=m+1;
        }
        return ans;

        
    }
    public boolean check(int[] n,int k ,int mid){
        int g=1;
        int sum=0;
        for(int i:n){
            if(sum+i>mid){
                g++;
                sum=0;
            }
            sum+=i;
        }
        return k>=g;
    }
}