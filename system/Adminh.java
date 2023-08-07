
package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Adminh extends JFrame {
    JLabel j1=new JLabel();
    JPanel p2 =new JPanel();
    Edplayer editp =new Edplayer();
    Edteam editt =new Edteam();
    Edrefree editr =new Edrefree();
    Edstadium edits=new Edstadium();
    Edmatch editm =new Edmatch();
    JButton b1 = new JButton("Edit Match Details");
    JButton b2 = new JButton("Edit Team Details");
    JButton b3 = new JButton("Edit Stadium Details");
    JButton b4 = new JButton("Edit Player Details");
    JButton b5 = new JButton("Edit Referee Details");
    JButton b6 = new JButton("Exit");
    public Adminh() {
        setLocation(0, 0);
        setVisible(true);
        setSize(1500, 1000);
        setTitle(" Egyptian League Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
       this.add(p2);
        validate();
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
        b1.setBounds(648, 250, 170, 50);
        b2.setBounds(648, 330, 170, 50);
        b3.setBounds(648, 410, 170, 50);
        b4.setBounds(648, 490, 170, 50);
        b5.setBounds(648, 570, 170, 50);
        b6.setBounds(648, 650, 170, 50);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    editm.setVisible(true);
                }
            }

        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    editt.setVisible(true);
                }
            }

        });
       b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b3) {
                    edits.setVisible(true);
                }
            }

        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b4) {
                    editp.setVisible(true);
                }
            }

        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b5) {
                    editr.setVisible(true);
                }
            }

        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b6) {
                   setVisible(false);
                }
            }

        });
    }
}
           
      
    

