class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);
        int right=piles[piles.length-1];
        int left=1;
        int ans=99999999;
        while(left<=right){
            int mid=(left+right)/2;
            if(check(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
        
    }
    public boolean check(int[] arr,int h,int mid){
        int e=0;
        
        for(int i:arr){
            e+=Math.ceil((double)i/mid);
        }
        return h>=e;
    }
}