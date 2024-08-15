package models;
import java.util.List;

public class Building {
    private  List<Floor> floorList;
    private  List<Elevator> felevatorList;

    private static Building buildingIns = null;

    private static Building getInstance(){
        if(buildingIns == null){
            buildingIns = new Building();

        }
        return buildingIns;
    }



}
