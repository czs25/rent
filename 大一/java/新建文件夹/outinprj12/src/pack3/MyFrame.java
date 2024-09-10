package pack3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame {
    public MyFrame(){
        JButton btn = new JButton("按钮");
        this.getContentPane().add(btn);

        MyListener myListener = new MyListener();
//        btn.addActionListener(myListener);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int r = random.nextInt(255);
                int g = random.nextInt(255);
                int b = random.nextInt(255);
                Color color = new Color(r, g, b);
                btn.setBackground(color);
            }
        });
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
