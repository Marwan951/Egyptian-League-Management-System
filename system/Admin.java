package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends JFrame {

    JLabel j2 = new JLabel();
    JPanel p3 = new JPanel();
    Adminh adminh = new Adminh();
    SignUp s = new SignUp();
    JButton login = new JButton("Log In");
    JButton cancel = new JButton("Cancel");
    JButton signup = new JButton("Sign Up");
    JTextField textn = new JTextField();
    JTextField textp = new JPasswordField();
    JLabel l1 = new JLabel("Username");
    JLabel l2 = new JLabel("Password");

    public Admin() {
        setLocation(0, 0);
        setVisible(true);
        setSize(1500, 1000);
        setTitle(" Egyptian League Management System");
        add(login);
        add(signup);
        add(cancel);
        add(l1);
        add(l2);
        add(textn);
        add(textp);
        j2.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p3.add(j2);
        this.add(p3);
        validate();
        l1.setBounds(450, 200, 130, 30);
        l1.setForeground(Color.white);
        textn.setBounds(600, 200, 250, 30);
        l2.setBounds(450, 250, 130, 30);
        l2.setForeground(Color.white);
        textp.setBounds(600, 250, 250, 30);
        login.setBounds(570, 300, 130, 30);
        cancel.setBounds(735, 300, 130, 30);
        signup.setBounds(650, 350, 130, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == login) {
                    if ((textn.getText().equals("admin")) && (textp.getText().equals("admin"))) {
                        adminh.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Username Or Password");
                        textn.setText("");
                        textp.setText("");
                    }
                }
            }
        });
        signup.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == signup) {
                    s.setVisible(true);
                }
            }
        });
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == cancel) {
                    setVisible(false);
                }
            }
        });

    }

}
