package usc.ac.ir;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProductRepairTicket extends JFrame {
    public JTextField enterYourRepairRequestTextField;
    public JPanel panel1;

    public ProductRepairTicket() {
        enterYourRepairRequestTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Your request ticket is saved!");
            }
        });
    }
}
