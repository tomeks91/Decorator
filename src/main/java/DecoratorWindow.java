public abstract class DecoratorWindow implements Window {
    private final Window window;

    public DecoratorWindow (Window windowToBeDecorated) {
        this.window = windowToBeDecorated;
    }

    @Override
    public void draw() {
        this.window.draw();
    }
}
