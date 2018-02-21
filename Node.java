public class Node{

        private int elem;
        private Node next;

        public Node(int n){
                this.elem = n;
        }

        public int getElem(){
                return this.elem;
        }

        public void setNext(Node nextNode){
                this.next = nextNode;
        }

        public Node getNext(){
                return this.next;
        }
}
