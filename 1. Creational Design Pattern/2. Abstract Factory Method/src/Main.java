import Modules.DefenderFactory;
import Modules.IVehicalFactory;
import Modules.ScorpioFactory;

import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        IVehicalFactory factory1 = new ScorpioFactory();
        IVehicalFactory factory2 = new DefenderFactory();

        Car car1 = new Car(factory1);
        Car car2 = new Car(factory2);

        Collection<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);

        for(Car c : list){

            c.driveCar();
        }


    }
}