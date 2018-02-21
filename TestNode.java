public class TestNode{
        public static void main(String[] args){
                System.out.println("TestNode:");
                Node n1 = new Node(0);
                System.out.println("Node1 (0) created");
                Node n2 = new Node(1);
                System.out.println("Node2 (1) created");
                System.out.println("N1 element: ");
                System.out.println(n1.getElem());
                System.out.println("N2 element: ");
                System.out.println(n2.getElem());
                n1.setNext(n2);
                System.out.println("n1 next(n2)");
                System.out.println("n1 getNext() equals:");
                System.out.println(n1.getNext().getElem());
        }
}
