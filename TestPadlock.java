public class TestPadlock{
        public static void main(String[] args){

                Padlock p1 = new Padlock();
                Padlock p2 = new Padlock();
                Padlock p3 = new Padlock();
                Padlock p4 = new Padlock();
//              important for our initalisation
                int a = 1;
                int b = 1;
                int c = 9;
                int d = 9;

                p1.initPadlock(a,b,c,d);
                p2.initPadlock(a,b,c,d);
                p3.initPadlock(a,b,c,d);
                p4.initPadlock(a,b,c,d);

                p1.rollWheelsBackward01b(1,1,1,1);
                p2.rollWheelsForward03b(1,1,1,1);
                p3.rollWheelsMix01(1,1,1,1);

                System.out.println("p1: " + p1.getMinTurns(4));
                System.out.println("p2: " + p2.getMinTurns(4));
                System.out.println("p3: " + p3.getMinTurns(4));
        }
}
