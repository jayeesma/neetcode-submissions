class KthLargest {
    int k;
    int[]nums;
    PriorityQueue<Integer> heap = new PriorityQueue();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

        for(int num:nums) {
            heapify(num);
            
        }
    }
    
    public int add(int val) {
        
            heapify(val);
            return heap.peek();

        
        }

    private void heapify(int num) {
        if(heap.size()<k) {
                heap.offer(num);
            } else if(num>heap.peek()) {
                heap.poll();
                heap.offer(num);
            }
    }
}

