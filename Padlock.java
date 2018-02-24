public class Padlock{

        private MyStack stack01;        //wheel 1
        private MyStack stack02;        //wheel 2
        private MyStack stack03;        //wheel 3
        private MyStack stack04;        //wheel 4
        private MyStack stack05;        //saved results

        public Padlock(){
                stack01 = new MyStack();
                stack02 = new MyStack();
                stack03 = new MyStack();
                stack04 = new MyStack();
                stack05 = new MyStack();

                for(int i = 9; i > -1; i--){
                        stack01.add(i);
                        stack02.add(i);
                        stack03.add(i);
                        stack04.add(i);
                }
        }

        public void initPadlock(int a, int b, int c, int d){
                System.out.println("Padlock Begin!");
                setFirstWheel(a);
                setSecondWheel(b);
                setThirdWheel(c);
                setFourthWheel(d);
                System.out.println("initialisiert: " + statusAllWheels());
        }

        public void turnFirstWheelForward(){
                stack01.turnF();
        }

        public void turnFirstWheelForward(int times){
                stack01.turnF(times);
        }

        public void turnSecondWheelForward(){
                stack02.turnF();
        }

        public void turnSecondWheelForward(int times){
                stack02.turnF(times);
        }

        public void turnThirdWheelForward(){
                stack03.turnF();
        }

        public void turnThirdWheelForward(int times){
                stack03.turnF(times);
        }

        public void turnFourthWheelForward(){
                stack04.turnF();
        }

        public void turnFourthWheelForward(int times){
                stack04.turnF(times);
        }

        public void turnFirstWheelBackward(){
                stack01.turnB();
        }

        public void turnFirstWheelBackward(int times){
                stack01.turnB(times);
        }

        public void turnSecondWheelBackward(){
                stack02.turnB();
        }

        public void turnSecondWheelBackward(int times){
                stack02.turnB(times);
        }

        public void turnThirdWheelBackward(){
                stack03.turnB();
        }

        public void turnThirdWheelBackward(int times){
                stack03.turnB(times);
        }

        public void turnFourthWheelBackward(){
                stack04.turnB();
        }

        public void turnFourthWheelBackward(int times){
                stack04.turnB(times);
        }

        public int statusFirstWheel(){
                return stack01.getTop();
        }

        public int statusSecondWheel(){
                return stack02.getTop();
        }

        public int statusThirdWheel(){
                return stack03.getTop();
        }

        public int statusFourthWheel(){
                return stack04.getTop();
        }

        public void setFirstWheel(int a){
                while(statusFirstWheel() != a){
                        turnFirstWheelForward();
                }
        }

        public void setSecondWheel(int b){
                while(statusSecondWheel() != b){
                        turnSecondWheelForward();
                }
        }

        public void setThirdWheel(int c){
                while(statusThirdWheel() != c){
                        turnThirdWheelForward();
                }
        }

        public void setFourthWheel(int d){
                while(statusFourthWheel() != d){
                        turnFourthWheelForward();
                }
        }

        public String statusAllWheels(){
                String result = "" + statusFirstWheel() + "-" + statusSecondWheel() + "-" + statusThirdWheel() + "-" + statusFourthWheel();
                return result;
        }

        public boolean combinationCheck(){
                boolean check1 = false;
                boolean check2 = false;
                boolean check3 = false;
                if(statusFirstWheel() == statusSecondWheel()){
                        check1 = true;
                }
                if(statusThirdWheel() == statusFourthWheel()){
                        check2 = true;
                }
                if(statusFirstWheel() == statusThirdWheel()){
                        check3 = true;
                }
                return check3;
        }

        public void firstAllStepsForward(){
                int count = 0;

                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck()){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnFirstWheelForward();
                                                count++;
                                        }
                                        if(combinationCheck()){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnSecondWheelForward();
                                        count++;
                                }
                                if(combinationCheck()){
                                        saveState(count, statusAllWheels());
                                }
                                turnThirdWheelForward();
                                count++;
                        }
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        turnFourthWheelForward();
                        count++;
                }
        }

        public void secondAllStepsBackward(){
                int count2 = 0;
                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck()){
                                                        saveState(count2, statusAllWheels());
                                                }
                                                turnFirstWheelBackward();
                                                count2++;
                                        }
                                        if(combinationCheck()){
                                                saveState(count2, statusAllWheels());
                                        }
                                        turnSecondWheelBackward();
                                        count2++;
                                }
                                if(combinationCheck()){
                                        saveState(count2, statusAllWheels());
                                }
                                turnThirdWheelBackward();
                                count2++;
                        }
                        if(combinationCheck()){
                                saveState(count2, statusAllWheels());
                        }
                        turnFourthWheelBackward();
                        count2++;
                }
        }

        public void thirdRollWheelsForward(){
                int count = 0;
                for(int i = 0; i < 10; i++){
                        turnFirstWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
        }

        public int fourthRollWheelsBackward(){
                int count = 0;
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                return count;
        }

        public int fifthRollWheelsForward(){
                int count = 0;
                for(int i = 0; i < 10; i++){
                        turnFourthWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelForward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                return count;
        }

        public int sixthRollWheelsBackward(){
                int count = 0;
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        if(combinationCheck()){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                return count;
        }

        public void saveState(int c, String state){
                //System.out.println("savestate:" + c  + " " + state);
                stack05.add( c , state);
        }

        public String toStringResults(){
                return stack05.toString2();
        }
}
