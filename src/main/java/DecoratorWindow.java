public abstract class DecoratorWindow implements Window {
    protected Window windowDecorated;

    public DecoratorWindow(Window windowDecorated) {
        this.windowDecorated = windowDecorated;
    }
}
