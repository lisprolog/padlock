public class MyStack{

        private Node head;
        private Node pointer;

        public MyStack(){
             this.head = null; 
             this.pointer = head;
        }

        public boolean add(int n){
                Node newNode = new Node(n);
                if(head == null){
                        Node h = new Node(-1);
                        head = h;
                        head.setNext(newNode);
                }else{
                        pointer = head.getNext();
                        newNode.setNext(pointer);
                        head.setNext(newNode);
                }
                return true;
        }

        public boolean add(int n, String s){
                Node newNode = new Node(n, s);
                if(head == null){
                        Node h = new Node(-1);
                        head = h;
                        head.setNext(newNode);
                }else{
                        pointer = head.getNext();
                        newNode.setNext(pointer);
                        head.setNext(newNode);
                }
                System.out.println("ADD");
                return true;
        }

        public String toString1(){
                if(head == null){
                        return "empty";
                }
                pointer = head.getNext();
                String s = "";
                int m;
                while(pointer.getNext() != null){
                    m = pointer.getElem();
                    s +=  m + " ";
                    pointer = pointer.getNext();
                }
                s += ""+ getTop();
                return s;
        }

        public String toString2(){
                if(head == null){
                        return "empty";
                }
                pointer = head.getNext();
                String s = "";
                int n;
                String m = "";
                while(pointer.getNext() != null){
                    n = pointer.getElem();
                    m = pointer.getElem2();
                    s += n + ":" + m + " ";
                    pointer = pointer.getNext();
                }
                s += getTop() + ":" +getTopElem2();
                return s;
        }



        public int getTop(){
                return pointer.getElem();
        }

        public String getTopElem2(){
                return pointer.getElem2();
        }

        public int turnF(){
                if(pointer.getElem() == 9){
                        pointer = head.getNext();
                }else{
                        pointer = pointer.getNext();
                }
                return pointer.getElem();   
        }

        public int turnF(int times){
                for(int i = 0; i < times; i++){
                        turnF();
                }
                return pointer.getElem();   
        }

        public int turnB(){
                turnF(10);
                return pointer.getElem();   
        }

        public int turnB(int times){
                for(int i = 0; i < times; i++){
                        turnB();
                }
                return pointer.getElem();   
        }
}
