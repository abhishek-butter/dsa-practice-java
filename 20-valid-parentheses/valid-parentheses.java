class Solution {
    public boolean isValid(String s) {
         Deque<Character> dq=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='(')dq.offerLast(')');
            else if(c=='[')dq.offerLast(']');
            else if(c=='{')dq.offerLast('}');
            else if(!dq.isEmpty() ){
                if(dq.pollLast()!=c)return false;
                continue;
            }
            else if(dq.isEmpty())return false;
            
        }
        return (dq.size()==0);   
        
    }
}