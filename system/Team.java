package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Team extends JFrame implements ActionListener {

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
    JFrame frame1 = new JFrame("AlAhly");;
    JFrame frame2 = new JFrame("ElZamalek");
    JFrame frame3 = new JFrame("ElMasry");
    JFrame frame4 = new JFrame("Enby");
    JFrame frame5 = new JFrame("Wady Degla");
    JFrame frame6 = new JFrame("Btroget");
    JFrame frame7 = new JFrame("ElEsmaeely");
    JFrame frame8 = new JFrame("Tlaea Elgeesh");
    JFrame frame9 = new JFrame("ElGouna");
    JFrame frame10 = new JFrame("Eldakhlya");

    public Team() {
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
    }

    ;
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            String[][] players = {{"Mohammed Elshenawy", " ElEsmaeely"}, {"Waleed Soliman", " ElMasry"}, {"Magdy Afsha", " Wady Degla"}, {"Mohammed Hany", " Haras Elhdod"}, {"Mahmoud Kahraba", " Elentag Elharby"}, {"Amr Elsolya", " Pyramids"}, {"Ali Maalol", " Btroget"}, {"Ramy Rabeaa", " Aletehad Elsakandry"}, {"Saad Sameer", " Eldakhlya"}, {"Marawan Mohsen", " Masr ElMaqassa"}, {"Jonior Agaye", " ElGouna"}};
            String[] title = {"Players", "Matches"};
            JTable table1 = new JTable(players, title);
            JScrollPane f = new JScrollPane(table1);
            table1.setBackground(Color.BLACK);
            table1.setForeground(Color.WHITE);
            frame1.add(f);
            frame1.setLayout(new FlowLayout());
            frame1.setSize(500, 500);
            frame1.setVisible(true);

        } else if (ae.getSource() == button2) {
            String[][] players = {{"Shekabala", " Btroget"}, {"Ahmed Eid", " Eldakhlya"}, {"Mohammed AbdElghany", " Elentag Elharby"}, {"Addullah Goumaa", " Haras Elhdod"}, {"Mahmoud Alaa", " Wady Degla"}, {"Mohammed Awaad", " ElMasry"}, {"Mohammed AboGabal", " Tlaea Elgeesh"}, {"Amr Elsaeed", " ElEsmaeely"}, {"Emam Ashour", " ElMoqawlon Elarab"}, {"Eslam Gaber", " Smooha"}, {"Kareem Bambo", " Enby"}};
            String[] header = {"Players", "Matches"};
            JTable table2 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table2);
            table2.setBackground(Color.BLACK);
            table2.setForeground(Color.WHITE);
            frame2.add(f);
            frame2.setLayout(new FlowLayout());
            frame2.setSize(500, 500);
            frame2.setVisible(true);
        } else if (ae.getSource() == button3) {
            String[][] players = {{"Alaa Atta", " ElGouna"}, {"Omer Kamal", " AlAhly"}, {"Ahmed Masoud", " Btroget"}, {"Essam Tharwat", " Eletehad Elsakandry"}, {"Mohammed Shehata", " Masr ElMaqassa"}, {"Eslam Salah", " Enby"}, {"Mahmoud Hamad", " Tlaea Elgeesh"}, {"Kareem Eleraqy", " Smooha"}, {"Hussin Ragab", " Elngom"}, {"Amr Mousa", " Elmoqawlon Elarab"}, {"Mohammed Gaber", " ElZamalek"}};
            String[] header = {"Players", "Matches"};
            JTable table3 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table3);
            table3.setBackground(Color.BLACK);
            table3.setForeground(Color.WHITE);
            frame3.add(f);
            frame3.setLayout(new FlowLayout());
            frame3.setSize(500, 500);
            frame3.setVisible(true);

        } else if (ae.getSource() == button4) {
            String[][] players = {{"Ahmed Elagooz", " Pyramids"}, {"Amr Hossam", " Eletehad Elsakandry"}, {"Mahmoud Gad", " Btroget"}, {"Ramy Sabry", " AlAhly"}, {"Ebraheem Elqady", " ElGouna"}, {"Ali Fawzy", " Eldakhlya"}, {"Ahmed Saber", " ElEsmaeely"}, {"Ehab Sameer", " Elentac Elharby"}, {"Abdullah Adel", " Haras Elhdod"}, {"Mihammed Rizk", " Wady Degla"}, {"Kareem Tarek", " ElMasry"}};
            String[] header = {"Players", "Matches"};
            JTable table4 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table4);
            table4.setBackground(Color.BLACK);
            table4.setForeground(Color.WHITE);
            frame4.add(f);
            frame4.setLayout(new FlowLayout());
            frame4.setSize(500, 500);
            frame4.setVisible(true);
        } else if (ae.getSource() == button5) {
            String[][] players = {{"Mohammed AbdElmonsef", " Eldakhlys"}, {"Khalid Waleed", " Pyramids"}, {"Ahmed Saeed", " ElMasry"}, {"Mohammed Reda", " ElEsmaeely"}, {"Abdullah Mahmoud", " ElZamalek"}, {"Amr Saleh", " Elmoqawlon Elarab"}, {"Ragab Omran", " Masr ElMaqassa"}, {"Mohammed Helal", " Smooha"}, {"Ramez Medhat", " Tlaea Elgeesh"}, {"Marawan Hamdy", " Enby"}, {"Ahmed Atef", " Elngom"}};
            String[] header = {"Players", "Matches"};
            JTable table5 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table5);
            table5.setBackground(Color.BLACK);
            table5.setForeground(Color.WHITE);
            frame5.add(f);
            frame5.setLayout(new FlowLayout());
            frame5.setSize(500, 500);
            frame5.setVisible(true);
        } else if (ae.getSource() == button6) {
            String[][] players = {{"Mohammed AboElnaga", " ElZamzlek"}, {"Hossam Hassan", " Tlaea Elgeesh"}, {"Ahmed ElSebaey", " Enby"}, {"Ahmed Rabea", " Elngom"}, {"Khalid AbdElraziq", " Masr ElMaqassa"}, {"Eslam Kano", " ElEtehad Elsakandry"}, {"Mahmoud Emad", " ElEntag Elharby"}, {"Sameh Ebraheem", " Pyramids"}, {"Ahmed ElNafrawy", " AlAhly"}, {"Mahmoud Elqutt", " ElGouna"}, {"Ahmed Kamel", " Eldakhlya"}};
            String[] header = {"Players", "Matches"};
            JTable table6 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table6);
            table6.setBackground(Color.BLACK);
            table6.setForeground(Color.WHITE);
            frame6.add(f);
            frame6.setLayout(new FlowLayout());
            frame6.setSize(500, 500);
            frame6.setVisible(true);
        }
        if (ae.getSource() == button7) {
            String[][] players = {{"Mohammed Sobhy", " AlAhly"}, {"Mohammed Magdy", " ElEntag Elharby"}, {"Mohammed Fawzy", " Haras Elhdod"}, {"Kamal Elsayed", " Wady Degla"}, {"Mohammed Hashem", " ElMasry"}, {"Ahmed Ayman", " Pyramids"}, {"Mahmoud ElBadry", " Enby"}, {"Mohammed Nasr", " ElZamalek"}, {"Marawan Sahrawy", " ElMoqawlon Elarab"}, {"Mohammed Sadek", " Smooha"}, {"Emad Hamdy", " Tlaea Elgeesh"}};
            String[] header = {"Players", "Matches"};
            JTable table7 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table7);
            table7.setBackground(Color.BLACK);
            table7.setForeground(Color.WHITE);
            frame7.add(f);
            frame7.setLayout(new FlowLayout());
            frame7.setSize(500, 500);
            frame7.setVisible(true);
        } else if (ae.getSource() == button8) {
            String[][] players = {{"Mohammed Bassam", " Elngom"}, {"Mostafa Mahmoud", " Btroget"}, {"Mohammed Nasef", " AlAhly"}, {"Hussin Elsayed", " ElGouna"}, {"Eslam Gamal", " Eldakhlya"}, {"Ali Elfeel", " ElEntag Elharby"}, {"Mahmoud Atef", " ElZamalek"}, {"Mostafa Gamal", " Haras Elhdod"}, {"Ahmed Sameer", " Wady Segla"}, {"Hossam Yousef", " ElMasry"}, {"Hossam Magdy", " ElEsmaeely"}};
            String[] header = {"Players", "Matches"};
            JTable table8 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table8);
            table8.setBackground(Color.BLACK);
            table8.setForeground(Color.WHITE);
            frame8.add(f);
            frame8.setLayout(new FlowLayout());
            frame8.setSize(500, 500);
            frame8.setVisible(true);
        } else if (ae.getSource() == button9) {
            String[][] players = {{"Ahmed Adel", " ElMasry"}, {"Eslam Tarek", " ElMoqawlon Elarab"}, {"Loay Wael", " Smooha"}, {"Mahmoud Elgazar", " Tlaea Elgeesh"}, {"Nour Elsayed", " Enby"}, {"Amr Barakat", " Elngom"}, {"Ahmed Hamdy", " Pyramyds"}, {"Amr AbdElfatah", " Masr ElMaqassa"}, {"Ahmed Amer", " ElEtehad Elsakandry"}, {"Abdo Samy", " Btroget"}, {"Mohammed RAgab", " AlAhly"}};
            String[] header = {"Players", "Matches"};
            JTable table9 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table9);
            table9.setBackground(Color.BLACK);
            table9.setForeground(Color.WHITE);
            frame9.add(f);
            frame9.setLayout(new FlowLayout());
            frame9.setSize(500, 500);
            frame9.setVisible(true);

        } else if (ae.getSource() == button10) {
            String[][] players = {{"Ahmed Saad", " Wady Degla"}, {"Rashad Farouk", " ElZamalek"}, {"Sameer Fekry", " ElMoqawlon Elarab"}, {"Mahmoud Elsayed", " Smooha"}, {"Mostafa Hegab", " Tlaea Elgeesh"}, {"Ahmed Ashraf", " Enby"}, {"Saeed Morad", " AlAhly"}, {"Ahmed Abdullah", " Elngom"}, {"John Lennon", " Masr ElMaqassa"}, {"Mohammed Ebraheem", " ElEtehad Elsakandry"}, {"Mohammed Elfeel", " Btroget"}};
            String[] header = {"Players", "Matches"};
            JTable table10 = new JTable(players, header);
            JScrollPane f = new JScrollPane(table10);
            table10.setBackground(Color.BLACK);
            table10.setForeground(Color.WHITE);
            frame10.add(f);
            frame10.setLayout(new FlowLayout());
            frame10.setSize(500, 500);
            frame10.setVisible(true);

        } else if (ae.getSource() == button11) {
            setVisible(false);
        }
    }

}
