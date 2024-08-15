//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {


        AbstractScorpio scorpio = new ScorpioN(new ScorpioN_Impl_USA());
        System.out.println(scorpio.isRightHanded());

    }
}