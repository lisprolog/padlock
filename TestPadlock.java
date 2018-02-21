public class TestPadlock{
        public static void main(String[] args){
                System.out.println("TestPadlock!");
                Padlock p1 = new Padlock();
                p1.initPadlock(1,1,9,9);
                System.out.println(p1.statusFirstWheel());
                System.out.println(p1.statusSecondWheel());
                System.out.println(p1.statusThirdWheel());
                System.out.println(p1.statusFourthWheel());
                p1.firstAllStepsForward();
                p1.secondAllStepsBackward();
        }
}
