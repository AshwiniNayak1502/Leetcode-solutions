class TrieNode{
    TrieNode children[];
    boolean end;

    public TrieNode() {
        this.children=new TrieNode[26];
        this.end=false;    
    }
}
class Trie {
    TrieNode root;

    public Trie() {
        root=new TrieNode();  
    }
    
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(current.children[ch-'a']==null)
                current.children[ch-'a']=new TrieNode();

            current=current.children[ch-'a'];

        }

        current.end=true;
    }
    
    public boolean search(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(current.children[ch-'a']==null)
                return false;
            current=current.children[ch-'a'];
        }
        if(current.end==false)
            return false;
        return true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(current.children[ch-'a']==null)
                return false;
            current=current.children[ch-'a'];
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
