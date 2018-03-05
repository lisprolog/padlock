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
                //System.out.println("TestPadlock5!");
                Padlock p2 = new Padlock();
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
                p2.initPadlock(a,b,c,d);
/*
                p2.turnFirstWheelBackward();
                p2.turnFirstWheelBackward();
                p2.turnFirstWheelBackward();
                p2.turnFirstWheelBackward();
*/
                p2.simpleAllStepsForward01(w,x,y,z);
                p2.simpleAllStepsForward02(w,x,y,z);
                p2.simpleAllStepsForward03(w,x,y,z);
                p2.simpleAllStepsForward04(w,x,y,z);
                p2.simpleAllStepsBackward01(w,x,y,z);
                p2.simpleAllStepsBackward02(w,x,y,z);
                p2.simpleAllStepsBackward03(w,x,y,z);
                p2.simpleAllStepsBackward04(w,x,y,z);
                p2.rollWheelsForward01(w,x,y,z);
                p2.rollWheelsForward02(w,x,y,z);
                p2.rollWheelsForward03(w,x,y,z);
                p2.rollWheelsForward04(w,x,y,z);
                p2.rollWheelsBackward01(w,x,y,z);
                p2.rollWheelsBackward02(w,x,y,z);
                p2.rollWheelsBackward03(w,x,y,z);
                p2.rollWheelsBackward04(w,x,y,z);

                //System.out.println(p2.toStringResults());
                System.out.println(p2.getMinTurns(24));
        }
}
