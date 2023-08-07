package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Edplayer extends JFrame {

    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JTable t = new JTable();
    JFrame frame1 = new JFrame("AlAhly");
    JFrame frame2 = new JFrame("ElZamalek");
    JFrame frame3 = new JFrame("ElMasry");
    JFrame frame4 = new JFrame("Enby");
    JFrame frame5 = new JFrame("Wady Degla");
    JFrame frame6 = new JFrame("Btroget");
    JFrame frame7 = new JFrame("ElEsmaeely");
    JFrame frame8 = new JFrame("Tlaea Elgeesh");
    JFrame frame9 = new JFrame("ElGouna");
    JFrame frame10 = new JFrame("Eldakhlya");

    public Edplayer() {
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Player Edit");
        button1 = new JButton("AlAhly");
        button2 = new JButton("ElZamalek");
        button3 = new JButton("ElMasry");
        button4 = new JButton("Enby");
        button5 = new JButton("Wady Degla");
        button6 = new JButton("Btroget");
        button7 = new JButton("ElEsmaeely");
        button8 = new JButton("Tlaea Elgeesh");
        button9 = new JButton("ElGouna");
        button10 = new JButton("Eldakhlya");
        button11 = new JButton(" Exit ");

        button1.setBackground(Color.black);
        button2.setBackground(Color.black);
        button3.setBackground(Color.black);
        button4.setBackground(Color.black);
        button5.setBackground(Color.black);
        button6.setBackground(Color.black);
        button7.setBackground(Color.black);
        button8.setBackground(Color.black);
        button9.setBackground(Color.black);
        button10.setBackground(Color.black);
        button11.setBackground(Color.black);

        button1.setForeground(Color.WHITE);
        button2.setForeground(Color.WHITE);
        button3.setForeground(Color.WHITE);
        button4.setForeground(Color.WHITE);
        button5.setForeground(Color.WHITE);
        button6.setForeground(Color.WHITE);
        button7.setForeground(Color.WHITE);
        button8.setForeground(Color.WHITE);
        button9.setForeground(Color.WHITE);
        button10.setForeground(Color.WHITE);
        button11.setForeground(Color.WHITE);
        button1.setBounds(600, 180, 300, 30);
        button2.setBounds(600, 230, 300, 30);
        button3.setBounds(600, 280, 300, 30);
        button4.setBounds(600, 330, 300, 30);
        button5.setBounds(600, 380, 300, 30);
        button6.setBounds(600, 430, 300, 30);
        button7.setBounds(600, 480, 300, 30);
        button8.setBounds(600, 530, 300, 30);
        button9.setBounds(600, 580, 300, 30);
        button10.setBounds(600, 630, 300, 30);
        button11.setBounds(600, 680, 300, 30);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        validate();
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button1) {
                    Object[][] players = {{"Mohammed Elshenawy", " ElEsmaeely"}, {"Waleed Soliman", " ElMasry"}, {"Magdy Afsha", " Wady Degla"}, {"Mohammed Hany", " Haras Elhdod"}, {"Mahmoud Kahraba", " Elentag Elharby"}, {"Amr Elsolya", " Pyramids"}, {"Ali Maalol", " Btroget"}, {"Ramy Rabeaa", " Aletehad Elsakandry"}, {"Saad Sameer", " Eldakhlya"}, {"Marawan Mohsen", " Masr ElMaqassa"}, {"Jonior Agaye", " ElGouna"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button2) {
                    Object[][] players = {{"Shekabala", " Btroget"}, {"Ahmed Eid", " Eldakhlya"}, {"Mohammed AbdElghany", " Elentag Elharby"}, {"Addullah Goumaa", " Haras Elhdod"}, {"Mahmoud Alaa", " Wady Degla"}, {"Mohammed Awaad", " ElMasry"}, {"Mohammed AboGabal", " Tlaea Elgeesh"}, {"Amr Elsaeed", " ElEsmaeely"}, {"Emam Ashour", " ElMoqawlon Elarab"}, {"Eslam Gaber", " Smooha"}, {"Kareem Bambo", " Enby"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button3) {
                    Object[][] players = {{"Alaa Atta", " ElGouna"}, {"Omer Kamal", " AlAhly"}, {"Ahmed Masoud", " Btroget"}, {"Essam Tharwat", " Eletehad Elsakandry"}, {"Mohammed Shehata", " Masr ElMaqassa"}, {"Eslam Salah", " Enby"}, {"Mahmoud Hamad", " Tlaea Elgeesh"}, {"Kareem Eleraqy", " Smooha"}, {"Hussin Ragab", " Elngom"}, {"Amr Mousa", " Elmoqawlon Elarab"}, {"Mohammed Gaber", " ElZamalek"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button4) {
                    Object[][] players = {{"Ahmed Elagooz", " Pyramids"}, {"Amr Hossam", " Eletehad Elsakandry"}, {"Mahmoud Gad", " Btroget"}, {"Ramy Sabry", " AlAhly"}, {"Ebraheem Elqady", " ElGouna"}, {"Ali Fawzy", " Eldakhlya"}, {"Ahmed Saber", " ElEsmaeely"}, {"Ehab Sameer", " Elentac Elharby"}, {"Abdullah Adel", " Haras Elhdod"}, {"Mihammed Rizk", " Wady Degla"}, {"Kareem Tarek", " ElMasry"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button5) {
                    Object[][] players = {{"Mohammed AbdElmonsef", " Eldakhlys"}, {"Khalid Waleed", " Pyramids"}, {"Ahmed Saeed", " ElMasry"}, {"Mohammed Reda", " ElEsmaeely"}, {"Abdullah Mahmoud", " ElZamalek"}, {"Amr Saleh", " Elmoqawlon Elarab"}, {"Ragab Omran", " Masr ElMaqassa"}, {"Mohammed Helal", " Smooha"}, {"Ramez Medhat", " Tlaea Elgeesh"}, {"Marawan Hamdy", " Enby"}, {"Ahmed Atef", " Elngom"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button6) {
                    Object[][] players = {{"Mohammed AboElnaga", " ElZamzlek"}, {"Hossam Hassan", " Tlaea Elgeesh"}, {"Ahmed ElSebaey", " Enby"}, {"Ahmed Rabea", " Elngom"}, {"Khalid AbdElraziq", " Masr ElMaqassa"}, {"Eslam Kano", " ElEtehad Elsakandry"}, {"Mahmoud Emad", " ElEntag Elharby"}, {"Sameh Ebraheem", " Pyramids"}, {"Ahmed ElNafrawy", " AlAhly"}, {"Mahmoud Elqutt", " ElGouna"}, {"Ahmed Kamel", " Eldakhlya"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button7) {
                    Object[][] players = {{"Mohammed Sobhy", " AlAhly"}, {"Mohammed Magdy", " ElEntag Elharby"}, {"Mohammed Fawzy", " Haras Elhdod"}, {"Kamal Elsayed", " Wady Degla"}, {"Mohammed Hashem", " ElMasry"}, {"Ahmed Ayman", " Pyramids"}, {"Mahmoud ElBadry", " Enby"}, {"Mohammed Nasr", " ElZamalek"}, {"Marawan Sahrawy", " ElMoqawlon Elarab"}, {"Mohammed Sadek", " Smooha"}, {"Emad Hamdy", " Tlaea Elgeesh"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button8) {
                    Object[][] players = {{"Mohammed Bassam", " Elngom"}, {"Mostafa Mahmoud", " Btroget"}, {"Mohammed Nasef", " AlAhly"}, {"Hussin Elsayed", " ElGouna"}, {"Eslam Gamal", " Eldakhlya"}, {"Ali Elfeel", " ElEntag Elharby"}, {"Mahmoud Atef", " ElZamalek"}, {"Mostafa Gamal", " Haras Elhdod"}, {"Ahmed Sameer", " Wady Segla"}, {"Hossam Yousef", " ElMasry"}, {"Hossam Magdy", " ElEsmaeely"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button9) {
                    Object[][] players = {{"Ahmed Adel", " ElMasry"}, {"Eslam Tarek", " ElMoqawlon Elarab"}, {"Loay Wael", " Smooha"}, {"Mahmoud Elgazar", " Tlaea Elgeesh"}, {"Nour Elsayed", " Enby"}, {"Amr Barakat", " Elngom"}, {"Ahmed Hamdy", " Pyramyds"}, {"Amr AbdElfatah", " Masr ElMaqassa"}, {"Ahmed Amer", " ElEtehad Elsakandry"}, {"Abdo Samy", " Btroget"}, {"Mohammed RAgab", " AlAhly"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button10) {
                    Object[][] players = {{"Ahmed Saad", " Wady Degla"}, {"Rashad Farouk", " ElZamalek"}, {"Sameer Fekry", " ElMoqawlon Elarab"}, {"Mahmoud Elsayed", " Smooha"}, {"Mostafa Hegab", " Tlaea Elgeesh"}, {"Ahmed Ashraf", " Enby"}, {"Saeed Morad", " AlAhly"}, {"Ahmed Abdullah", " Elngom"}, {"John Lennon", " Masr ElMaqassa"}, {"Mohammed Ebraheem", " ElEtehad Elsakandry"}, {"Mohammed Elfeel", " Btroget"}};
                    String[] title = {"Players", "Matches"};
                    DefaultTableModel m = new DefaultTableModel(players, title);
                    t = new JTable(m);
                    t.setBackground(Color.black);
                    t.setForeground(Color.white);
                    JTextField name = new JTextField();
                    JTextField matches = new JTextField();
                    JButton add = new JButton("Add");
                    JButton edit = new JButton("Edit");
                    JButton dlt = new JButton("Delete");
                    name.setBounds(290, 260, 150, 25);
                    matches.setBounds(100, 260, 150, 25);
                    add.setBounds(450, 260, 100, 25);
                    add.setBackground(Color.BLACK);
                    add.setForeground(Color.WHITE);
                    t.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            int i = t.getSelectedRow();
                            matches.setText(m.getValueAt(i, 0).toString());
                            name.setText(m.getValueAt(i, 1).toString());
                        }
                    });
                    Object[] row = new Object[2];
                    add.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            if (ae.getSource() == add) {
                                row[0] = name.getText();
                                row[1] = matches.getText();
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
                                m.setValueAt(matches.getText(), i, 0);
                                m.setValueAt(name.getText(), i, 1);
                            }
                        }
                    });
                    edit.setBounds(450, 300, 100, 25);
                    edit.setBackground(Color.BLACK);
                    edit.setForeground(Color.WHITE);
                    dlt.setBounds(450, 340, 100, 25);
                    dlt.setBackground(Color.BLACK);
                    dlt.setForeground(Color.WHITE);
                    JScrollPane p = new JScrollPane(t);
                    p.setBounds(100, 0, 880, 200);
                    frame1.setSize(1500, 1000);
                    frame1.setLayout(null);
                    frame1.setVisible(true);
                    frame1.add(p);
                    frame1.add(name);
                    frame1.add(matches);
                    frame1.add(add);
                    frame1.add(edit);
                    frame1.add(dlt);
                    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
                    p2.add(j1);
                    frame1.add(p2);
                }
            }

        });
        button11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button11) {
                    setVisible(false);
                }
            }

        });
    }
}
