class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        int maxfreq=0;
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq=Math.max(map.getOrDefault(c,0),maxfreq);


            if((i-left+1)-maxfreq>k){
                char leftc=s.charAt(left);
                map.put(leftc,map.get(leftc)-1);
                left++;
            }
            
            count=Math.max(count,i-left+1);

        }
        return count;
        
    }
}