
package Interfacee;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class AdminBtn {
    static JButton adminBtn;
    public static void initialize() {
        adminBtn = new JButton();
        adminBtn = new JButton();
        adminBtn.setSize(100, 50);
        adminBtn.setText("button");
        adminBtn.setBorder(BorderFactory.createLineBorder(Color.black , 1));
        adminBtn.setForeground(Color.black);
        adminBtn.setBackground(Color.lightGray);
    }
    
    public static JButton get() {
        return adminBtn;
    }
}
