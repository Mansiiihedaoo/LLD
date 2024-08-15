package models;

public class ElevatorSystem {
    private Building building;

    private static ElevatorSystem ElevatorSystemInstance = null;


    public static ElevatorSystem getInstance()
    {
        if(ElevatorSystemInstance == null){
            ElevatorSystemInstance = new ElevatorSystem();

        }
        return ElevatorSystemInstance;
    }

    public void monitoring(){
        // add logic
    }

    public void dispatcherAlgo(){
        // add logic
    }

    // add utility func
}
