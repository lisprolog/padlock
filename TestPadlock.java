public class TestPadlock{
        public static void main(String[] args){
                System.out.println("TestPadlock1!");
                Padlock p1 = new Padlock();
                p1.initPadlock(9,0,0,0);
                System.out.println("TestPadlock2!");
                p1.rollWheelsForward01(0,0,0,0);
                System.out.println("TestPadlock3!");
                //Needs correction
                //System.out.println(p1.toStringResults());
                System.out.println("TestPadlock4!");
        }
}
