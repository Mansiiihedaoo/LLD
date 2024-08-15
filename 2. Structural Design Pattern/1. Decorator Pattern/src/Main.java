import Modules.BulletProof;
import Modules.ICar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ICar scorpio = new Scorpio();

        ICar bulletproofScorpio = new BulletProof(scorpio);
        float totalWeight = bulletproofScorpio.getWeight();
        System.out.println(" Total weight : "+ totalWeight);


    }
}