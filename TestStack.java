public class TestStack{
        public static void main(String[] args){
                System.out.println("Hello Stack");

                MyStack stack01 = new MyStack();
                MyStack stack02 = new MyStack();
                MyStack stack03 = new MyStack();
                MyStack stack04 = new MyStack();

                MyStack stack05 = new MyStack();

                for(int i = 9; i > -1; i--){
                        stack01.add(i);
                        stack02.add(i);
                        stack03.add(i);
                        stack04.add(i);
                }
                System.out.println("+++++++++++++++FORWARD WHEEL testing+++++++++++++++++++");
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println(stack01.getTop());
                stack01.turnF();
                System.out.println("+++++++++++++++BACKWARD WHEEL testing+++++++++++++++++++");
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println(stack01.getTop());
                stack01.turnB();
                System.out.println("toString1:");
                System.out.println(stack05.toString1());
                System.out.println("toString2:");
                System.out.println(stack05.toString2());
        }
}
