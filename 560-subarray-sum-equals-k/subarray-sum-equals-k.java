class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> set=new HashMap<>();
        set.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int n:nums){
            prefixsum+=n;
            if(set.containsKey(prefixsum-k)){
                count+=set.get(prefixsum-k);
            }
            set.put(prefixsum,set.getOrDefault(prefixsum,0)+1);
        }
        return count;
        
    }
}