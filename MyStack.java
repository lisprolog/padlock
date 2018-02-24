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
                return true;
        }

        public String toString1(){
                String s = "";
                int n;
                String m;
                pointer = head;
                while(pointer.getNext() != null){
                    pointer = pointer.getNext();
                    n = pointer.getElem();
                    m = pointer.getElem2();
                    //System.out.println(n);
                    s += n  + " ";
                }
                return s;
        }

        public String toString2(){
                String s = "";
                int n;
                String m;
                pointer = head;
                while(pointer.getNext() != null){
                    pointer = pointer.getNext();
                    n = pointer.getElem();
                    m = pointer.getElem2();
                    //System.out.println(n);
                    s +=  m + " ";
                }
                return s;
        }

        public int getTop(){
                return pointer.getElem();
        }

        public int turnF(){
                if(pointer.getElem() == 9){
                        pointer = head;
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
