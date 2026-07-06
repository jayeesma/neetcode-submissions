class DynamicArray {
    int nums[];
    int capacity;
    int length;

    public DynamicArray(int capacity) {
        this.length = 0;
        this.capacity = capacity;
        this.nums = new int[this.capacity];
    }

    public int get(int i) {
        if(i<length) {
            return nums[i];
        }
        return -1;
        
    }

    public void set(int i, int n) {
        if(i<length) {
            nums[i] = n;
        }
    }

    public void pushback(int n) {
        if(length == capacity) {
            resize();
        }
        nums[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return nums[length];

    }

    private void resize() {
        capacity*=2;
        int newArr[] = new int[capacity];
        for(int i=0;i<length;i++) {
            newArr[i] = nums[i];
        }
        nums = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
