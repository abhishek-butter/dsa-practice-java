class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int ans=0;
        Arrays.sort(heaters);

        for(int i:houses){
            ans=Math.max(ans,BI(heaters,i,0,heaters.length-1));
        }
        return ans;
        
    }
    public int BI(int[] h,int t,int left,int right){
        int found=h.length;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(h[mid]>=t){
                found=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }

        }
        if(found==0)return Math.abs(t-h[found]);
        if(found==h.length)return Math.abs(t-h[found-1]);


        return Math.min(
            Math.abs(h[found]-t),
            Math.abs(h[found-1]-t)
        );

    }
}