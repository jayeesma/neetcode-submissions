class LRUCache {
    int capacity;
    List<int[]> lruCache;

    public LRUCache(int capacity) {
        this.lruCache = new ArrayList();
        this.capacity = capacity;
    }

    public int get(int key) {
        int res = -1;
        for (int i = 0; i < lruCache.size(); i++) {
            if (key == lruCache.get(i)[0]) {
                res = lruCache.get(i)[1];
                lruCache.add(lruCache.get(i));
                lruCache.remove(i);
            }
        }
        return res;

        // O(n)
    }

    public void put(int key, int value) {
        for (int i = 0; i < lruCache.size(); i++) {
            if (key == lruCache.get(i)[0]) {
                lruCache.remove(i);
            }
            
        }
        lruCache.add(new int[] {key, value});

        if (lruCache.size() > capacity) {
            lruCache.remove(0);
        }
        System.out.println(lruCache);
    }
}
