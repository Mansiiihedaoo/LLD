package models;

import constants.DirectionStatus;

public class HallBtn extends Button{
    private DirectionStatus DirBtn;

    public  void press(){
        //logic
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
