class Solution {
    public boolean isValid(String s) {
        Stack<Character> cc=new Stack<>();

        for(char c: s.toCharArray()){
            if(!cc.isEmpty()){
                
                if(cc.peek()=='{' && c=='}'){
                    
                    cc.pop();
                    continue;
                }
                else if(cc.peek()=='['&& c==']'){
                    
                    cc.pop();
                    continue;
                }
                else if(cc.peek()=='('&& c==')'){
                    
                    cc.pop();
                    continue;
                }
                
                
                
            }
            cc.add(c);     
        }
        return cc.isEmpty()?true:false;
        
    }
}