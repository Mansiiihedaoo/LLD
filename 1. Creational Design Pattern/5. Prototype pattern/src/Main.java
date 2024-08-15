//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create a proto type
        IScorpioPrototype prototype = new Scorpio();

        //create a ScorpioN
        IScorpioPrototype ScorpioN = prototype.clone();
        ScorpioN.setEngine(new ScorpioNEngine());

        //create a ScorpioClassic
        IScorpioPrototype ScorpioClassic = prototype.clone();
        ScorpioN.setEngine(new ScorpioClassicEngine());


    }
}