import Modules.ICar;
import Modules.ICarBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);

        //guidance dedo
        director.construct(true, true, true);

        ICar car = builder.build();

    }
}