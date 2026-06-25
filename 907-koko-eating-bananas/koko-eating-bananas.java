class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int right=0;
        int left=1;
        for(int i:piles){
            
            if(i>right)right=i;
        }
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(bs(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
        
    }
    public boolean bs(int[]piles,int h,int l){
        int th=0;
        for(int i:piles){
            th+=Math.ceil((double)i/l);
        }
        return (th>h)?false:true;
    }
}