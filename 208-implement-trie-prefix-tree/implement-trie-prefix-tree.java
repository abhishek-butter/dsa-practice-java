class Trie {
    class TrieNode{
        TrieNode children[]=new TrieNode[26];
        boolean flag=false;
    }
    TrieNode root;

    public Trie() {
        root=new TrieNode();

        
    }
    
    public void insert(String word) {
        TrieNode t=root;
        for(char c:word.toCharArray()){
            if(t.children[c-'a']==null)t.children[c-'a']=new TrieNode();
            t=t.children[c-'a'];

        }
        t.flag=true;
        
    }
    
    public boolean search(String word) {
        TrieNode t=root;
        for(char c:word.toCharArray()){
            if(t.children[c-'a']==null)return false;
            t=t.children[c-'a'];

        }
        if(t.flag)return true;
        else return false;
        
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode t=root;
        for(char c:prefix.toCharArray()){
            if(t.children[c-'a']==null)return false;
            t=t.children[c-'a'];

        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */