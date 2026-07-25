class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            pq.offer(i);
        }
        int r[]=new int[k];
        
        for(int i=0;i<k;i++){
            r[i]=pq.poll().getKey();

        }
        return r;

        
    }
}