public class MyHashMap {
    private float minFactor = 0.25f;
    private float maxFactor = 0.75f;
    private int length = 16;

    private Node[] array;
    private int size = 0;

    public MyHashMap() {
        array = new Node[length];
    }

    public void put(int key, int value) {
        if (size >= length * maxFactor) {
            resize(length * 2);
        }

        int index = getIndex(key);
        if (array[index] == null) {
            array[index] = new Node(key, value);
        } else {
            Node p = array[index];
            while (p != null) {
                if (p.key == key) {
                    p.value = value;
                    break;
                } else {
                    p = p.next;
                }
            }
            if (p == null) {
                Node node = new Node(key, value);
                node.next = array[index];
                array[index] = node;
            }
        }

        size++;
    }

    public int get(int key) {
        int index = getIndex(key);
        if (array[index] == null) {
            return -1;
        } else {
            int v = -1;
            Node p = array[index];
            while (p != null) {
                if (p.key == key) {
                    v = p.value;
                    break;
                } else {
                    p = p.next;
                }
            }
            return v;
        }
    }

    public void remove(int key) {
        int index = getIndex(key);
        if (array[index] != null) {
            Node p = array[index];
            Node parent = null;
            while (p != null) {
                if (p.key == key) {
                    if (parent == null) {
                        array[index] = p.next;
                    } else {
                        parent.next = p.next;
                    }
                    size--;
                    break;
                } else {
                    parent = p;
                    p = p.next;
                }
            }
        }

        if (size < length * minFactor) {
            if (length / 2 >= 16) {
                resize(length / 2);
            }
        }
    }

    private void resize(int length) {
        int oldLength = this.length;
        Node[] oldArray = array;
        this.length = length;
        this.array = new Node[length];

        for (int i = 0; i < oldLength; i++) {
            if (oldArray[i] != null) {
                Node p = oldArray[i];
                while (p != null) {
                    put(p.key, p.value);
                    p = p.next;
                }
            }
        }
    }

    private int getIndex(int key) {
        return hash(key) & (length - 1);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private static class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }
}