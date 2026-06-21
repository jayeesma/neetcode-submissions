class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null) {
            return -1;
        }

        PriorityQueue<Integer> heap = new PriorityQueue();

        for(int i=0;i<nums.length;i++) {
            if(heap.size()<k) {
                heap.offer(nums[i]);
            } else if(nums[i]>heap.peek()) {
                heap.poll();
                heap.offer(nums[i]);

            }

        }
        return heap.peek();
    }
}
