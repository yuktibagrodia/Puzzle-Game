package login1;

import java.awt.event.*;
import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.*;

class Puzzle1 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, starB,bs;
    Icon star;
    int second = 60;
    int minute = 5;
    int c=0;
    boolean state = true;
    int k=0;
    JLabel l5,l6,l4;
    Icon ic0 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\starB0.jpg");
    Icon ic10 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\starB10.jpg");
    Icon ic20 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\starB20.jpg");
    Icon samicon1 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\main.jpg");
    Icon samicon2 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\main2.jpg");
    Icon samicon3 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\main3.jpg");
    Icon ic1 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\1.jpg");
    Icon ic2 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\5.jpg");
    Icon ic3 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\2.jpg");
    Icon ic4 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\7.jpg");
    Icon ic5 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\4.jpg");
    Icon ic6 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\6.jpg");
    Icon ic7 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\8.jpg");
    Icon ic8 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\9.jpg");
    Icon ic9 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\3.jpg");

    Icon ic11 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\12.jpg");
    Icon ic12 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\13.jpg");
    Icon ic13 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\16.jpg");
    Icon ic14 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\11.jpg");
    Icon ic15 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\14.jpg");
    Icon ic16 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\19.jpg");
    Icon ic17 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\17.jpg");
    Icon ic18 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\15.jpg");
    Icon ic19 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\18.jpg");

    Icon ic21 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\24.jpg");
    Icon ic22 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\25.jpg");
    Icon ic23 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\21.jpg");
    Icon ic24 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\27.jpg");
    Icon ic25 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\23.jpg");
    Icon ic26 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\29.jpg");
    Icon ic27 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\28.jpg");
    Icon ic28 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\22.jpg");
    Icon ic29 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\26.jpg");

    Puzzle1() {

        super("TRY THE PUZZLE OUT");

        b1 = new JButton(ic1);
        b1.setBounds(10, 80, 100, 100);
        b2 = new JButton(ic2);
        b2.setBounds(110, 80, 100, 100);
        b3 = new JButton(ic3);
        b3.setBounds(210, 80, 100, 100);
        b4 = new JButton(ic4);
        b4.setBounds(10, 180, 100, 100);
        b5 = new JButton(ic5);
        b5.setBounds(110, 180, 100, 100);
        b6 = new JButton(ic6);
        b6.setBounds(210, 180, 100, 100);
        b7 = new JButton(ic7);
        b7.setBounds(10, 280, 100, 100);
        b8 = new JButton(ic8);
        b8.setBounds(110, 280, 100, 100);
        b9 = new JButton(ic9);
        b9.setBounds(210, 280, 100, 100);
        sample = new JButton(samicon1);
        sample.setBounds(380, 100, 200, 200);
        
        Font f = new Font("Calibri",Font.BOLD,36);
        JLabel l7 = new JLabel("TIMEER");
        l7.setBounds(400,500,200,100);
        l4 = new JLabel("05:");
        l4.setBounds(400,580,100,60);
        l5 = new JLabel("00");
        l5.setBounds(460,580,100,60);
        l4.setFont(f);
        l5.setFont(f);
        l7.setFont(f);
               
        bs = new JButton("Start");
        bs.setBounds(400,400,100,50);
        
        JLabel l1 = new JLabel("Sample:");
        l1.setBounds(330, 200, 70, 20);
        JLabel l2 = new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
        l2.setBounds(5, 420, 500, 20);
        JLabel l3 = new JLabel("LEVEL 1 : EASY LEVEL ");
        l3.setBounds(280, 20,400, 60);
        l3.setForeground(Color.red);
        l3.setFont(f);
        starB = new JButton(ic0);
        starB.setBounds(330,420, 50, 50);
        star = b9.getIcon();
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bs);
        add(sample);
        add(l1);
        add(l2);
        add(starB);
        add(l3);
        add(l4);
        add(l5);
        add(l7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        sample.addActionListener(this);
        bs.addActionListener(this);
        setLayout(null);
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str = e.getActionCommand();
        if (e.getSource() == sample)
        {
            Icon s1 = sample.getIcon();
                sample.setIcon(samicon1);
                b1.setIcon(ic1);
                b2.setIcon(ic2);
                b3.setIcon(ic3);
                b4.setIcon(ic4);
                b5.setIcon(ic5);
                b6.setIcon(ic6);
                b7.setIcon(ic7);
                b8.setIcon(ic8);
                b9.setIcon(ic9);
                star = b9.getIcon();
                starB.setIcon(ic0);
        }    
        if(e.getSource()==bs)
        {
        k=1;
        state = true;
            Thread t;
            t = new Thread()
            {
                @Override
                public void run()
                {
                    for(;;)
                    {
                        if(state==true)
                        {
                            try{
                                sleep(1000);                                                            
                                if(minute==5)
                                {
                                    minute--;
                                    
                                }
                                if(second==0)
                                {
                                    second=60;
                                    minute--;
                                }
                                l5.setText(" : "+second);
                                second--;
                                l4.setText(minute+"");
                                
                                if(minute==0 && second==0)
                                {
                                    l5.setText(" : "+second);
                                    JOptionPane.showMessageDialog(null,"YOUR TIME's UP");
                                    System.exit(1);
                                }
                            }
                            catch(InterruptedException e )
                            {
                                System.out.println(e);
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            };
                    t.start();            
        }
       
        if(k==1)
        {    
        if (e.getSource() == b1) {
            Icon s1 = b1.getIcon();
            if (b2.getIcon() == star) {
                b2.setIcon(s1);
                b1.setIcon(star);
            } else if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b1.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b2) {
            Icon s1 = b2.getIcon();
            if (b1.getIcon() == star) {
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b2.setIcon(star);
            } else if (b3.getIcon() == star) {
                b3.setIcon(s1);
                b2.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b3) {
            Icon s1 = b3.getIcon();
            if (b2.getIcon() == star) {
                b2.setIcon(s1);
                b3.setIcon(star);
            } else if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b3.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b4) {
            Icon s1 = b4.getIcon();
            if (b1.getIcon() == star) {
                b1.setIcon(s1);
                b4.setIcon(star);
            } else if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b4.setIcon(star);
            } else if (b7.getIcon() == star) {
                b7.setIcon(s1);
                b4.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b5) {
            Icon s1 = b5.getIcon();
            if (b2.getIcon() == star) {
                b2.setIcon(s1);
                b5.setIcon(star);
            } else if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b5.setIcon(star);
            } else if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b5.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b5.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b6) {
            Icon s1 = b6.getIcon();
            if (b3.getIcon() == star) {
                b3.setIcon(s1);
                b6.setIcon(star);
            } else if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b6.setIcon(star);
            } else if (b9.getIcon() == star) {
                b9.setIcon(s1);
                b6.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b7) {
            Icon s1 = b7.getIcon();
            if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b7.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b7.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b8) {
            Icon s1 = b8.getIcon();
            if (b7.getIcon() == star) {
                b7.setIcon(s1);
                b8.setIcon(star);
            } else if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b8.setIcon(star);
            } else if (b9.getIcon() == star) {
                b9.setIcon(s1);
                b8.setIcon(star);
            }

        }//end of if

        if (e.getSource() == b9) {
            Icon s1 = b9.getIcon();
            if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b9.setIcon(star);
            } else if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b9.setIcon(star);
            }
        }//end of if        
        
          if(b1.getIcon()==ic1 && b2.getIcon()==ic3 && b3.getIcon()==ic9 && b4.getIcon()==ic5 && b5.getIcon()==ic2 && b6.getIcon()==ic6 && b7.getIcon()==ic4 && b8.getIcon()==ic7 && b9.getIcon()==ic8)
        {
            Component frame = null;
            state=false;
            JOptionPane.showMessageDialog(frame,"Yeah you have Successfully Completed East Level\nClick on OK to Move to Medium Level");
            minute=5;
            second=60;
            l4.setText("05 : ");
            l5.setText("00");
            Puzzle3 p = new Puzzle3();
            p.setVisible(true);
            setVisible(false);
        }
        }    
if(k==0)
{
      JOptionPane.showMessageDialog(null,"Click on Start to Start Playing and Choose a Picture");
}
}
    public static void main(String[] args) 
    {    
       // Puzzle p = new Puzzle();
    }
}