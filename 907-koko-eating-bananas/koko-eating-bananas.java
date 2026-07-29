class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i:piles){
            r=Math.max(r,i);

        }
        
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(checker(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
        
    }
    public boolean checker(int[] piles,int h,int limit){
        
        int ph=0;
        for(int i:piles){
            ph+=Math.ceil((double)i/limit);

        }
        return (ph<=h);
    }
}