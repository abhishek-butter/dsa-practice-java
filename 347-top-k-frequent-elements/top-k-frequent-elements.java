class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }

        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());
        int topk[]=new int[k];

        for(int i=0;i<k;i++){
            topk[i]=l.get(i).getKey();

        }

        return topk;

        
    }
}