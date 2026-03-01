class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxcount=0;
        int count=0;
        int l=0;

        for(int i=0;i<s.length();i++){
            int v=s.charAt(i);
            map.put(v,map.getOrDefault(v,0)+1);
            while(map.get(v)>1){
                
                int nv=s.charAt(l);
                
                map.put(nv,map.get(nv)-1);
                l++;

            }
            count=i-l+1;
            maxcount=Math.max(maxcount,count);

        }
        return maxcount;
    }
}