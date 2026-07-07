class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = new Node(-1);
        this.tail = head;
    }

    public int get(int index) {
        Node curr = head.next;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        Node next = head.next;
        head.next = newNode;
        newNode.next = next;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        this.tail.next = newNode;
        this.tail = this.tail.next;
    }

    // 0, 1 ,2 , 3
    public boolean remove(int index) {
        int i = 0;
        Node curr = this.head;

        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
                curr.next = null;
                return true;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Node curr = this.head.next;
        while (curr != null) {
            arrayList.add(curr.val);
            curr = curr.next;
        }
        return arrayList;
    }
}
