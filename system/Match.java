
package egyptian.league.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class Match extends JFrame implements ActionListener {
    JLabel j1 = new JLabel();
    JPanel p2 = new JPanel();
    JButton n= new JButton("Back");
 JButton b1 = new JButton(" CERAMICA  CLEOPATRA ");
 JButton b2 = new JButton(" ASWAN ");
 JButton b3 = new JButton(" ZAMALEK ");
 JButton b4 = new JButton(" ALEX  UNION ");
 JButton b5 = new JButton(" WADI  DEGLA ");
 JButton b6 = new JButton(" AL_AHLY ");
 JButton b7 = new JButton(" ENPPI ");
 JButton b8 = new JButton(" ESMAILI ");
 JButton b9 = new JButton(" ELGOUNA ");
 JButton b10 = new JButton(" SMOUHA ");
 JButton b11= new JButton(" EGYPTIAN ");
 JButton b12 = new JButton(" MAHALLA  YARN ");
 JButton b13 = new JButton(" PYRAMIDS ");
 JButton b14= new JButton(" VANGUARDS  OF  THE ARMY ");
 JButton b15 = new JButton(" MILITARY  PRODUCTION ");
 JButton b16 = new JButton(" AHLI  BANK ");
 JButton b17= new JButton(" THE  ARAB  CONTRACTORS ");
 JButton b18 = new JButton(" EGYPT  OF  CLEARING "); 
 
 public Match()
{
}
 public void display()
 {
 this.setTitle("  MATCHS DETAILS  ");
 this.setSize(1500,1000);
 this.setLocation(0,4);
 this.setVisible(true);
 
 
 add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);
 add(b15); add(b16);add(b17);add(b18);
  j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            this.add(p2);
            validate();
b1.setBounds(650,165,200,30);b2.setBounds(650,200,200,30);b3.setBounds(650,235,200,30);b4.setBounds(650,270,200,30);b5.setBounds(650,305,200,30);
b6.setBounds(650,340,200,30);b7.setBounds(650,375,200,30);b8.setBounds(650,410,200,30);b9.setBounds(650,445,200,30);b10.setBounds(650,480,200,30);
b11.setBounds(650,515,200,30);b12.setBounds(650,550,200,30);b13.setBounds(650,585,200,30);b14.setBounds(650,620,200,30); b15.setBounds(650,655,200,30);
b16.setBounds(650,690,200,30);b17.setBounds(650,725,200,30);b18.setBounds(650,760,200,30);
b1.setBackground(Color.BLACK);b1.setForeground(Color.WHITE);b2.setBackground(Color.BLACK);b2.setForeground(Color.WHITE);
b3.setBackground(Color.BLACK);b3.setForeground(Color.WHITE);b4.setBackground(Color.BLACK);b4.setForeground(Color.WHITE);
b5.setBackground(Color.BLACK);b5.setForeground(Color.WHITE);b6.setBackground(Color.BLACK);b6.setForeground(Color.WHITE);
b7.setBackground(Color.BLACK);b7.setForeground(Color.WHITE);b8.setBackground(Color.BLACK);b8.setForeground(Color.WHITE);
b9.setBackground(Color.BLACK);b9.setForeground(Color.WHITE);b10.setBackground(Color.BLACK);b10.setForeground(Color.WHITE);
b11.setBackground(Color.BLACK);b11.setForeground(Color.WHITE);b12.setBackground(Color.BLACK);b12.setForeground(Color.WHITE);
b13.setBackground(Color.BLACK);b13.setForeground(Color.WHITE);b14.setBackground(Color.BLACK);b14.setForeground(Color.WHITE);
b15.setBackground(Color.BLACK);b15.setForeground(Color.WHITE);b16.setBackground(Color.BLACK);b16.setForeground(Color.WHITE);
b17.setBackground(Color.BLACK);b17.setForeground(Color.WHITE);b18.setBackground(Color.BLACK);b18.setForeground(Color.WHITE);

b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);
b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);
b11.addActionListener(this);b12.addActionListener(this);b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
b16.addActionListener(this);b17.addActionListener(this);b18.addActionListener(this);n.addActionListener(this);

 }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==b1)
    {
            JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
        //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField (" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 14:30   16-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 14:30    2-1-21 ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 19:30 11-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 11-12-20 ");
 JTextField t15 = new JTextField(" 17:30 16-12-20 ");
 JTextField t16 = new JTextField(" 17:30 12-1-21");
 JTextField t17 = new JTextField(" -------------------- ");

 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" PETROSPORTS");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" ALEX ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" NEW SUEZ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField("AL-AHLY WE PEACE ");
 JTextField s15 = new JTextField(" NEW SUEZ ");
 JTextField s16 = new JTextField(" THE ARAB CONTACTORS ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f); 
 
 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

    label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" CERAMICA CLEOPATRA  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
    
     //to show buttons
     b1.setBounds(20, 220, 200, 500);
     
    b2.setBounds(350,165,200,30);b3.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b2)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField("17:30 29-10-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField("14:30 11-12-20 ");
 JTextField t7 = new JTextField("17:00 15-10-20 ");
 JTextField t8 = new JTextField("14:30 25-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 21-12-20 ");
 JTextField t11 = new JTextField(" 14:30 14-1-21 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 14-30 16-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 14:30 9-1-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" POLICE UNION ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" PETRO SPORTS ");
 JTextField s7 = new JTextField(" ISMAILIA ");
 JTextField s8 = new JTextField(" RAILROAD ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" RAILROAD ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField("RAILROAD");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" THE ARAB CONTRACTORS");
 
 referre(f);

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

 label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" ASWAN  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
    b2.setBounds(20, 220, 200, 500);
 b1.setBounds(350,165,200,30);b3.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
 b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
 b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
 b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
    f.add(b1);
 f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
 f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    
    else if(ae.getSource()==b3)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 19:30 28-12-20 ");
 JTextField t6 = new JTextField(" 19:30 2-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 19:30 2-1-21 ");
 JTextField t10 = new JTextField(" 19:30 9-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 19:30 17-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 19:30 9-1-21 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" BURJ ALARAB ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" BURJ ALARAB ");
 JTextField s10 = new JTextField(" THE ARMY IN SUEZ ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENSE ");
 JTextField s13 = new JTextField(" THE ARMY IN SUEZ ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" MILITARAY COLLEGE");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f); 

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
 label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" ZAMALEK  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b3.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b4.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
         j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
 
 
 
    } 
    else if(ae.getSource()==b4)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 17:30 29-10-20 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 17:00 11-1-2 ");
 JTextField t6 = new JTextField(" 17:00 27-12-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 15-1-21 ");
 JTextField t9 = new JTextField(" 17:00 18-12-20 ");
 JTextField t10 = new JTextField(" 17:00 7-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 17:00 12-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 17:00 2-1-21 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" POLICE UNION");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE");
 JTextField s6 = new JTextField(" ALEX ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" ALEX ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENSE ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" SPORTS DEVICE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f); 

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
 label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" ALEX UNION  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     b4.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b5.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b3);
    f.add(b1);f.add(b2);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
             j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b5)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 20:00 8-10-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 19:30 1-1-12 ");
 JTextField t6 = new JTextField(" 17:30 8-1-21 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 14-10-20 ");
 JTextField t9 = new JTextField(" 19:30 24-12-20 ");
 JTextField t10 = new JTextField(" 20:00 30-10-20");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 14:30 11-1-21");
 JTextField t13 = new JTextField(" 14:30 15-1-21");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 14:30 12-12-20 ");
 JTextField t16 = new JTextField(" 19:30 16-12-20 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" CAIRO INTERNATIONAL ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" ALAHLE WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ALAHLY WE PEACE  ");
 JTextField s9 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" AIR DEFENCE ");
 JTextField s13 = new JTextField(" SPORTS DEVICE ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f);

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

 
    label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" WADI DEGLA  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     b5.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b6.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
      j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b6)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" 19:30 8-1-21 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 1-1-21 ");
 JTextField t4 = new JTextField(" 17:00 11-1-21 ");
 JTextField t5 = new JTextField(" 19:30 1-1-21 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 19:30 18-12-20 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 5-1-21 ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 13-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" BURJ ALARAB ");
 JTextField s4 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" A;AHLY WE PEACE ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" ALAHLY WE PEACE ");
 
 //referee
referre(f);

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" ALAHLY  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b6.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b7.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b7)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" 14:30 16-1-21");
 JTextField t2= new JTextField(" 14:30 11-12-20 ");
 JTextField t3 = new JTextField(" 19:30 2-1-21 ");
 JTextField t4 = new JTextField(" 17:00 17-12-20 ");
 JTextField t5 = new JTextField(" 17;00 8-1-21 ");
 JTextField t6 = new JTextField(" 20:00 7-1-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 17:00 22-12-20 ");
 JTextField t12 = new JTextField(" -------------------- "); 
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" 20:30 15-10-20 ");
 JTextField t17 = new JTextField(" 14:30 18-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" PETROSPORTS ");
 JTextField s2= new JTextField(" PEYROSPORTS ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" ALEX ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" PETROSPORTS ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s17 = new JTextField(" THE ARAB CONTRACTORS ");
 
 //referee
referre(f);

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

    label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" ENPPI  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4); f.setVisible(true); 
     
     b7.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b8.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
          j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b8)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 29-12-20 ");
 JTextField t3 = new JTextField(" 20:00 10-26-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 21-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 17:00 13-12-0=20 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 17:00 17-12-20 ");
 JTextField t15 = new JTextField(" 19:30 17-12-20 ");
 JTextField t16 = new JTextField(" 17:00 9-1-21 "); 
 JTextField t17 = new JTextField(" 19:30 3-1-21 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" PETROSPORTS ");
 JTextField s3 = new JTextField(" CAIRO INTERNATIONAL ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ISMAILIA ");
 JTextField s15 = new JTextField(" ISMAILIA ");
 JTextField s16 = new JTextField(" ISMAILIA ");
 JTextField s17 = new JTextField(" THE ARAB CLEARING ");
 
 //referee
 referre(f);
 
 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

    label_layout(f,l,l1,l2,l3,l4,l5); 
    f.setTitle(" ESMAILI  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true); 
     
     b8.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b9.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
 
 
    } 
    else if(ae.getSource()==b9)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 25-12-21 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" 17:00 15-1-21 ");
 JTextField t5 = new JTextField(" 17:00 14-10-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 21-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 14:30 17-12-20 ");
 JTextField t11 = new JTextField(" 17:00 9-1-21 ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 11-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 14:30 30-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" KHALED BESHARA ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" KHALED BESHARA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" MILITARY SPORTS APPARATAS");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" KHALED BESHARA ");
 
 //referee
referre(f); 

 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
  
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" ELGOUNA  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b9.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b10.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
 
 
    } 
    else if(ae.getSource()==b10)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" 14:30 2-1-21 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 12-1-21 ");
 JTextField t4 = new JTextField(" -------------------- "); 
 JTextField t5 = new JTextField(" 19:30 24-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19;30 7-1-21 ");
 JTextField t15 = new JTextField(" 17:00 15-1-21 ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" ALEX ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" BURJ ALARAB ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" ALAHLY WE PEACE");
 JTextField s15 = new JTextField(" ALEX");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 referre(f);
 
 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

 label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" SMOUHA  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b10.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b11.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
           j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
     } 
    else if(ae.getSource()==b11)
    {
    JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
     //time&&date
 JTextField t1 = new JTextField(" 19:30 21-12-30 ");
 JTextField t2= new JTextField(" 19:30 16-1-21 ");
 JTextField t3 = new JTextField(" 17:00 17-1-21 " );
 JTextField t4 = new JTextField(" 20:00 30-10-20");
 JTextField t5 = new JTextField( " -------------------- ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" 17:00 13-12-20 ");
 JTextField t8 = new JTextField(" 14:30 17-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 30-12-20 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 26-12-20 ");
 
 //stadium
 JTextField s1 = new JTextField(" BURJ ALARAB");
 JTextField s2= new JTextField(" BURJ ALARAB");
 JTextField s3 = new JTextField(" BURJ ALARAB");
 JTextField s4 = new JTextField(" BURJ ALARAB");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" BURJ ALARAB");
 JTextField s8 = new JTextField(" BURJ ALARAB");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" BURJ ALARAB");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" BURJ ALARAB");
 
 //REFERRE
 referre(f);
 
 t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" EGYPTIAN  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b11.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b12.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
    j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b12)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
     //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new  JTextField(" 14:30 14-1-21 ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 18-12-20 ");
 JTextField t7 = new JTextField(" 17:00 22-12-20 ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 17:00 9-1-21 ");
 JTextField t10 = new JTextField(" 19:30 14-12-20 ");
 JTextField t11 = new JTextField(" 19:30 30-12-20");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 25-12-20 ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" PETROSPORT ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" ALEX ");
 JTextField s11 = new JTextField(" BURJ ALARAB ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f);

  t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" MAHALLA YARN   MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b12.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b13.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
      j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b13)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
     //time&&date
 JTextField t1 = new JTextField(" 19:30 27-12-20 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 17-12-20");
 JTextField t4 = new JTextField(" 17:00 12-12-20 ");
 JTextField t5 = new JTextField(" 14:30 11-1-21 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 17:00 1-1-21 ");
 JTextField t15 = new JTextField(" 14:30 8-1-21 ");
 JTextField t16 = new JTextField(" 17:00 16-1-21");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" AIR DEFENSE ");
 JTextField s4 = new JTextField(" AIR DEFENSE ");
 JTextField s5 = new JTextField(" AIR DEFENSE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" AIR DEFENSE ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" AIR DEFENSE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f);

   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" PYRAMIDS  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b13.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b14.setBounds(350,705,200,30);  b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
     j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b14)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
     //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 16-12-20 ");
 JTextField t3 = new JTextField(" 19:30 9-1-21 ");
 JTextField t4 = new JTextField(" 17:00 2-1-21 ");
 JTextField t5 = new JTextField(" 14:30 15-1-21 ");
 JTextField t6 = new JTextField(" 20:00 31-10-20 ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" -------------------- ");
 JTextField t9 = new JTextField(" 17:00 11-12-20 ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" 17:00 25-12-20 ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" -------------------- ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" 19:30 22-12-20");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" RAILROAD ");
 JTextField s3 = new JTextField(" THE ARMY IN SUEZ");
 JTextField s4 = new JTextField(" SPORTS DEVICE ");
 JTextField s5 = new JTextField(" SPORTS DEVICE ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" -------------------- ");
 JTextField s9 = new JTextField(" MILITARY SPORTS APPARATUS ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" -------------------- ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" SPORTS DEVICE ");
 
 //referee
referre(f);

   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" VANGUARDS OF THE ARMY  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b14.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b15.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b15)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" 19:30 11-12-20");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 15-1-21");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 17:00 17-12-20");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" 19:30 7-1-21 ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:00 1-1-21");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 14:30 12-12-20");
 JTextField t16 = new JTextField(" 17:00 26-12-20");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ISMAILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" ALAHLY WE PEACE " );
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" AIR DEFENSE");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f);

   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
 
    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" MILITARY PRODUCTION  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b15.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b16.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b16)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" 17:00 16-12-20 ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" 14:30 12-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" -------------------- ");
 JTextField t8 = new JTextField(" 19:30 35-12-20 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" 17:00 15-1-21");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 14:30 8-1-21 ");
 JTextField t15 = new JTextField(" 14:30 21-12-20 ");
 JTextField t16 = new JTextField(" 17:00 30-12-20 ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" NEW SUEZ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" POLICE UNION ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" -------------------- ");
 JTextField s8 = new JTextField(" ISMILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" ALEX ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" POLICE UNION ");
 JTextField s15 = new JTextField(" POLICE UNION ");
 JTextField s16 = new JTextField(" POLICE UNION ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
referre(f);

   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);
  
    label_layout(f,l,l1,l2,l3,l4,l5);   
    f.setTitle(" AHLI BANK  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b16.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b17.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
              j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b17)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" -------------------- ");
 JTextField t3 = new JTextField(" 19:30 12-12-20 ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField("19:30 16-12-20 ");
 JTextField t6 = new JTextField(" -------------------- ");
 JTextField t7 = new JTextField(" 20:30 15-10-20 ");
 JTextField t8 = new JTextField(" 17:00 9-1-21 ");
 JTextField t9 = new JTextField(" -------------------- ");
 JTextField t10 = new JTextField(" -------------------- ");
 JTextField t11 = new JTextField(" -------------------- ");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" 17:30 21-10-20");
 JTextField t14 = new JTextField(" -------------------- ");
 JTextField t15 = new JTextField(" 17:00 26-12-20");
 JTextField t16 = new JTextField(" 17:00 30-12-20");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" -------------------- ");
 JTextField s3 = new JTextField(" MILITARY COLLEGE");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s6 = new JTextField(" -------------------- ");
 JTextField s7 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s8 = new JTextField(" ISMAILIA ");
 JTextField s9 = new JTextField(" -------------------- ");
 JTextField s10 = new JTextField(" -------------------- ");
 JTextField s11 = new JTextField(" -------------------- ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" AIR DEFENSE ");
 JTextField s14 = new JTextField(" -------------------- ");
 JTextField s15 = new JTextField(" ALAHLY WE DEFENSE ");
 JTextField s16 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f);
 
   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

    label_layout(f,l,l1,l2,l3,l4,l5);
    
    f.setTitle(" THE ARAB CONTRACTORS  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b17.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b16.setBounds(350,840,200,30); b18.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
            j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    } 
    else if(ae.getSource()==b18)
    {
     JFrame f =new JFrame();JLabel l=new JLabel();JLabel l1=new JLabel();JLabel l2=new JLabel();
    JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
    
 //time&&date
 JTextField t1 = new JTextField(" -------------------- ");
 JTextField t2= new JTextField(" 14:30 9-1-21");
 JTextField t3 = new JTextField(" -------------------- ");
 JTextField t4 = new JTextField(" -------------------- ");
 JTextField t5 = new JTextField(" -------------------- ");
 JTextField t6 = new JTextField(" 19:30 18-12-20 ");
 JTextField t7 = new JTextField(" 14:30 18-12-20 ");
 JTextField t8 = new JTextField(" 19:30 3-1-21");
 JTextField t9 = new JTextField(" 14:30 30-12-20 ");
 JTextField t10 = new JTextField(" 20:00 16-10-20 ");
 JTextField t11 = new JTextField(" 19:30 26-12-20");
 JTextField t12 = new JTextField(" -------------------- ");
 JTextField t13 = new JTextField(" -------------------- ");
 JTextField t14 = new JTextField(" 19:30 22-12-20 ");
 JTextField t15 = new JTextField(" 20:00 29-10-20 ");
 JTextField t16 = new JTextField(" -------------------- ");
 JTextField t17 = new JTextField(" -------------------- ");
 
 //stadium
 JTextField s1 = new JTextField(" -------------------- ");
 JTextField s2= new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s3 = new JTextField(" -------------------- ");
 JTextField s4 = new JTextField(" -------------------- ");
 JTextField s5 = new JTextField(" -------------------- ");
 JTextField s6 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s7 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s8 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s9 = new JTextField(" KHALED BESHARA ");
 JTextField s10 = new JTextField(" THE ARAB CONTRACTORS ");
 JTextField s11 = new JTextField(" BURJ ALARAB ");
 JTextField s12 = new JTextField(" -------------------- ");
 JTextField s13 = new JTextField(" -------------------- ");
 JTextField s14 = new JTextField(" SPORTS DEVICE ");
 JTextField s15 = new JTextField(" ALAHLY WE PEACE ");
 JTextField s16 = new JTextField(" -------------------- ");
 JTextField s17 = new JTextField(" -------------------- ");
 
 //referee
 referre(f);
 
   t1.setBounds(650,165,200,30);t2.setBounds(650,210,200,30);t3.setBounds(650,255,200,30);t4.setBounds(650,300,200,30);
 t5.setBounds(650,345,200,30);t6.setBounds(650,390,200,30);t7.setBounds(650,435,200,30); t8.setBounds(650,480,200,30);
 t9.setBounds(650,525,200,30);t10.setBounds(650,570,200,30);t11.setBounds(650,615,200,30);t12.setBounds(650,660,200,30);
 t13.setBounds(650,705,200,30); t14.setBounds(650,750,200,30);t15.setBounds(650,795,200,30);t16.setBounds(650,840,200,30);
 t17.setBounds(650,885,200,30);
 
 f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);f.add(t11);f.add(t12);f.add(t13);
 f.add(t14);f.add(t15);f.add(t16);f.add(t17);
 
 
 s1.setBounds(950,165,220,30);s2.setBounds(950,210,220,30);s3.setBounds(950,255,220,30);s4.setBounds(950,300,220,30);
 s5.setBounds(950,345,220,30);s6.setBounds(950,390,220,30);s7.setBounds(950,435,220,30);s8.setBounds(950,480,220,30);
 s9.setBounds(950,525,220,30);s10.setBounds(950,570,220,30);s11.setBounds(950,615,220,30);s12.setBounds(950,660,220,30);
 s13.setBounds(950,705,220,30); s14.setBounds(950,750,220,30);s15.setBounds(950,795,220,30);s16.setBounds(950,840,220,30);
 s17.setBounds(950,885,220,30);
 
 f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);f.add(s9);f.add(s10);f.add(s11);f.add(s12);f.add(s13);
 f.add(s14);f.add(s15);f.add(s16);f.add(s17);

    label_layout(f,l,l1,l2,l3,l4,l5);
    f.setTitle(" EGYPT OF CLEARING  MATCHES DETAILS ");
    f.setSize(1500,1000);f.setLocation(0,4);f.setVisible(true);
     
     b18.setBounds(20, 220, 200, 500);
    b1.setBounds(350,165,200,30);b2.setBounds(350,210,200,30);b3.setBounds(350,255,200,30);b4.setBounds(350,300,200,30);b5.setBounds(350,345,200,30);
    b6.setBounds(350,390,200,30);b7.setBounds(350,435,200,30); b8.setBounds(350,480,200,30);b9.setBounds(350,525,200,30);b10.setBounds(350,570,200,30);
    b11.setBounds(350,615,200,30);b12.setBounds(350,660,200,30);b13.setBounds(350,705,200,30);b14.setBounds(350,750,200,30);b15.setBounds(350,795,200,30);
    b16.setBounds(350,840,200,30); b17.setBounds(350,885,200,30);  
     f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);
    f.add(b15);f.add(b16);f.add(b17);f.add(b18); 
        j1.setIcon(new ImageIcon("D:\\artboard_26.jpg"));
            p2.add(j1);
            f.add(p2);
            validate();
    }
    }
    public void label_layout(JFrame y,JLabel l,JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5)
    { 
     JFrame f;
     f=y;    
    f.add(l);l.setText(" vs ");l.setFont(new Font(" ",Font.BOLD ,30 ));l.setBounds(260,430, 100, 100); l.setForeground(Color.WHITE);
    f.add(l1);l1.setText(" FIRST TEAM : ");l1.setFont(new Font(" ",Font.BOLD ,12 ));l1.setBounds(80,155, 200, 100);l1.setForeground(Color.WHITE);
    f.add(l2);l2.setText(" SECOND TEAM : ");l2.setFont(new Font(" ",Font.BOLD ,12 ));l2.setBounds(400,100, 220, 100);l2.setForeground(Color.WHITE);
    f.add(l3);l3.setText(" TIME && DATE  : ");l3.setFont(new Font(" ",Font.BOLD ,12 ));l3.setBounds(700,100, 250, 100); l3.setForeground(Color.WHITE);
    f.add(l4);l4.setText(" STADIUM  : ");l4.setFont(new Font(" ",Font.BOLD ,12 ));l4.setBounds(1030,100, 250, 100);l4.setForeground(Color.WHITE);
    f.add(l5);l5.setText("   ");l5.setFont(new Font(" ",Font.BOLD ,12 ));l5.setBounds(1090,100, 250, 100);l5.setForeground(Color.WHITE);      
    }
    public void referre(JFrame y)
 {
    JFrame f;
    f=y;
 JTextField r1 = new JTextField(" AMEN AMER ");
 JTextField r2= new  JTextField(" MOHAMED FAROUK ");
 JTextField r3 = new JTextField(" MAHMOUD ASHOUR ");
 JTextField r4 = new JTextField(" JIHAD GRISHA ");
 JTextField r5 = new JTextField(" MOHAMED ABBAS ");
 JTextField r6 = new JTextField(" MOHAMED ABDEL QADER MORSI ");
 JTextField r7 = new JTextField(" SAMIR MAHMOUD ");
 JTextField r8 = new JTextField(" TAWFIQ ELSAID ");
 JTextField r9 = new JTextField(" HAMDY SHABAN ");
 JTextField r10 = new JTextField(" YASER ABDUL RAOUF ");
 JTextField r11 = new JTextField(" MOHAMED YOUSSEF ");
 JTextField r12 = new JTextField(" EBRAHIM NOUR ");
 JTextField r13 = new JTextField(" SAEED HAMZA ");
 JTextField r14 = new JTextField(" TAREK MAGDY ");
 JTextField r15 = new JTextField(" MOHAMED BASSIOUNI ");
 JTextField r16 = new JTextField(" MAHMOUD ELBANA  ");
 JTextField r17 = new JTextField(" AHMED ELADAWY ");
 
 r1.setBounds(1200,165,220,30); r2.setBounds(1200,210,220,30);r3.setBounds(1200,255,220,30);r4.setBounds(1200,300,220,30);
 r5.setBounds(1200,345,220,30);r6.setBounds(1200,390,220,30);r7.setBounds(1200,435,220,30);r8.setBounds(1200,480,220,30);
 r9.setBounds(1200,525,220,30);r10.setBounds(1200,570,220,30);r11.setBounds(1200,615,220,30);r12.setBounds(1200,660,220,30);
 r13.setBounds(1200,705,220,30); r14.setBounds(1200,750,220,30);r15.setBounds(1200,795,220,30);r16.setBounds(1200,840,220,30);
 r17.setBounds(1200,885,220,30);
 
 f.add(r1);f.add(r2);f.add(r3);f.add(r4);f.add(r5);f.add(r6);f.add(r7);f.add(r8);f.add(r9);f.add(r10);f.add(r11);f.add(r12);f.add(r13);
 f.add(r14);f.add(r15);f.add(r16);f.add(r17);
 
 }
}
