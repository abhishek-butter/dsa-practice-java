class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> sm=new HashMap<>();

        for(char j:s1.toCharArray()){
            sm.put(j,sm.getOrDefault(j,0)+1);
        }

        int left=0;
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)+1);
            if(i-left+1==s1.length()){
                int n=0;
                for(char j:sm.keySet()){
                    if(sm.getOrDefault(j,0).equals(map.getOrDefault(j,0))){
                        n++;
                        if(n==sm.size())return true;
                        


                    }
                    else break;
                }
                map.put(s2.charAt(left),map.get(s2.charAt(left))-1);
                left++;

            }
            
        }
        return false;

        
    }
    

}