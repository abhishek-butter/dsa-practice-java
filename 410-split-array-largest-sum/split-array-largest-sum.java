class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;

        for(int i:nums){
            if(i>max){
                max=i;
            }
            sum+=i;

        }

        int mv=Bi(nums,max,sum,k);

        
        return mv;
        
        
    }
    public int Bi(int[] n,int left,int right,int t){
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
                             
            if(checker(n,t,mid)){
                ans=mid;       
                right=mid-1;
            }
            else{
                left=mid+1;               
            }           
        }
        return ans;
    }
    public boolean checker(int[] a,int k,int mid){
        int sum=0;
        int groups=1;

        for(int i:a){
            if(sum+i>mid){
                groups++;
                sum=i;
            }
            else{
                sum+=i;

            }
        }
        return k>=groups;

    }
}