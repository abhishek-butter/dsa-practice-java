class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> max=new ArrayList<>(map.entrySet());
        max.sort((a,b)->b.getValue()-a.getValue());
        int r[]=new int[k];
        for(int i = 0; i < k; i++){
            r[i] = max.get(i).getKey();
        }
        
        return r;

        
    }
}