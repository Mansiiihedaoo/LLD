package Modules;

public class BulletProof extends  ScorpioDecorator{

    ICar Scorpio;
    public BulletProof(ICar merScorpio){
        this.Scorpio = merScorpio;
    }

    @Override
    public void start() {
        Scorpio.start();

    }

    @Override
    public void stop() {
        Scorpio.stop();
    }

    @Override
    public float getWeight() {
        return 300f + Scorpio.getWeight();
    }
}
