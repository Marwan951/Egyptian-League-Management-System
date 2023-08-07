package egyptian.league.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeamHeadCoach extends JFrame {

    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton("Exit");

    public TeamHeadCoach() {
        b1.setBounds(620, 400, 200, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] information = {{"Pisto Mosimane", "South Africa", "AlAhly", "160cm", "68kg"}, {"Tarek Yehia", "Egyption", "ElZamalek", "171cm", "70kg"}, {"Ali Maher", "Egyption", "Enby", "169cm", "63kg"}, {"Ehab Galal", "Egyption", "ElMasry", "159cm", "70kg"}, {"Emad Elnahas", "Egyption", "ElMoqawlon Elarab", "160cm", "66kg"}, {"Disaber", "French", "Pyramids", "169cm", "70kg"}, {"Mahmoud Gaber", "Egyption", "ElEsmaeely", "170cm", "60kg"}, {"Sergyo Farias", "Brazilian", "Tlaea Elgeesh", "163cm", "80kg"}, {"Mokhtar Mokhtar", "Egyption", "ElEntag Elharby", "157cm", "60kg"}, {"Ahmed Hossam Mido", "Egyption", "Masr ElMaqassa", "180cm", "70kg"}, {"Talaat Yousef", "Egyption", "ElEtehad Elsakandry", "167cm", "69kg"}, {"Taksis Gonias", "Greek", "Wady Degla", "170cm", "77kg"}, {"Tarek Elashry", "Egyption", "Haras Elhdod", "158cm", "60kg"}, {"Hossam Hassan", "Egyption", "Smooha", "170cm", "70kg"}, {"Reda Shehata", "Egyption", "ElGouna", "178cm", "69kg"}, {"Antonio Calderon", "Spanish", "Elngom", "175cm", "77kg"}, {"Alaa AbdElaal", "Egyption", "Btroget", "178cm", "80kg"}, {"Diaa AbdElsamad", "Egyption", "Eldakhlya", "176cm", "69kg"}};
        String[] header = {"Name", "Nationality", "Team Name", "Hight", "Weight"};
        JTable table = new JTable(information, header);
        JScrollPane f = new JScrollPane(table);
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        add(b1);
        add(f);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    setVisible(false);
                }
            }
        });

    }
}
