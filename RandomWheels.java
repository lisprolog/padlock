public class RandomWheels{
        private int times;

        public RandomWheels(int n){
                this.times = n;
        }

        public boolean Factory(){
                WheelFactory f = new WheelFactory();
                Wheel w = f.createWheel();
                return true;
        }
       
}
