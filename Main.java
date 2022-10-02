import java.awt.*;
public class Main{
public static void main (String[] args) {
Frame f = new Frame("Welcome to java");
Label l = new Label("Hi");
l.setBounds(250,250,100,100);
f.setSize(500,500);
f.setVisibel(true);
f.setLayout(null);
f.add(l);
}
}