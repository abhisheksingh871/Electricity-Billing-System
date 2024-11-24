package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image im2 = imageIcon.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image = new JLabel(im3);
        add(image);
        //setSize(730,550);
        //setLocation(400, 150);
        setVisible(true);
        int x = 1;
        for(int i = 2; i < 600; i+=4, x+=1){
            setSize(i+x, i);
            setLocation(700-((i+x)/2), 400-(i/2));
            try {
                Thread.sleep(3);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        t = new Thread(this);
        t.start();
        setVisible(true);
    }
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            setVisible(false);
            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }

}
