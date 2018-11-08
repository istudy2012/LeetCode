package implement;

class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        Node p = findNode(index);
        return p.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (size == 0) {
            head = new Node(val);
        } else {
            if (tail == null) {
                tail = head;
            }
            Node t = new Node(val);
            t.next = head;
            head.prev = t;
            head = t;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (size == 0) {
            head = new Node(val);
        } else {
            Node t = new Node(val);
            if (tail == null) {
                head.next = t;
                t.prev = head;
                tail = t;
            } else {
                tail.next = t;
                t.prev = tail;
                tail = t;
            }
        }

        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node p = findNode(index);
            Node t = new Node(val);
            p.prev.next = t;
            t.prev = p.prev;
            t.next = p;
            p.prev = t;
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }

        if (index == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
        } else if (index == size - 1) {
            Node t = tail.prev;
            t.next = null;
            tail.prev = null;
            tail = t;
        } else {
            Node p = findNode(index);
            p.prev.next = p.next;
            p.next.prev = p.prev;
        }
        size--;
    }

    private Node findNode(int index) {
        int n = index;
        Node p = head;
        while (n != 0) {
            p = p.next;
            n--;
        }

        return p;
    }

    private static class Node {
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}