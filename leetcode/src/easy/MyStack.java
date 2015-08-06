package easy;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

class MyStack {
	Queue<Integer> stack = new ArrayDeque<Integer>();
	int top = 0;
	boolean hasTop = false;
	
    // Push element x onto stack.
    public void push(int x) {
        if (!hasTop) top = x;
        stack.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Iterator<Integer> itr1 = stack.iterator();
        Iterator<Integer> itr2 = stack.iterator();
        
        if (stack.isEmpty()) return;
        
        itr1.next();
        while (itr1.hasNext()) {
        	itr1.next();
        	top = itr2.next();
        }
        
        itr1.remove();
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
