package Modules;

public interface ICarBuilder {


    public void buildEngine();
    public void buildChassis();

    public void buildTyre();
    public void buildBodyShell();

    // this returns the final object
    public ICar build();
}
