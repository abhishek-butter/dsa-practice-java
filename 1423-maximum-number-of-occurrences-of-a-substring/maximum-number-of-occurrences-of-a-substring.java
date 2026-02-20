class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String,Integer> set=new HashMap<>();

        int l=0;
        
        for(int i=0;i<s.length();i++){
            
            
            if(i-l+1==minSize){
                String sub=s.substring(l,i+1);
                if(uniquefinder(sub)<=maxLetters)set.put(sub,set.getOrDefault(sub,0)+1);
                
                
                l++;
            }

        }
        int max=0;
        for(int n:set.values()){
            max=Math.max(max,n);

        }
        return max;

        
    }
    public int uniquefinder(String sub){
        HashSet<Character> set = new HashSet<>();

        for(char c : sub.toCharArray()){
            set.add(c);
        }

        int unique = set.size();

        return unique;
        }
}