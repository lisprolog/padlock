public class TestPadlock{
        public static void main(String[] args){
/*
                System.out.println("TestPadlock1!");
                Padlock p1 = new Padlock();
                p1.initPadlock(9,0,0,0);
                System.out.println(p1.statusAllWheels());
                System.out.println("TestPadlock2!");
                p1.rollWheelsForward01(0,0,0,0);
                System.out.println("TestPadlock3!");
                System.out.println(p1.toStringResults());
                System.out.println("TestPadlock4!");
*/
                Padlock p1 = new Padlock();
                Padlock p2 = new Padlock();
                Padlock p3 = new Padlock();
                Padlock p4 = new Padlock();
//              important for our initalisation
                int a = 1;
                int b = 1;
                int c = 9;
                int d = 9;
//              parameters have to be given, numbers are random because not important here.
//              if we would look for certain digits, these will become important 
                int w = 9;
                int x = 9;
                int y = 9;
                int z = 9;
                p1.initPadlock(a,b,c,d);
                p2.initPadlock(a,b,c,d);
                p3.initPadlock(a,b,c,d);
                p4.initPadlock(a,b,c,d);

                System.out.println(p2.statusAllWheels()); 
                p1.rollWheelsBackward01b(1,1,1,1);
                p2.rollWheelsForward03b(1,1,1,1);
                p3.rollWheelsMix01(1,1,1,1);
//              p4.starthere

                System.out.println("p1: " + p1.getMinTurns(4));
                System.out.println("p2: " + p2.getMinTurns(4));
                System.out.println("p3: " + p3.getMinTurns(4));
        }
}
