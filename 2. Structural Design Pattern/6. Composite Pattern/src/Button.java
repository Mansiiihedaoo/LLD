public class Button implements UIComponents {
    @Override
    public void draw() {
        System.out.println("drawing button");
    }

    @Override
    public void add(UIComponents component) {
        System.out.println("adding button");
    }

    @Override
    public void remove(UIComponents component) {
        System.out.println("removing button");
    }
}
