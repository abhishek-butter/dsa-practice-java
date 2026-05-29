class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int a=0;
        Arrays.sort(heaters);
        
        for(int i:houses){
            a=Math.max(Binary(heaters,i),a);

        }
        return a;
    }
    public int Binary(int[] h,int p){
        int left=0;
        int right=h.length-1;
        int f=h.length;
        while(left<=right){
            int mid=(left+right)/2;
            if(h[mid]>=p){
                f=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }

        }
        if(f==0)return Math.abs(p-h[f]);
        if(f==h.length) return Math.abs(p-h[f-1]);
        

        return Math.min(Math.abs(p-h[f]),Math.abs(p-h[f-1]));
        
    }
}