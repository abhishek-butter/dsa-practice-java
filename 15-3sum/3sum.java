class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<List<Integer>> l=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            int sum=0;
            while(left<right){
                
                sum=nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else if(sum==0){
                    l.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    
                }

            }

        }
        List<List<Integer>> list=new ArrayList<>(l);
        return list;


    }
}