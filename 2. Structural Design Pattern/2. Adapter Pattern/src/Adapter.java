import Modules.ICar;

public class Adapter implements ICar
{
    HotAirBallon hotAirBallon  ;

    public  Adapter(HotAirBallon  balloon){
        this.hotAirBallon = balloon;
    }

    @Override
    public void start() {
        String gastobeUsed =  hotAirBallon.getGasUsed();
        hotAirBallon.start(gastobeUsed);
    }
}
