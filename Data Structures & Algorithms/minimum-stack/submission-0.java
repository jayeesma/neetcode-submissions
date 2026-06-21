class MinStack {
    Deque<Integer> stack;
    public MinStack() {
        Deque<Integer> stack = new ArrayDeque();
        this.stack = stack;
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!stack.isEmpty()) {
            int min = stack.peek();
            Deque<Integer> tempStack = new ArrayDeque<>();
            while (!stack.isEmpty()) {
                if (min > stack.peek()) {
                    min = stack.peek();
                }
                tempStack.push(stack.pop());
            }
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
            return min;
        }
        return 0;
    }
}
