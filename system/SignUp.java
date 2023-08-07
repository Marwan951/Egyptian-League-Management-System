package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignUp extends JFrame {
    Adminh a2 = new Adminh();
     JLabel j2 = new JLabel();
    JPanel p3 = new JPanel();
    JButton signup = new JButton("Sign Up");
    JButton cancel = new JButton("Cancel");
    JTextField textname = new JTextField();
    JTextField textuser = new JTextField();
    JTextField textphone = new JTextField();
    JTextField textpass = new JPasswordField();
     JTextField textpass2 = new JPasswordField();
    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Phone Number");
    JLabel l3 = new JLabel("Username");
    JLabel l4 = new JLabel("Password");
    JLabel l5 = new JLabel("Confirm Password");
    public SignUp() {
        setLocation(0, 0);
        setVisible(true);
        setSize(1500, 1000);
        setTitle(" Egyptian League Management System");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(textname);
        add(textphone);
        add(textuser);
        add(textpass);
        add(textpass2);
        add(signup);
        add(cancel);
         j2.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p3.add(j2);
        this.add(p3);
        validate();
        l1.setBounds(550, 250, 130, 30);
        l1.setForeground(Color.white);
        textname.setBounds(640, 250, 250, 30);
        l2.setBounds(550, 300, 130, 30);
        l2.setForeground(Color.white);
        textphone.setBounds(640, 300, 250, 30);
        l3.setBounds(550, 350, 130, 30);
        l3.setForeground(Color.white);
        textuser.setBounds(640, 350, 250, 30);
        l4.setBounds(550, 400, 130, 30);
        l4.setForeground(Color.white);
        textpass.setBounds(640, 400, 250, 30);
        l5.setBounds(510, 450, 130, 30);
        l5.setForeground(Color.white);
        textpass2.setBounds(640, 450, 250, 30);
        setLayout(null);
        signup.setBounds(610, 500, 130, 30);
        cancel.setBounds(790, 500, 130, 30);
         signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == cancel) {
                    setVisible(false);
                }
            }
        });
        signup.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == signup) {
                    if ((textpass.getText().equals(textpass2.getText()))) {
                        a2.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Username Or Password");
                        textuser.setText("");
                        textpass.setText("");
                        textpass2.setText("");
                    }
                }
            }
        });
    }

}
