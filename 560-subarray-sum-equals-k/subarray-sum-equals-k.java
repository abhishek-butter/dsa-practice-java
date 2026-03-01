class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currentsum=0;
        for(int n:nums){
            currentsum+=n;
            int v=currentsum-k;
            if(map.containsKey(v)){
                count+=map.get(v);

            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);

        }
        return count;
        
    }
}