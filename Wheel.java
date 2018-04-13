public class Wheel{

        private Node head;
        private Node pointer;

        public Wheel(){
             this.head = null; 
             this.pointer = head;
        }

        //add wheel number
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
                s += ""+ getTop() + "\n";
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
                s += getTop() + ":" +getTopElem2() + "\n";
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
                turnF(9);
                return pointer.getElem();   
        }

        public int turnB(int times){
                for(int i = 0; i < times; i++){
                        turnB();
                }
                return pointer.getElem();   
        }

        public String getTurns(int turns){
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
                    if(n == turns){
                        s += n + ":" + m + "\n";
                    }
                    pointer = pointer.getNext();
                }
                n = pointer.getElem();
                m = pointer.getElem2();
                if(n == turns){
                    s += n + ":" + m + "\n";
                }
                if(s.equals("")){
                        return "empty";
                }else{
                        return s;
                }  
        }

        public String getMinTurns(int n){
                String temp = "";
                String result = "";
                for(int i = 0; i <= n; i++){
                        temp = getTurns(i);
                        if(!temp.equals("empty")){
                                result += getTurns(i);
                        }
                }
                return result;
        }
}
