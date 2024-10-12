import java.awt.Frame;
import java.awt.event.WindowAdapter;
class MyFrame extends Frame{
    public MyFrame(){
        super("MyBank");
        setBounds(200,250,720,1080);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame ob=new MyFrame();
    }
}