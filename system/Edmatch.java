package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Edmatch extends JFrame {

    JButton button1;
    JButton button2;
    JFrame f = new JFrame();
    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JTable t = new JTable();

    public Edmatch() {
        setSize(1500, 1000);
        button1 = new JButton("ADD / Delet / EDIT");
        button2 = new JButton("Exit");
        button1.setBackground(Color.black);
        button1.setForeground(Color.WHITE);
        button2.setBackground(Color.black);
        button2.setForeground(Color.WHITE);
        button1.setBounds(600, 330, 300, 30);
        button2.setBounds(600, 380, 300, 30);
        add(button1);
        add(button2);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        validate();
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button1) {
                    Object[][] match = {{"1", "ElMoqawlon Elarab", "Aletehad Elsakandry"}, {"2", "AlAhly", "ElMasry"}, {"3", "Enby", "Smooha"}, {"4", "AlAhly", "Haras Elhdod"}, {"5", "Pyramids", "Smooha"}, {"6", "Enby", "ElEsaeely"}, {"7", "Wady Degla", "Elngom"}, {"8", "ElZamalek", "ElMoqawlon Elarab"}, {"9", "AlAhly", "Btroget"}, {"10", "Haras Elhdod", "Tlaea Elgeesh"}, {"11", "Masr Elmaqassa", "AlAhly"}, {"12", "ElGouna", "Enby"}, {"13", "Smooha", "Eldakhlya"}, {"14", "Alentag Alharby", "ElZamalek"}, {"15", "Haras Elhdod", "ElMasry"}, {"16", "Btroget", "Smooha"}, {"17", "Enby", "Elngom"}, {"18", "AlAhly", "ElEsaeely"}, {"19", "ElGouna", "Wady Degla"}, {"20", "Pyramids", "Tlaea Elgeesh"}, {"21", "AlEtehad Elsakandry", "ElMasry"}, {"22", "ElGouna", "Eldakhlya"}, {"23", "AlAhly", "Eldakhlya"}, {"24", "Haras Elhdod", "Masr Elmaqassa"}, {"25", "Btroget", "ElGouna"}, {"26", "Pyramids", "ElZamalek"}, {"27", "ElMasry", "ElMoqawlon Elarab"}, {"28", "Alentag Elharby", "Tlaea Elgeesh"}, {"29", "AlAhly", "Elngom"}, {"30", "Pyramids", "ElMasry"}, {"31", "Elngom", "Eletehad Elsakandary"}, {"32", "ElMasry", "Haras Elhdod"}, {"33", "Smooha", "Btroget"}, {"34", "ElGouna", "ElEsaeely"}};
                    String[] address = {"Week", "First Team", "Second Team"};
                    f.setLocation(0, 4);
                    f.setTitle("Edit Matches");

                    DefaultTableModel m = new DefaultTableModel(match, address);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField team1 = new JTextField();
                    JTextField team2 = new JTextField();
                    JTextField week = new JTextField();
                    JLabel l1 = new JLabel("First Team");
                    JLabel l2 = new JLabel("Second Team");
                    JLabel l3 = new JLabel("Week");
                    l1.setForeground(Color.WHITE);l2.setForeground(Color.WHITE);l3.setForeground(Color.WHITE);
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            week.setText(m.getValueAt(i, 0).toString());
                            team1.setText(m.getValueAt(i, 1).toString());
                            team2.setText(m.getValueAt(i, 2).toString());
                        }
                    });
                    Object[] row = new Object[3];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = week.getText();
                                row[1] = team1.getText();
                                row[2] = team2.getText();
                                m.addRow(row);
                            }
                        }
                    });
                    dlt.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == dlt) {
                                int i = t.getSelectedRow();
                                if (i > 0) {
                                    m.removeRow(i);
                                }
                            }
                        }
                    });
                    edit.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == edit) {
                                int i = t.getSelectedRow();
                                m.setValueAt(week.getText(), i, 0);
                                m.setValueAt(team2.getText(), i, 1);
                                m.setValueAt(team1.getText(), i, 1);
                            }
                        }
                    });
                    l1.setBounds(210, 260, 110, 25);
                    l2.setBounds(210, 300, 110, 25);
                    l3.setBounds(210, 340, 110, 25);
                    team1.setBounds(290, 260, 110, 25);
                    team2.setBounds(290, 300, 110, 25);
                    week.setBounds(290, 340, 110, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    f.setSize(1500, 1000);
                    f.setLayout(null);
                    f.setVisible(true);
                    f.add(p);
                    f.add(l1);
                    f.add(l2);
                    f.add(l3);
                    f.add(team1);
                    f.add(team2);
                    f.add(week);
                    f.add(add);
                    f.add(edit);
                    f.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    f.add(p2);
                }
            }

        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button2) {
                   setVisible(false);
                }
            }

        });
    }
}
