
public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();   // ["MinStack"]

        minStack.push(1);                     // "push", 1
        minStack.push(2);                     // "push", 2
        minStack.push(0);                     // "push", 0

        System.out.println(minStack.getMin()); // "getMin" → Output: 0
        minStack.pop();                        // "pop"
        System.out.println(minStack.top());    // "top" → Output: 2
        System.out.println(minStack.getMin()); // "getMin" → Output: 1
    }

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
