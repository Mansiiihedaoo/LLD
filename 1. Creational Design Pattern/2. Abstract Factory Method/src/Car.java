import Modules.IEngine;
import Modules.IVehicalFactory;

public class Car {
    IEngine engine;
    IVehicalFactory carFactory;

    Car(IVehicalFactory factory){
        this.carFactory = factory;
    }
    public void driveCar(){
        carFactory.creatEngine();
        System.out.println("Take yor car its ready ");
    }


}
