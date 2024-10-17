import java.awt.Frame;
import java.awt.event.WindowAdapter;
class MyFrame extends Frame{
    public MyFrame(){
        super("MyBank");
        setBounds(-1,-1,1000,1000);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame ob=new MyFrame();
    }
}