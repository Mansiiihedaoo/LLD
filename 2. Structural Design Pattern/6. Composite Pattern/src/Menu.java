import java.util.*;
public class Menu implements UIComponents {
    ///Menu k andar bhot ssaaare parts ho skte hai
    //iske andar k saare parts ko main -> Children kehra hu

    List<UIComponents> children = new ArrayList<>();

    @Override
    public void draw() {
        for (UIComponents cmp : children) {
            cmp.draw();
        }
    }

    @Override
    public void add(UIComponents component) {
        children.add(component);
    }

    @Override
    public void remove(UIComponents component) {
        children.remove(component);
    }
}
