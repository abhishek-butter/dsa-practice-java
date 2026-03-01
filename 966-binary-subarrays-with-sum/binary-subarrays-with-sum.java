class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int n:nums){
            prefixsum+=n;
            int v=prefixsum-goal;
            if(map.containsKey(v)){
                count+=map.get(v);

            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
        
    }
}