package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rstadium extends JFrame implements ActionListener {

    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JFrame f = new JFrame();
    JTextField t = new JTextField();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    JTextField t8 = new JTextField();
    JButton b1 = new JButton(" Burj Al Arab stadium ");
    JButton b2 = new JButton(" Cairo stadium ");
    JButton b3 = new JButton(" Suez stadium ");
    JButton b4 = new JButton(" Al Salam stadium ");
    JButton b5 = new JButton(" Haras Alhudud stadium ");
    JButton b6 = new JButton(" Aswan Stadium ");
    JButton b7 = new JButton(" Btrusport Stadium ");
    JButton b8 = new JButton(" Alguna stadium ");
    JButton b9 = new JButton(" Exit ");

    public Rstadium() {
        this.setTitle("Egyptian League Management System");
        this.setSize(1500, 1000);
        this.setLocation(0, 4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b9);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        validate();
        b1.setBounds(600, 180, 300, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setBounds(600, 230, 300, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b3.setBounds(600, 280, 300, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b4.setBounds(600, 330, 300, 30);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b5.setBounds(600, 380, 300, 30);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b6.setBounds(600, 430, 300, 30);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b7.setBounds(600, 480, 300, 30);
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b8.setBounds(600, 530, 300, 30);
        b8.setBackground(Color.black);
        b8.setForeground(Color.white);
        b9.setBounds(600, 530, 300, 30);
        b9.setBackground(Color.black);
        b9.setForeground(Color.white);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

    }

    ;
  
   @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("  Burj Al Arab stadium");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("               Alexandria");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                86.000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       ALAhly  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Ceramica  vs  ALex union");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Pyramids  vs  Wadi Degla");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText(" Zamalek  vs  Wadi Degla");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Enpi  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("        ALAhly  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
            f.setTitle(" Burj Al Arab Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b2) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          Cairo stadium");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                  Cairo          ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  75,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Pyramids  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  ALex union");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Wadi Degla");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    Zamalek  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("        ALAhly  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Cairo Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b3) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("  Suez stadium  ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                  Suez         ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  45,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Ceramica  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    ALAhly  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Pyramids  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Suez Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b4) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          AL Salam Stadium ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                 Cairo         ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  30,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Ceramica  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       ALAhly  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("      Zamalek  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    ALAhly  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("            Smouha  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Pyramids  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" AL Salam Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b5) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          Haras ALhudud  Stadium ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                 Alexandria         ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  22,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       ALAhly  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Zamalek  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("     Enpi  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    Smouha  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("        Pyramids  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Esmaili  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Haras ALhudud Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b6) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          Aswan  Stadium ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                Aswan         ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  20,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Pyramids  vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Enpi  vs  Wadi Degla");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("     Aswan  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("    Petrojet  vs  Ceramica");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("        Ahly bank  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Esmaili  vs  Zamalek");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Aswan Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b7) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          BtruSport  Stadium ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                Cairo        ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  16,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Enpi vs  ALmasry");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Alahly bank  vs  Ceramica");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("     Aswan  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("      Petrojet  vs  Enpi");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("        Ahly bank  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Esmaili  vs  AlAhly");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" BtruSport Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b8) {
            JLabel l = new JLabel();
            f.add(l);
            l.setText("Stadium name");
            l.setFont(new Font(" ", Font.BOLD, 20));
            l.setBounds(50, 180, 250, 100);
            l.setForeground(Color.white);
            JLabel l1 = new JLabel();
            f.add(l1);
            l1.setText("Stadium Location");
            l1.setFont(new Font(" ", Font.BOLD, 20));
            l1.setBounds(400, 180, 250, 100);
            l1.setForeground(Color.white);
            JLabel l2 = new JLabel();
            f.add(l2);
            l2.setText("Stadium Capacity");
            l2.setFont(new Font(" ", Font.BOLD, 20));
            l2.setBounds(750, 180, 250, 100);
            l2.setForeground(Color.white);
            JLabel l3 = new JLabel();
            f.add(l3);
            l3.setText("Matches");
            l3.setFont(new Font(" ", Font.BOLD, 20));
            l3.setBounds(1150, 180, 250, 100);
            l3.setForeground(Color.white);

            // for text field
            t.setText("          Alguna  Stadium ");
            t.setBounds(25, 280, 200, 30);
            t.setFont(new Font("Tahoma", Font.BOLD, 15));
            t.setBackground(Color.white);
            t.setForeground(Color.black);
            f.add(t);

            t1.setText("                Alguna       ");
            t1.setBounds(380, 280, 200, 30);
            t1.setFont(new Font("Tahoma", Font.BOLD, 15));
            t1.setBackground(Color.black);
            t1.setForeground(Color.white);
            f.add(t1);

            t2.setText("                  12,000");
            t2.setBounds(735, 280, 200, 30);
            t2.setFont(new Font("Tahoma", Font.BOLD, 15));
            t2.setBackground(Color.black);
            t2.setForeground(Color.white);
            f.add(t2);
            t3.setText("       Enpi vs  AlAhly");
            t3.setBounds(1090, 280, 200, 30);
            t3.setFont(new Font("Tahoma", Font.BOLD, 15));
            t3.setBackground(Color.black);
            t3.setForeground(Color.white);
            f.add(t3);
            t4.setText("       Alex union  vs  Ceramica");
            t4.setBounds(1090, 315, 200, 30);
            t4.setFont(new Font("Tahoma", Font.BOLD, 15));
            t4.setBackground(Color.black);
            t4.setForeground(Color.white);
            f.add(t4);
            t5.setText("     Enpi  vs  Smouha");
            t5.setBounds(1090, 350, 200, 30);
            t5.setFont(new Font("Tahoma", Font.BOLD, 15));
            t5.setBackground(Color.black);
            t5.setForeground(Color.white);
            f.add(t5);
            t6.setText("      Zamalek  vs  Enpi");
            t6.setBounds(1090, 385, 200, 30);
            t6.setFont(new Font("Tahoma", Font.BOLD, 15));
            t6.setBackground(Color.black);
            t6.setForeground(Color.white);
            f.add(t6);
            t7.setText("      Wadi degla  vs  Esmaili");
            t7.setBounds(1090, 420, 200, 30);
            t7.setFont(new Font("Tahoma", Font.BOLD, 15));
            t7.setBackground(Color.black);
            t7.setForeground(Color.white);
            f.add(t7);
            t8.setText("       Zamalek  vs  AlAhly");
            t8.setBounds(1090, 455, 200, 30);
            t8.setFont(new Font("Tahoma", Font.BOLD, 15));
            t8.setBackground(Color.black);
            t8.setForeground(Color.white);
            f.add(t8);
            JButton back = new JButton("Back");
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.setBounds(578, 655, 200, 30);
            f.add(back);
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource() == back) {
                        f.setVisible(false);
                    }
                }
            });
            // for make a frame
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            f.setTitle(" Alguna Stadium Details ");
            f.setSize(1500, 1000);
            f.setLocation(0, 4);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (ae.getSource() == b9) {
            this.setVisible(false);
        }
    }
;
}
