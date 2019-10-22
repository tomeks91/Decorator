public class CloseableWindow extends DecoratorWindow {
    public CloseableWindow(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Close Window");
    }
}
