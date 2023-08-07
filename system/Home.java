package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame {
    EgyptionLeagueDetails l=new EgyptionLeagueDetails();
    Admin a = new Admin();
    Match m=new Match();
    Referee r=new Referee();
    Rstadium s=new Rstadium();
    Player p=new Player();
    Team t=new Team();
    TeamHeadCoach c=new TeamHeadCoach();
    SignUp si=new SignUp();
    Adminh h=new Adminh();
    JLabel j1=new JLabel();
    JPanel p2 =new JPanel();
    JButton b1 = new JButton("Admin Page");
    JButton b2 = new JButton("League Details");
    JButton b3 = new JButton("Match Details");
    JButton b4 = new JButton("Team Details");
    JButton b5 = new JButton("Stadium Details");
    JButton b6 = new JButton("Player Details");
    JButton b7 = new JButton("Referee Details");
    JButton b8 = new JButton("Coach Details");
    public void Display() {
        setLocation(0, 0);
        setVisible(true);
        setSize(1500, 1000);
        setTitle(" Egyptian League Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b8.setBackground(Color.black);
        b8.setForeground(Color.white);
        b1.setBounds(648, 220, 170, 50);
        b2.setBounds(648, 300, 170, 50);
        b3.setBounds(648, 370, 170, 50);
        b4.setBounds(648, 460, 170, 50);
        b5.setBounds(648, 540, 170, 50);
        b6.setBounds(648, 620, 170, 50);
        b7.setBounds(648, 700, 170, 50);
        b8.setBounds(648, 770, 170, 50);
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
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    a.setVisible(true);
                }
            }

        });
         b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    l.setVisible(true);
                }
            }

        });
         b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b3) {
                    m.display();
                }
            }

        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b5) {
                    s.setVisible(true);
                }
            }

        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b6) {
                    p.dis();
                }
            }

        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b4) {
                    t.setVisible(true);
                }
            }

        });
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b8) {
                    c.setVisible(true);
                }
            }

        });
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b7) {
                    r.dis();
                }
            }

        });
    }
}
