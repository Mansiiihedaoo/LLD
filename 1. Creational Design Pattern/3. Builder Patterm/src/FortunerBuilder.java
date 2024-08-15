import Modules.Fortuner;
import Modules.ICar;
import Modules.ICarBuilder;


public class FortunerBuilder implements ICarBuilder {

    Fortuner f1;
    @Override
    public void buildEngine() {
        System.out.println("Fortuner engine getting inserted");

    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner Chassis getting inserted");

    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner bodyShell getting inserted");

    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner Tyre getting inserted");

    }
    public ICar build(){
        System.out.println("Fortuner is ready");
        return f1;

    }
}
