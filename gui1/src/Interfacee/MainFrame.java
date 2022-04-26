
package Interfacee;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
    public MainFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
         
        
        // initializing all other interfaces
        AdminBtn.initialize(); // styling etc
        AdminBtn.get().addActionListener(this);
        frame.add(AdminBtn.get()); 
        
        // user tab
        
        // admin tab
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AdminBtn.get()) {
            System.out.println("a");
        }
    }
}
