public class Node{

        private int elem;
        private String elem2;
        private Node next;

        public Node(int n){
                this.elem = n;
        }

        public Node(int n, String s){
                this.elem = n;
                this.elem2 = s;
        }

        public int getElem(){
                return this.elem;
        }

        public String getElem2(){
                return this.elem2;
        }

        public void setNext(Node nextNode){
                this.next = nextNode;
        }

        public Node getNext(){
                return this.next;
        }
}
