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
                System.out.println(p1.combinationCheck());
                Padlock p2 = new Padlock();
                p2.initPadlock(1,1,1,1);
                System.out.println(p2.combinationCheck());
                if(p2.combinationCheck()){
                        p2.saveState(0, p2.statusAllWheels());
                }
                System.out.println(p2.toStringResults());
        }
}
