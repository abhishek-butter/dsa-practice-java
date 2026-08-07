class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int i: piles){
            right=Math.max(right,i);
        }
        int a=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(checker(piles,mid,h)){
                a=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return a;
        
    }
    public boolean checker(int[] piles,int mid,int h){
        long t=0;
        for(int i:piles)t+=(i+mid-1)/mid;
        return t<=h;
    }
}