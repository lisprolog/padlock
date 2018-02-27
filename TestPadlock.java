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
                System.out.println("TestPadlock4!");
                Padlock p2 = new Padlock();
                p2.initPadlock(0,9,9,9);
                System.out.println(p2.statusAllWheels());
                p2.turnFirstWheelBackward();
                System.out.println(p2.statusAllWheels());
                System.out.println("TestPadlock5!");
                p2.rollWheelsBackward01(9,9,9,9);
                System.out.println("TestPadlock6!");
                System.out.println(p2.toStringResults());
                System.out.println("TestPadlock7!");
        }
}
