
package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Player extends JFrame implements ActionListener {
    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
 JButton b1 = new JButton(" AL_AHLY ");
 JButton b2 = new JButton(" ZAMALEK ");
 JButton b3 = new JButton(" PYRAMIDS ");
 JButton b4 = new JButton(" ALEX  UNION ");
 JButton b5 = new JButton(" WADI  DEGLA ");
 JButton b6 = new JButton(" CERAMICA  CLEOPATRA ");
 JButton b7 = new JButton(" ENPPI ");
 JButton b8 = new JButton(" ESMAILI ");
 JButton b9 = new JButton(" ELGOUNA ");
 JButton b10 = new JButton(" SMOUHA ");
 JButton b11 = new JButton(" Exit ");
 public Player  (){}; // this is default constructor
   public void dis(){
    this.setTitle("PLAYERS DETAILS");
 this.setSize(1500,1000);
 this.setLocation(0,4);
 this.setVisible(true);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 add(b6);
 add(b7);
 add(b8);
 add(b9);
 add(b10);
 add(b11);
 
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            this.add(p2);
            validate();
b1.setBounds(600,180,300,30);
b1.setBackground(Color.black);
b1.setForeground(Color.white);
b2.setBounds(600,220,300,30);
b2.setBackground(Color.black);
b2.setForeground(Color.white);
b3.setBounds(600,260,300,30);
b3.setBackground(Color.black);
b3.setForeground(Color.white);
b4.setBounds(600,300,300,30);
b4.setBackground(Color.black);
b4.setForeground(Color.white);
b5.setBounds(600,340,300,30);
b5.setBackground(Color.black);
b5.setForeground(Color.white); 
b6.setBounds(600,380,300,30);
b6.setBackground(Color.black);
b6.setForeground(Color.white);
b7.setBounds(600,420,300,30);
b7.setBackground(Color.black);
b7.setForeground(Color.white);
b8.setBounds(600,460,300,30);
b8.setBackground(Color.black);
b8.setForeground(Color.white);
b9.setBounds(600,500,300,30);
b9.setBackground(Color.black);
b9.setForeground(Color.white);
b10.setBounds(600,540,300,30);
b10.setBackground(Color.black);
b10.setForeground(Color.white);
b11.setBounds(600,580,300,30);
b11.setBackground(Color.black);
b11.setForeground(Color.white);

b1.addActionListener( this);
b2.addActionListener (this);
b3.addActionListener( this);
b4.addActionListener (this);
b5.addActionListener( this);
b6.addActionListener (this);
b7.addActionListener( this);
b8.addActionListener (this);
b9.addActionListener( this);
b10.addActionListener (this);
b11.addActionListener (this);
}
    @Override
   public void actionPerformed(ActionEvent ae) {
   

    // for action the first team
    if(ae.getSource()==b1){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mohammed Al Shinnawy","190 cm ","70 kg", "ALAhly","GK"},{"Yasser Ibrahim","170 cm","67 kg","ALAhly","CB"},
            {"Bader Bannon","160 cm","85 kg","AlAhly","CB"},{"Ali Maaloul","168 cm","70 kg","AlAhly","LB"},
            {"Mohamed Hany","172 cm","70 kg","AlAhly","RB"},{"Amr Alsulia","166 cm","75 kg","AlAhly","DMF"},
            {"Mohamed Magdy Afsha","160 cm","60 kg","AlAhly","RMF"},{"Aliou Diang","179 cm","70 kg","AlAhly","LMF"},
            {"Junior Ajay","170 cm","70 kg","AlAhly","LWF"},{"Hussein Al Shahat","165 cm","80 kg","AlAhly","RWF"},
            {"Marwan Mohsen","177 cm","75 kg","AlAhly","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" AlAhly Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
              j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   //  for action second team
    else if(ae.getSource()==b2){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Muhammad Abu Jabal","180 cm ","80 kg", "AlZamalek","GK"},{"Mahmoud Alaa","170 cm","70 kg","AlZamalek","CB"},
            {"Mahmoud Hamdi Al-Wensh","165 cm","75 kg","AlZamalek","CB"},{"Mohammed Abdul Shafi","160 cm","80 kg","AlZamalek","LB"},
            {"Hazem Emam","150 cm","70 kg","AlZamalek","RB"},{"Tariq Hamid","170 cm","65 kg","AlZamalek","DMF"},
            {"Ferjani Sassi","180 cm","80 kg","AlZamalek","RMF"},{"Ashraf Bachharki","160 cm","70 kg","AlZamalek","LMF"},
            {"Ahmed Syed Zizou","175 cm","70 kg","AlZamalek","LWF"},{"Shikabala","175 cm","70 kg","AlZamalek","RWF"},
            {"Mustafa Mohammed","160 cm","75 kg","AlZamalek","CF"}};
    
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" ZAMALK Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
              j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action the third team
      else if(ae.getSource()==b3){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Sherif Ekramy","177 cm ","80 kg", "Pyramids","GK"},{"Ahmad Sami","160 cm","70 kg","Pyramids","CB"},
            {"Ali Gabr","177 cm","76 kg","Pyramids","CB"},{"Ahmed Ayman Mansour","170 cm","80 kg","Pyramids","LB"},
            {"Ahmad Fathi","169 cm","60 kg","Pyramids","RB"},{"Abdullah Al-Saeed","178 cm","75 kg","Pyramids","DMF"},
            {"Islam Issa","180 cm","80 kg","Pyramids","RMF"},{"Nabil Dunga","160 cm","70 kg","Pyramids","LMF"},
            {"Ramadan Sobhi","165 cm","70 kg","Pyramids","LWF"},{"Eric Traore","179 cm","75 kg","Pyramids","RWF"},
            {"Mahmoud Wadi","180 cm","75 kg","Pyramids","CF"}};
    
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" PYRAMIDS Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
   // for action the fourth team
      else if(ae.getSource()==b4){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mohamed Sobhi","187 cm ","70 kg", "Alex union","GK"},{"Karim El Deeb","166 cm","64 kg","Alex union","CB"},
            {"Mahmoud Rizk","175 cm","65 kg","Alex union","CB"},{"mahmoud Sha'bban","175 cm","70 kg","Alex union","LB"},
            {"Karim Yahya","160 cm","62 kg","Alex union","RB"},{"Hossam Ashour","160 cm","61 kg","Alex union","DMF"},
            {"Ahmed Nabil Manga","174 cm","65 kg","Alex union","RMF"},{"Karim Mamdouh","169 cm","70 kg","Alex union","LMF"},
            {"Abdul Ghani Muhammad","175 cm","60 kg","Alex union","LWF"},{"Ammar Hamdy","175 cm","80 kg","Alex union","RWF"},
            {"Khaled Qamar","170 cm","65 kg","Alex union","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" ALEX UNION  Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action the fifth team
      else if(ae.getSource()==b5){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mohamed Abdel Monsef","180 cm ","79 kg", "Wadi Degla","GK"},{"Mohammed Jamal","170 cm","60 kg","Wadi Degla","CB"},
            {"Khaled Reda","165 cm","75 kg","Wadi Degla","CB"},{"Hussam Arafat","175 cm","65 kg","Wadi Degla","LB"},
            {"Amr Saleh","180 cm","78 kg","Wadi Degla","RB"},{"Mohamed Abdel Ati","170 cm","65 kg","Wadi Degla","DMF"},
            {"Mohammed Hilal","170 cm","67 kg","Wadi Degla","RMF"},{"Amir Adel","160 cm","70 kg","Wadi Degla","LMF"},
            {"Mohammad Redah","169 cm","70 kg","Wadi Degla","LWF"},{"Jorginho Intima","175 cm","80 kg","Wadi Degla","RWF"},
            {"Salah Amin","180 cm","85 kg","Wadi Degla","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" WADI DEGLA Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action sixth team
      else if(ae.getSource()==b6){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mohammed Jamal","180 cm ","74 kg", "Ceramica","GK"},{"Khaled Subhi","166 cm","68 kg","Ceramica","CB"},
            {"Mahmoud Saqr","176 cm","70 kg","Ceramica","CB"},{"Ahmed Mohsen","170 cm","65 kg","Ceramica","LB"},
            {"Rajab Bakkar","168 cm","66 kg","Ceramica","RB"},{"Ashour Al-Adham","160 cm","61 kg","Ceramica","DMF"},
            {"Saleh Jumaa","140 cm","60 kg","Ceramica","RMF"},{"Mido Jaber","177 cm","73 kg","Ceramica","LMF"},
            {"Muhammad Tony","165 cm","70 kg","Ceramica","LWF"},{"Muhammad Massad","175 cm","63 kg","Ceramica","RWF"},
            {"Maxwell Packoh","174 cm","68 kg","Ceramica","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" CERAMICA CLEOPATRA Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action seventh team
      else if(ae.getSource()==b7){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mahmoud Gad","179 cm ","74 kg", "Enppi","GK"},{"Ramy Sabry","174 cm","67 kg","Enppi","CB"},
            {"Ibrahim Al-Qadi","165 cm","61 kg","Enppi","CB"},{"Mahmoud Naeem","170 cm","66 kg","Enppi","LB"},
            {"Abdullah Adel","178 cm","65 kg","Enppi","RB"},{"Salah Rico","169 cm","65 kg","Enppi","DMF"},
            {"Ahmed Al-Agouz","169 cm","63 kg","Enppi","RMF"},{"Karim Tariq","170 cm","70 kg","Enppi","LMF"},
            {"Hamid Mao","168 cm","68 kg","Enppi","LWF"},{"Ziad Kamal","175 cm","70 kg","Enppi","RWF"},
            {"Omar Bassam","170 cm","65 kg","Enppi","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" ENPPI Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action eigthth team
      else if(ae.getSource()==b8){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Mohamed Sobhi","185 cm ","76 kg", "Esmaili","GK"},{"Radwan Sharifi","170 cm","60 kg","Esmaili","CB"},
            {"Baher Al-Mohammadi","175 cm","65 kg","Esmaili","CB"},{"Ayman Ahmed","166 cm","68 kg","Esmaili","LB"},
            {"Mahmoud Al-Badri","160 cm","62 kg","Esmaili","RB"},{"Muhammad sadiq","160 cm","62 kg","Esmaili","DMF"},
            {"Emad Hamdy","170 cm","67 kg","Esmaili","RMF"},{"Mahmoud Donga","177 cm","80 kg","Esmaili","LMF"},
            {"Muhammad al-Shami","175 cm","70 kg","Esmaili","LWF"},{"Muhammad Ammar","176 cm","65 kg","Esmaili","RWF"},
            {"Hazem Morsi","180 cm","75 kg","Esmaili","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" ESMAILI Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
     t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action ninth team
      else if(ae.getSource()==b9){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Ahmed Adel Abdel Moneim","188 cm ","77 kg", "Algouna","GK"},{"Mohamed Naguib","160 cm","65 kg","Algouna","CB"},
            {"Loay Wael","175 cm","70 kg","Algouna","CB"},{"Amr El Saadawi","170 cm","68 kg","Algouna","LB"},
            {"Joseph Nguim","170 cm","65 kg","Algouna","RB"},{"Ziad Al-Jayoushi","180 cm","82 kg","Algouna","DMF"},
            {"Noor mohamed","179 cm","70 kg","Algouna","RMF"},{"Amr Barakat","160 cm","63 kg","Algouna","LMF"},
            {"Mohammad Rajab","175 cm","70 kg","Algouna","LWF"},{"Ahmed hamdy","165 cm","60 kg","Algouna","RWF"},
            {"Walter Bwalia","160 cm","68 kg","Algouna","CF"}};
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" ELGOUNA Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // for action tength team 
      else if(ae.getSource()==b10){
     JFrame f =new JFrame();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    
    String [][] arr={{"Hani Suleiman","190 cm ","85 kg", "Smouha","GK"},{"Ahmed Jamal","160 cm","60 kg","Smouha","CB"},
            {"Mahmoud Ezzat","175 cm","65 kg","Smouha","CB"},{"Rajab Nabeel","150 cm","60 kg","Smouha","LB"},
            {"Ali Ghazal","180 cm","60 kg","Smouha","RB"},{"Ahmed Homs","180 cm","65 kg","Smouha","DMF"},
            {"Mohammed Mohsen","170 cm","60 kg","Smouha","RMF"},{"Muhammad Nadi","170 cm","70 kg","Smouha","LMF"},
            {"Mahmoud Abdel Halim","175 cm","70 kg","Smouha","LWF"},{"Hossam Hassan","165 cm","60 kg","Smouha","RWF"},
            {"Mohammad Talaat","150 cm","65 kg","Smouha","CF"}};
    
    String[]header={"Name","Height","Weight","Team","position"};
  JTable t=new JTable(arr,header);
    
      f.setTitle(" SMOUHA Player Details ");
    f.setSize(1500,1000);
    f.setLocation(0,4);
    f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    t.setBounds(0,270,1350,180);
    t.setBackground(Color.black);
    t.setForeground(Color.white);
    t.setFont(new Font("Tahoma", Font.BOLD, 15));
  f.add(t);
  // for write word Name as label
  f.add(l);
  l.setText("Name");
  l.setFont(new Font(" ",Font.BOLD ,20 ));
  l.setBounds(50,180,100,100);
  l.setForeground(Color.white);
  f.add(l1);
   l1.setText("Height");
   l1.setSize(1000, 1000);
  l1.setFont(new Font(" ",Font.BOLD ,20 ));
  l1.setBounds(350,180,100,100);
  l1.setForeground(Color.white);
   f.add(l2);
   l2.setText("Weight");
  l2.setFont(new Font(" ",Font.BOLD ,20 ));
  l2.setBounds(650,180,100,100);
  l2.setForeground(Color.white);
     f.add(l3);
   l3.setText("Team");
  l3.setFont(new Font(" ",Font.BOLD ,20 ));
  l3.setBounds(950,180,100,100);
  l3.setForeground(Color.white);
    f.add(l4);
   l4.setText("Position");
  l4.setFont(new Font(" ",Font.BOLD ,20 ));
  l4.setBounds(1200,180,100,100);
  l4.setForeground(Color.white);
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
                j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    else if (ae.getSource() == b11) {
            this.setVisible(false);
        }
   }
}
