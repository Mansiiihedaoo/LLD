import java.util.*;

public class ATCTower{
    //beforehand data hona chahoye saare aircraft ka
    ArrayList<IAirCraft> queueForLanding = new ArrayList<>();

    synchronized public void requestToLand(IAirCraft aircraft) {
        //check for permission and if permission is granted then call land method
        aircraft.land();

    }
}
