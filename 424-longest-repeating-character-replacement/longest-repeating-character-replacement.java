class Solution {
    public int characterReplacement(String s, int k) {

        int maxlength=0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int mostfreq=0;

        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);
            

            map.put(a,map.getOrDefault(a,0)+1);
            mostfreq=Math.max(map.get(a),mostfreq);

            if(right-left+1-mostfreq>k){
                
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
            }

            maxlength=Math.max(maxlength,right-left+1);
            
        }
        return maxlength;
        
    }
}