package org.example;

import javax.swing.*;
import java.awt.*;

public class DesktopApp extends JFrame {
    static String appName = UtilityCommon.getAppName();
    public DesktopApp(){
        super(appName);
        setLayout(new FlowLayout());
        add(new JLabel("Wellcome to" + appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });

    }
}
