class Solution {
    List<List<Integer>> l;
    HashMap<Integer,Integer> map;

    public List<List<Integer>> permuteUnique(int[] nums) {
        l=new ArrayList<>();
        
        map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        recursion(nums.length,new ArrayList<>());
        return l;
    }
    public void recursion(int k,List<Integer> pocket){
        if(pocket.size()==k){
            l.add(new ArrayList<>(pocket));
            return;
        }
        for(int n:map.keySet()){
            if(map.get(n)==0)continue;
            map.put(n,map.get(n)-1);
            pocket.add(n);
            recursion(k,pocket);
            map.put(n,map.get(n)+1);
            pocket.remove(pocket.size()-1);

            
        }
    }
}