import  java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UIComponents uiComponent = new Menu();

        uiComponent.add(new Button());
        uiComponent.add(new Button());
        Button btn = new Button();
        uiComponent.add(btn);

        uiComponent.draw();

        uiComponent.remove(btn);


        uiComponent.draw();
    }
}