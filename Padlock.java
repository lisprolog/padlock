public class Padlock{

        private MyStack stack01;        //wheel 1
        private MyStack stack02;        //wheel 2
        private MyStack stack03;        //wheel 3
        private MyStack stack04;        //wheel 4
        private MyStack stack05;        //saved results
	private int count = 0;

	//initializes 4 wheels and a stack to save counts
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
		if(combinationCheck(a, b, c, d)){
			saveState(count, statusAllWheels());
		}
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

        public void turnAllWheels(){
                stack01.turnF();
                stack02.turnF();
                stack03.turnF();
                stack04.turnF();
        }

        public void turnAllWheels(int times){
                stack01.turnF(times);
                stack02.turnF(times);
                stack03.turnF(times);
                stack04.turnF(times);
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

        public boolean combinationCheck(int a, int b, int c, int d){
                boolean checkAll = true;
        /*
                // this one is for chosen padlock digits
                if(statusFirstWheel() != a){
                        checkAll = false;
                }
                if(statusSecondWheel() != b){
                        checkAll = false;
                }
                if(statusThirdWheel() != c){
                        checkAll = false;
                }
                if(statusFourthWheel() != d){
                        checkAll = false;
                }
        */
                // to make sure all digits are identical
                if(statusFirstWheel() == statusSecondWheel() && statusThirdWheel() == statusFourthWheel() && statusFirstWheel() == statusFourthWheel()){
                        checkAll = true;
                }else{
                        checkAll = false;
                }
                return checkAll;
        }

        // Brute Force Forward #1 start Wheel #1
        public int simpleAllStepsForward01(int a, int b, int c, int d){
                count = 0;

                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnFirstWheelForward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnSecondWheelForward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnThirdWheelForward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnFourthWheelForward();
                        count++;
                }
                return count;
        }

        // Brute Force Forward #2 start Wheel #2
        public int simpleAllStepsForward02(int a, int b, int c, int d){
                count = 0;

                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnSecondWheelForward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnThirdWheelForward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnFourthWheelForward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnFirstWheelForward();
                        count++;
                }
                return count;
        }

        // Brute Force Forward #3 start Wheel #3
        public int simpleAllStepsForward03(int a, int b, int c, int d){
                count = 0;

                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnThirdWheelForward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnFourthWheelForward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnFirstWheelForward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnSecondWheelForward();
                        count++;
                }
                return count;
        }

        // Brute Force Forward #4 start Wheel #4
        public int simpleAllStepsForward04(int a, int b, int c, int d){
                count = 0;

                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnFourthWheelForward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnFirstWheelForward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnSecondWheelForward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnThirdWheelForward();
                        count++;
                }
                return count;
        }

        // Brute Force Backward #1 start wheel #1
        public int simpleAllStepsBackward01(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnFirstWheelBackward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnSecondWheelBackward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnThirdWheelBackward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnFourthWheelBackward();
                        count++;
                }
                return count;
        }

        // Brute Force Backward #2 start wheel #2
        public int simpleAllStepsBackward02(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnSecondWheelBackward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnThirdWheelBackward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnFourthWheelBackward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnFirstWheelBackward();
                        count++;
                }
                return count;
        }

        // Brute Force Backward #3 start wheel #3
        public int simpleAllStepsBackward03(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnThirdWheelBackward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnFourthWheelBackward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnFirstWheelBackward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnSecondWheelBackward();
                        count++;
                }
                return count;
        }

        // Brute Force Backward #4 start wheel #4
        public int simpleAllStepsBackward04(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 10; j++){
                                for(int k = 0; k < 10; k++){
                                        for(int l = 0; l < 10; l++){
                                                if(combinationCheck(a, b, c, d)){
                                                        saveState(count, statusAllWheels());
                                                }
                                                turnFourthWheelBackward();
                                                count++;
                                        }
                                        if(combinationCheck(a, b, c, d)){
                                                saveState(count, statusAllWheels());
                                        }
                                        turnFirstWheelBackward();
                                        count++;
                                }
                                if(combinationCheck(a, b, c, d)){
                                        saveState(count, statusAllWheels());
                                }
                                turnSecondWheelBackward();
                                count++;
                        }
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        turnThirdWheelBackward();
                        count++;
                }
                return count;
        }

        // Wheelie forward 01 start wheel #1
        public int rollWheelsForward01(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){                        
                        turnFirstWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie forward 01 start wheel #1 Steps 2
        public int rollWheelsForward01b(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 2; i++){                        
                        turnFirstWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 2; i++){
                        turnSecondWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 2; i++){
                        turnThirdWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 2; i++){
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie forward 02 start wheel #2
        public int rollWheelsForward02(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){                        
                        turnSecondWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie forward 03 start wheel #3
        public int rollWheelsForward03(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){                        
                        turnThirdWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie forward 03 start wheel #3 Steps 2
        public int rollWheelsForward03b(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 2; i++){                        
                        turnThirdWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 2; i++){
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 2; i++){
                        turnFirstWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 2; i++){
                        turnSecondWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie forward 04 start wheel #4
        public int rollWheelsForward04(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){                        
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelForward();
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                        count++;
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }

                }
                return count;
        }

        // Wheelie backward 1 start wheel #1
        public int rollWheelsBackward01(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }

        // Wheelie backward 1 start wheel #1 Steps 2
        public int rollWheelsBackward01b(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 2; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnThirdWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnFourthWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }


        // Wheelie backward 2 start wheel #2
        public int rollWheelsBackward02(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnThirdWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }

        // Wheelie backward 3 start wheel #3
        public int rollWheelsBackward03(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        turnThirdWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }

        // Wheelie backward 4 start wheel #4
        public int rollWheelsBackward04(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 10; i++){
                        turnFourthWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 10; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }

// Wheelie forwardBackward mix step 1
    public int rollWheelsMix01(int a, int b, int c, int d){
            count = 0;

	    turnFirstWheelBackward();
            count++;
            if(combinationCheck(a, b, c, d)){
                    saveState(count, statusAllWheels());
            }
            System.out.println("1:"+statusAllWheels());

            turnSecondWheelBackward();
            count++;
            if(combinationCheck(a, b, c, d)){
                    saveState(count, statusAllWheels());
            }
            System.out.println("2:"+statusAllWheels());
                                                                                                                                                              turnThirdWheelForward();
            count++;
            if(combinationCheck(a, b, c, d)){
                    saveState(count, statusAllWheels());
            }
            System.out.println("3:"+statusAllWheels());
                                                                                                                                                                                                             
            turnFourthWheelForward();
            count++;
            if(combinationCheck(a, b, c, d)){
                    saveState(count, statusAllWheels());
            }
                                                                                                                                                              System.out.println("4:"+statusAllWheels());

            return count;
    }
	
        // Wheelie forwardBackward mix steps 2
        public int rollWheelsMix02(int a, int b, int c, int d){
                count = 0;
                for(int i = 0; i < 2; i++){
                        turnFirstWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnSecondWheelBackward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnThirdWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                for(int i = 0; i < 2; i++){
                        turnFourthWheelForward();
                        count++;
                        if(combinationCheck(a, b, c, d)){
                                saveState(count, statusAllWheels());
                        }
                }
                return count;
        }

	//saves count and current state on stack05
        public void saveState(int c, String state){
                System.out.println("savestate:" + c  + " " + state);
                stack05.add(c, state);
        }

        public String toStringResults(){
                return stack05.toString2();
        }

        //
        public String getMinTurns(int turns){
                return stack05.getMinTurns(turns);
        }

        // FRONT
        public int sixteenStates00(int steps, int a, int b, int c, int d){
                int count = 0;
                
                turnFirstWheelForward(steps);
                combinationCheck(a,b,c,d);
                turnSecondWheelForward(steps);
                combinationCheck(a,b,c,d);
                turnThirdWheelForward(steps);
                combinationCheck(a,b,c,d);
                turnFourthWheelForward(steps);
                combinationCheck(a,b,c,d);
                return count;
        }

        public int sixteenStates01(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelForward();
                turnThirdWheelForward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates02(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelForward();
                turnThirdWheelBackward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates03(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelForward();
                turnThirdWheelBackward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates04(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelBackward();
                turnThirdWheelForward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates05(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelBackward();
                turnThirdWheelForward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates06(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelBackward();
                turnThirdWheelBackward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates07(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelForward();
                turnSecondWheelBackward();
                turnThirdWheelBackward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates08(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelForward();
                turnThirdWheelForward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates09(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelForward();
                turnThirdWheelForward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates10(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelForward();
                turnThirdWheelBackward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates11(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelForward();
                turnThirdWheelBackward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates12(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelBackward();
                turnThirdWheelForward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates13(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelBackward();
                turnThirdWheelForward();
                turnFourthWheelBackward();
                return count;
        }

        public int sixteenStates14(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelBackward();
                turnThirdWheelBackward();
                turnFourthWheelForward();
                return count;
        }

        public int sixteenStates15(int a, int b, int c, int d){
                int count = 0;
                turnFirstWheelBackward();
                turnSecondWheelBackward();
                turnThirdWheelBackward();
                turnFourthWheelBackward();
                return count;
        }
}
