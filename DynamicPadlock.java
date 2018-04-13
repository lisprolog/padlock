import java.util.LinkedList;

public class DynamicPadlock{

        static LinkedList<Wheel> list;

        public DynamicPadlock(int n){
                this.list = new LinkedList<Wheel>();
                Wheel w1 = new Wheel();;
                for(int i = 0; i < n; i++){
                      w1 = new Wheel();
                      list.add(w1);
                }

        }        
}
