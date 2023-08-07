package egyptian.league.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EgyptionLeagueDetails extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JFrame frame1;
    JFrame frame2;
    JFrame frame3;

    public EgyptionLeagueDetails() {

        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Date");
        button2 = new JButton("List Of Teams");
        button3 = new JButton("List Of Matches");
        button4 = new JButton("Exit");
        button1.setBackground(Color.black);
        button2.setBackground(Color.black);
        button3.setBackground(Color.black);
        button4.setBackground(Color.black);
        button1.setForeground(Color.WHITE);
        button2.setForeground(Color.WHITE);
        button3.setForeground(Color.WHITE);
        button4.setForeground(Color.WHITE);
        
        button1.setBounds(600, 180, 300, 30);
        button2.setBounds(600, 230, 300, 30);
        button3.setBounds(600, 280, 300, 30);
        button4.setBounds(600, 330, 300, 30);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
        p2.add(j1);
        this.add(p2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            frame1 = new JFrame("Starting date and ending date");
            String[][] dates = {{"11 December 2020", "7 June 2021"}};
            String[] header = {"Starting Date", "Ending Date"};
            JTable table1 = new JTable(dates, header);
            JScrollPane s = new JScrollPane(table1);
            table1.setBackground(Color.BLACK);
            table1.setForeground(Color.WHITE);
            frame1.add(s);
            frame1.setSize(500, 500);
            frame1.setLayout(new FlowLayout());
            frame1.setLocation(500, 500);
            frame1.setVisible(true);

        }
        else if (ae.getSource() == button2) {
            frame2 = new JFrame("List Of Teams");
            String[][] teams = {{"1", "AlAhly"}, {"2", "Elzamzlek"}, {"3", "Pyramids"}, {"4", "ElMasry"}, {"5", "ElMoqawlon Elarab"}, {"6", "Masr Elmaqassa"}, {"7", "ElEsaeely"}, {"8", "Tlaea Elgeesh"}, {"9", "Enby"}, {"10", "Wady Degla"}, {"11", "Eletehad Elsakandary"}, {"12", "Haras Elhdod"}, {"13", "Elentag Elharby"}, {"14", "Smooha"}, {"15", "ElGouna"}, {"16", "Btroget"}, {"17", "Eldakhlya"}, {"18", "Elngom"}};
            String[] title = {"Sequence", "List of teams"};
            JTable table2 = new JTable(teams, title);
            JScrollPane d = new JScrollPane(table2);
            table2.setBackground(Color.BLACK);
            table2.setForeground(Color.WHITE);
            frame2.add(d);
            frame2.setSize(500, 500);
            frame2.setLayout(new FlowLayout());
            frame2.setLocation(500, 500);
            frame2.setVisible(true);
        }
        else if (ae.getSource() == button3) {
            frame3 = new JFrame("List Of Matches");
            String[][] matches = {{"1", "ElMoqawlon Elarab", "Aletehad Elsakandry"}, {"2", "AlAhly", "ElMasry"}, {"3", "Enby", "Smooha"}, {"4", "AlAhly", "Haras Elhdod"}, {"5", "Pyramids", "Smooha"}, {"6", "Enby", "ElEsaeely"}, {"7", "Wady Degla", "Elngom"}, {"8", "ElZamalek", "ElMoqawlon Elarab"}, {"9", "AlAhly", "Btroget"}, {"10", "Haras Elhdod", "Tlaea Elgeesh"}, {"11", "Masr Elmaqassa", "AlAhly"}, {"12", "ElGouna", "Enby"}, {"13", "Smooha", "Eldakhlya"}, {"14", "Alentag Alharby", "ElZamalek"}, {"15", "Haras Elhdod", "ElMasry"}, {"16", "Btroget", "Smooha"}, {"17", "Enby", "Elngom"}, {"18", "AlAhly", "ElEsaeely"}, {"19", "ElGouna", "Wady Degla"}, {"20", "Pyramids", "Tlaea Elgeesh"}, {"21", "AlEtehad Elsakandry", "ElMasry"}, {"22", "ElGouna", "Eldakhlya"}, {"23", "AlAhly", "Eldakhlya"}, {"24", "Haras Elhdod", "Masr Elmaqassa"}, {"25", "Btroget", "ElGouna"}, {"26", "Pyramids", "ElZamalek"}, {"27", "ElMasry", "ElMoqawlon Elarab"}, {"28", "Alentag Elharby", "Tlaea Elgeesh"}, {"29", "AlAhly", "Elngom"}, {"30", "Pyramids", "ElMasry"}, {"31", "Elngom", "Eletehad Elsakandary"}, {"32", "ElMasry", "Haras Elhdod"}, {"33", "Smooha", "Btroget"}, {"34", "ElGouna", "ElEsaeely"}};
            String[] address = {"Week", "First Team", "Second Team"};
            JTable table3 = new JTable(matches, address);
            JScrollPane f = new JScrollPane(table3);
              table3.setBackground(Color.BLACK);
            table3.setForeground(Color.WHITE);
            frame3.add(f);
            frame3.setSize(500, 500);
            frame3.setLayout(new FlowLayout());
            frame3.setLocation(500, 500);
            frame3.setVisible(true);

        }
         else if (ae.getSource() == button4) {
            setVisible(false);
        }

    }

}
