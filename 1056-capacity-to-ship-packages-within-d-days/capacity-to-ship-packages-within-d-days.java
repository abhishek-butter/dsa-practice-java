class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i:weights){
            if(i>left)left=i;
            right+=i;
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(checker(weights,days,mid)){
                ans=mid;
                right=mid-1;

            }
            else left=mid+1;

        }
        return ans;
        
    }
    public boolean checker(int[] n,int days,int capacity){
        int sum=0;
        int st=1;
        for(int i:n){
            sum+=i;
            if(sum>capacity){
                st++;
                sum=i;
            }
        }
        return (days>=st);

    }
}