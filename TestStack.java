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

                String status;
                status = stack01.getTop() + "-" + stack02.getTop() + "-" + stack03.getTop() + "-" + stack04.getTop();
                System.out.println("status: " + status);

                stack01.turnF();
                stack02.turnF();
                stack03.turnF();
                stack04.turnF();
                stack05.add(0,"1111");
                status = stack01.getTop() + "-" + stack02.getTop() + "-" + stack03.getTop() + "-" + stack04.getTop();
                System.out.println("turnF: " + status);

                stack01.turnB();
                stack02.turnB();
                stack03.turnB();
                stack04.turnB();
                stack05.add(3,"9999");
                status = stack01.getTop() + "-" + stack02.getTop() + "-" + stack03.getTop() + "-" + stack04.getTop();
                System.out.println("turnB: " + status);

                stack01.turnF(5);
                stack02.turnF(5);
                stack03.turnF(5);
                stack04.turnF(5);
                status = stack01.getTop() + "-" + stack02.getTop() + "-" + stack03.getTop()+ "-" + stack04.getTop();
                System.out.println("turnF 5: " + status);
                
                stack01.turnB(4);
                stack02.turnB(4);
                stack03.turnB(4);
                stack04.turnF(4);
                status = stack01.getTop() + "-" + stack02.getTop() + "-" + stack03.getTop()+ "-" + stack04.getTop();
                System.out.println("turnB 4: " + status);

                stack05.add(4,"9999");
                stack05.add(5,"9999");
                stack05.add(6,"9999");

                System.out.println("toString1:");
                System.out.println(stack05.toString1());
                System.out.println("toString2:");
                System.out.println(stack05.toString2());
        }
}
