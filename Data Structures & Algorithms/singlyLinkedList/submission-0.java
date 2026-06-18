class LinkedList {
    private Node head; 
    private Node tail; 

    public LinkedList() {
        this.head = new Node(-1, null);
        this.tail = this.head; 
    }

    public int get(int index) {
        Node curr = head.next; 
        int i = 0;

        while(curr != null) {
            if(i == index) 
                return curr.val; 

            i++; 
            curr = curr.next;
        }

        return -1; 
    }

    public void insertHead(int val) {
        Node newNode = new Node(val, null);

        newNode.next = head.next; 
        head.next = newNode;

        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new Node(val, null); 
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        Node curr = head.next; 
        Node prev = head;
        int i = 0;
        
        while(curr != null) {
            if(i == index) {
                prev.next = curr.next; 

                if(curr.next == null) 
                    tail = prev; 

                return true; 
            }

            prev = curr; 
            curr = curr.next; 
            i++;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head.next;

        while(curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        return arr; 
    }

    private class Node {
        public int val;
        public Node next; 

        public Node(int val, Node next) {
            this.val = val; 
            this.next = next; 
        }
    }
}
