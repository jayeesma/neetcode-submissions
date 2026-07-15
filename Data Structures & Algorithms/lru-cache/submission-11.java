// Using doubly LinkedList and Map
class Node{
    Node next;
    Node prev;
    int key;
    int value;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    Map<Integer,Node> cache;
    int capacity;
    Node left = null;
    Node right = null;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void insertNode(Node newNode) {
        Node prev = this.right.prev;
        newNode.prev = prev;
        prev.next = newNode;
        newNode.next = this.right;
        this.right.prev = newNode;
    }

    public void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    public int get(int key) {
        
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            removeNode(node);
            insertNode(node);
            return node.value;
        } else {
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        Node newNode = new Node(key,value);
        if(cache.containsKey(key)) {
            removeNode(cache.get(key));
        }
        cache.put(key,newNode);
        insertNode(newNode);
        

        if(cache.size()>capacity) {
            Node lru = this.left.next;
            removeNode(lru);
            cache.remove(lru.key);

        }

    }
}
