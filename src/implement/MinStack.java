package implement;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int n : list) {
            min = Math.min(min, n);
        }

        return min;
    }
}