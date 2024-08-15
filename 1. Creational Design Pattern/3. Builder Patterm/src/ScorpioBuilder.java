import Modules.ICar;
import Modules.ICarBuilder;
import Modules.Scorpio;

public  class ScorpioBuilder implements ICarBuilder {

    Scorpio s1;
    @Override
    public void buildEngine() {
        System.out.println("Scorpio engine getting inserted");

    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio Chassis getting inserted");

    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio bodyShell getting inserted");

    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio Tyre getting inserted");

    }
    public ICar build(){
        System.out.println("Scorpio is ready");
        return s1;

    }
}
