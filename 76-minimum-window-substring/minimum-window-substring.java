class Solution {
    public String minWindow(String s, String t) {
        int val=99999999;
        String ans="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0;

        int req=t.length();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)>=0){
                
                req--;
                
            }
            while(req==0){
                if(i-left+1<val){
                    val=i-left+1;
                    ans=s.substring(left,i+1);
                    
                    
                }
                map.put(s.charAt(left),map.get(s.charAt(left))+1);
                
            
                
                if(map.get(s.charAt(left))>0)req++;
                

            
            left++;
            
            

            }
        }

        return ans;
        
    }
}