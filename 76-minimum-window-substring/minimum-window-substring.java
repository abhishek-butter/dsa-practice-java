class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> tf=new HashMap<>();
        for(char i:t.toCharArray()){
            tf.put(i,tf.getOrDefault(i,0)+1);
        }
        int left=0;
        String ans="";
        int len=9999999;
        int i=0;
         
        
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

            while(valid(map,tf)){
                
                if(i-left+1<len){
                    len=i-left+1;
                    ans=s.substring(left,i+1);
                }
                
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
                
            }
            i++;
        }
        return ans;

        
        
    }
    public boolean valid(HashMap<Character,Integer> window,HashMap<Character,Integer> need){
        for(char c : need.keySet()){
            if(window.getOrDefault(c,0) < need.get(c))
                return false;
        }
        return true;
    }
}