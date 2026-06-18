class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String i:tokens){
            if(i.equals("+")){
                int b=s.pop();
                int a=s.pop();
                s.add(a+b);
            
            }
            else if(i.equals("-")){
                int b=s.pop();
                int a=s.pop();
                s.add(a-b);
                
            }
            else if(i.equals("*")){
                int b=s.pop();
                int a=s.pop();
                s.add(a*b);
               
            }
            else if(i.equals("/")){
                int b=s.pop();
                int a=s.pop();  
                s.add(a/b);
               
            }
            else{
                s.add(Integer.parseInt(i));
            }

        }
        return s.peek();
        
    }
}