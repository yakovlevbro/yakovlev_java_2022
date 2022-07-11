// Min Stack

class MinStack {
 int minVal = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (val <= minVal) {
            stack.push(minVal);
            minVal = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == minVal) {
            minVal = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
