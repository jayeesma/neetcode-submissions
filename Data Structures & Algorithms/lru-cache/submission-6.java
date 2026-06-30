class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node (int key, int value) {
        this.val = value;
        this.key = key;
        this.prev = null;
        this.next =null;
    }
}

class LRUCache {
    HashMap<Integer,Node> cache ;
    Node left;
    Node right;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new HashMap();
        this.capacity =capacity;
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
        
    }
    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        next.prev = prev;
        prev.next = next;
    }
    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;

    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node node = new Node(key,value);
        cache.put(key,node);
        insert(node);
        if(cache.size()>capacity) {
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
