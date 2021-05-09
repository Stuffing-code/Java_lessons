package ex6_swing;

import javax.swing.*;
import java.awt.*;

// awt, swing, javaFX

public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Dive");
//        JButton b = new JButton("learn Java");
        add(new JButton("learn Java CENTER"), BorderLayout.CENTER);
        add(new JButton("learn Java SOUTH"), BorderLayout.SOUTH);
        add(new JButton("learn Java WEST"), BorderLayout.WEST);
        add(new JButton("learn Java EAST"), BorderLayout.EAST);
        add(new JButton("learn Java NORTH"), BorderLayout.NORTH);


        setVisible(true);
    }
}
