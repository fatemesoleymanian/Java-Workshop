package usc.ac.ir;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Guarantee extends JFrame {
    public JButton guaranteedProductsButton;
    public JButton productChangeTicketButton;
    public JButton allTicketsButton;
    public JButton productRepairTicketButton;
    private JPanel mainPanel;
    public Guarantee(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        productChangeTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ProductChangeTicket();
                frame.setContentPane(new ProductChangeTicket().panel1);
                frame.setVisible(true);
            }
        });
        productRepairTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ProductRepairTicket();
                frame.setContentPane(new ProductRepairTicket().panel1);
                frame.setVisible(true);
            }
        });
        allTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new AllTickets();
                frame.setContentPane(new AllTickets().allTicketsPanel);
                frame.setVisible(true);
            }
        });
        guaranteedProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new GuaranteedProducts();
                frame.setContentPane(new GuaranteedProducts().guaranteedProductsPanel);
                frame.setVisible(true);
            }
        });
    }
        public static void main(String[] args) {
            JFrame frame = new Guarantee("Guarantee Company");
            frame.setVisible(true);

    }

}
