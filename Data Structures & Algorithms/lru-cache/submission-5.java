class Node {
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key, int value) {
        this.value = value;
        this.key = key;
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer, Node> cache;
    Node left;
    Node right;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = right;
        this.right.prev = left;
        cache = new HashMap<Integer,Node>();
    }

    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public int get(int key) {
        int res = -1;
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            res = node.value;
            remove(node);
            insert(node);
        } 
        return res;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            // update
            Node node = cache.get(key);
            remove(node);
        }
        Node node = new Node(key,value);
        cache.put(key, node);
        insert(node);

        if(cache.size()>capacity) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }


        
    }
}
