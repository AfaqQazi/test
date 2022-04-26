import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    public MyFrame() {
        button = new JButton();
        button.setSize(100, 50);
        button.setText("button");
        button.setBorder(BorderFactory.createLineBorder(Color.black , 1));
        button.addActionListener(this);
        button.setForeground(Color.black);
        button.setBackground(Color.lightGray);
                
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);    
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("a");
        }
    }
}
