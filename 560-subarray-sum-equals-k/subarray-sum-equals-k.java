class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            prefixsum+=nums[right];
            int current=prefixsum-k;
            if(map.containsKey(current)){
                count+=map.get(current);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
            
        }
        return count;
        
    }
}