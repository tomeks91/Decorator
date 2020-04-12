public class CloseableWindow extends DecoratorWindow {
    public CloseableWindow(Window windowDecorated) {
        super(windowDecorated);
    }

    @Override
    public void draw(){
        windowDecorated.draw();
        System.out.println("Close Window");
    }
}
