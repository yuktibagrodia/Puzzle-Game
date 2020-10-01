package login1;

import java.awt.event.*;
import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.*;

class Puzzle2 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25, sample, starB,bs;
    Icon star;
    int second = 60;
    int minute = 5;
    int c=0;
    boolean state = true;
    int k=0;
    JLabel l5,l6,l4;
    Icon ic = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\star.jpg");
    Icon samicon2 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\main.jpg");

    Icon ic1 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\12.jpg");
    Icon ic2 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\13.jpg");
    Icon ic3 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\14.jpg");
    Icon ic4 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\19.jpg");
    Icon ic5 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\15.jpg");
    Icon ic6 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\11.jpg");
    Icon ic7 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\22.jpg");
    Icon ic8 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\17.jpg");
    Icon ic9 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\20.jpg");
    Icon ic10 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\35.jpg");
    Icon ic11 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\16.jpg");
    Icon ic12 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\21.jpg");
    Icon ic13 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\18.jpg");
    Icon ic14 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\23.jpg");
    Icon ic15 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\25.jpg");
    Icon ic16 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\26.jpg");
    Icon ic17 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\27.jpg");
    Icon ic18 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\28.jpg");
    Icon ic19 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\24.jpg");
    Icon ic20 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\30.jpg");
    Icon ic21 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\31.jpg");
    Icon ic22 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\32.jpg");
    Icon ic23 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\33.jpg");  
    Icon ic24 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\29.jpg");
    Icon ic25 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\SIT 4TH SEM\\JAVA\\JAVA PROJECT\\PICS\\34.jpg");




    Puzzle2() {

        super("TRY THE PUZZLE OUT");

        b1 = new JButton(ic1);
        b1.setBounds(10, 80, 100, 100);
        b2 = new JButton(ic2);
        b2.setBounds(110, 80, 100, 100);
        b3 = new JButton(ic3);
        b3.setBounds(210, 80, 100, 100);
        b4 = new JButton(ic4);
        b4.setBounds(310, 80, 100, 100);
        b5 = new JButton(ic5);
        b5.setBounds(410, 80, 100, 100);
        
        b6 = new JButton(ic6);
        b6.setBounds(10, 180, 100, 100);
        b7 = new JButton(ic7);
        b7.setBounds(110, 180, 100, 100);
        b8 = new JButton(ic8);
        b8.setBounds(210, 180, 100, 100);
        b9 = new JButton(ic9);
        b9.setBounds(310, 180, 100, 100);
        b10 = new JButton(ic10);
        b10.setBounds(410, 180, 100, 100);
        
        b11 = new JButton(ic11);
        b11.setBounds(10, 280, 100, 100);
        b12 = new JButton(ic12);
        b12.setBounds(110, 280, 100, 100);
        b13 = new JButton(ic13);
        b13.setBounds(210, 280, 100, 100);
        b14 = new JButton(ic14);
        b14.setBounds(310, 280, 100, 100);
        b15 = new JButton(ic15);
        b15.setBounds(410, 280, 100, 100);
        
        b16 = new JButton(ic16);
        b16.setBounds(10, 380, 100, 100);
        b17 = new JButton(ic17);
        b17.setBounds(110, 380, 100, 100);
        b18 = new JButton(ic18);
        b18.setBounds(210, 380, 100, 100);
        b19 = new JButton(ic19);
        b19.setBounds(310, 380, 100, 100);
        b20= new JButton(ic20);
        b20.setBounds(410, 380, 100, 100);
        
        b21 = new JButton(ic21);
        b21.setBounds(10, 480, 100, 100);
        b22 = new JButton(ic22);
        b22.setBounds(110,480, 100, 100);
        b23 = new JButton(ic23);
        b23.setBounds(210, 480, 100, 100);
        b24 = new JButton(ic24);
        b24.setBounds(310, 480, 100, 100);
        b25 = new JButton(ic25);
        b25.setBounds(410, 480, 100, 100);
        
        sample = new JButton(samicon2);
        sample.setBounds(600, 300, 200, 200);
        
        Font f = new Font("Calibri",Font.BOLD,36);
        JLabel l7 = new JLabel("TIMEER");
        l7.setBounds(600,500,200,100);
        l4 = new JLabel("05:");
        l4.setBounds(600,680,100,60);
        l5 = new JLabel("00");
        l5.setBounds(660,680,100,60);
        l4.setFont(f);
        l5.setFont(f);
        l7.setFont(f);
               
        bs = new JButton("Start");
        bs.setBounds(600,620,100,50);
        
        JLabel l1 = new JLabel("Sample:");
        l1.setBounds(600, 260, 70, 20);
        JLabel l2 = new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
        l2.setBounds(5, 620, 500, 20);
        JLabel l3 = new JLabel("LEVEL 2 : MEDIUM LEVEL  ");
        l3.setBounds(280, 20,400, 60);
        l3.setForeground(Color.red);
        l3.setFont(f);
        starB = new JButton(ic);
        starB.setBounds(330,620, 50, 50);
        star = b10.getIcon();
        
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
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        
        add(b21);
        add(b22);
        add(b23);
        add(b24);
        add(b25);
        
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
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        
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
                b1.setIcon(ic1);
                b2.setIcon(ic2);
                b3.setIcon(ic3);
                b4.setIcon(ic4);
                b5.setIcon(ic5);
                b6.setIcon(ic6);
                b7.setIcon(ic7);
                b8.setIcon(ic8);
                b9.setIcon(ic9);
                b10.setIcon(ic10);
                b11.setIcon(ic11);
                b12.setIcon(ic12);
                b13.setIcon(ic13);
                b14.setIcon(ic14);
                b15.setIcon(ic15);
                b16.setIcon(ic16);
                b17.setIcon(ic17);
                b18.setIcon(ic18);
                b19.setIcon(ic19);
                b20.setIcon(ic20);
                b21.setIcon(ic21);
                b22.setIcon(ic22);
                b23.setIcon(ic23);
                b24.setIcon(ic24);
                b25.setIcon(ic25);
                star = b10.getIcon();
            }//eof else
            
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
            } else if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b1.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b2) {
            Icon s1 = b2.getIcon();
            if (b1.getIcon() == star) {
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if (b7.getIcon() == star) {
                b7.setIcon(s1);
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
            } 
            else if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b3.setIcon(star);
            }
            else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b3.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b4) {
            Icon s1 = b4.getIcon();
            if (b3.getIcon() == star) {
                b3.setIcon(s1);
                b4.setIcon(star);
            } else if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b4.setIcon(star);
            } else if (b9.getIcon() == star) {
                b9.setIcon(s1);
                b4.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b5) {
            Icon s1 = b5.getIcon();
            if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b5.setIcon(star);
            } else if (b10.getIcon() == star) {
                b10.setIcon(s1);
                b5.setIcon(star);
            }
        }
        
        
        if (e.getSource() == b6) {
            Icon s1 = b6.getIcon();
            if (b1.getIcon() == star) {
                b1.setIcon(s1);
                b6.setIcon(star);
            } else if (b7.getIcon() == star) {
                b7.setIcon(s1);
                b6.setIcon(star);
            } else if (b11.getIcon() == star) {
                b11.setIcon(s1);
                b6.setIcon(star);
            }
        }
        if (e.getSource() == b7) {
            Icon s1 = b7.getIcon();
            if (b2.getIcon() == star) {
                b2.setIcon(s1);
                b7.setIcon(star);
            } else if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b7.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b7.setIcon(star);
            } else if (b12.getIcon() == star) {
                b12.setIcon(s1);
                b7.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b8) {
            Icon s1 = b8.getIcon();
            if (b3.getIcon() == star) {
                b3.setIcon(s1);
                b8.setIcon(star);
            } else if (b7.getIcon() == star) {
                b7.setIcon(s1);
                b8.setIcon(star);
            } else if (b9.getIcon() == star) {
                b9.setIcon(s1);
                b8.setIcon(star);
            } else if (b13.getIcon() == star) {
                b13.setIcon(s1);
                b8.setIcon(star);
            }
        }
        if (e.getSource() == b9) {
            Icon s1 = b9.getIcon();
            if (b4.getIcon() == star) {
                b4.setIcon(s1);
                b9.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b9.setIcon(star);
            } else if (b10.getIcon() == star) {
                b10.setIcon(s1);
                b9.setIcon(star);
            } else if (b14.getIcon() == star) {
                b14.setIcon(s1);
                b9.setIcon(star);
            }
        }        
        
        if (e.getSource() == b10) {
            Icon s1 = b10.getIcon();
            if (b5.getIcon() == star) {
                b5.setIcon(s1);
                b10.setIcon(star);
            } else if (b15.getIcon() == star) {
                b15.setIcon(s1);
                b10.setIcon(star);
            } else if (b9.getIcon() == star) {
                b9.setIcon(s1);
                b10.setIcon(star);
            }
        }//end of if
        
        if (e.getSource() == b11) {
            Icon s1 = b11.getIcon();
            if (b6.getIcon() == star) {
                b6.setIcon(s1);
                b11.setIcon(star);
            } else if (b12.getIcon() == star) {
                b12.setIcon(s1);
                b11.setIcon(star);
            } else if (b16.getIcon() == star) {
                b16.setIcon(s1);
                b11.setIcon(star);
            }
        }
        if (e.getSource() == b12) {
            Icon s1 = b12.getIcon();
            if (b11.getIcon() == star) {
                b11.setIcon(s1);
                b12.setIcon(star);
            } else if (b7.getIcon() == star) {
                b7.setIcon(s1);
                b12.setIcon(star);
            } else if (b13.getIcon() == star) {
                b13.setIcon(s1);
                b12.setIcon(star);
            } else if (b17.getIcon() == star) {
                b17.setIcon(s1);
                b12.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b13) {
            Icon s1 = b13.getIcon();
            if (b12.getIcon() == star) {
                b12.setIcon(s1);
                b13.setIcon(star);
            } else if (b14.getIcon() == star) {
                b14.setIcon(s1);
                b13.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b13.setIcon(star);
            } else if (b18.getIcon() == star) {
                b18.setIcon(s1);
                b13.setIcon(star);
            }
        }
        if (e.getSource() == b14) {
            Icon s1 = b14.getIcon();
            if (b13.getIcon() == star) {
                b13.setIcon(s1);
                b14.setIcon(star);
            } else if (b15.getIcon() == star) {
                b15.setIcon(s1);
                b14.setIcon(star);
            } else if (b8.getIcon() == star) {
                b8.setIcon(s1);
                b14.setIcon(star);
            } else if (b18.getIcon() == star) {
                b18.setIcon(s1);
                b14.setIcon(star);
            }
        }        
        
        if (e.getSource() == b15) {
            Icon s1 = b15.getIcon();
            if (b10.getIcon() == star) {
                b10.setIcon(s1);
                b15.setIcon(star);
            } else if (b20.getIcon() == star) {
                b20.setIcon(s1);
                b15.setIcon(star);
            } else if (b14.getIcon() == star) {
                b14.setIcon(s1);
                b15.setIcon(star);
            }
        }
          
        if (e.getSource() == b16) {
            Icon s1 = b16.getIcon();
            if (b11.getIcon() == star) {
                b11.setIcon(s1);
                b16.setIcon(star);
            } else if (b17.getIcon() == star) {
                b17.setIcon(s1);
                b16.setIcon(star);
            } else if (b21.getIcon() == star) {
                b21.setIcon(s1);
                b16.setIcon(star);
            }
        }
        if (e.getSource() == b17) {
            Icon s1 = b17.getIcon();
            if (b16.getIcon() == star) {
                b16.setIcon(s1);
                b17.setIcon(star);
            } else if (b18.getIcon() == star) {
                b18.setIcon(s1);
                b17.setIcon(star);
            } else if (b12.getIcon() == star) {
                b12.setIcon(s1);
                b17.setIcon(star);
            } else if (b22.getIcon() == star) {
                b22.setIcon(s1);
                b17.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b18) {
            Icon s1 = b18.getIcon();
            if (b17.getIcon() == star) {
                b17.setIcon(s1);
                b18.setIcon(star);
            } else if (b19.getIcon() == star) {
                b19.setIcon(s1);
                b18.setIcon(star);
            } else if (b13.getIcon() == star) {
                b13.setIcon(s1);
                b18.setIcon(star);
            } else if (b23.getIcon() == star) {
                b23.setIcon(s1);
                b18.setIcon(star);
            }
        }
        if (e.getSource() == b19) {
            Icon s1 = b19.getIcon();
            if (b18.getIcon() == star) {
                b18.setIcon(s1);
                b19.setIcon(star);
            } else if (b20.getIcon() == star) {
                b20.setIcon(s1);
                b19.setIcon(star);
            } else if (b14.getIcon() == star) {
                b14.setIcon(s1);
                b19.setIcon(star);
            } else if (b24.getIcon() == star) {
                b24.setIcon(s1);
                b19.setIcon(star);
            }
        }        
        
        if (e.getSource() == b20) {
            Icon s1 = b20.getIcon();
            if (b15.getIcon() == star) {
                b15.setIcon(s1);
                b20.setIcon(star);
            } else if (b25.getIcon() == star) {
                b25.setIcon(s1);
                b20.setIcon(star);
            } else if (b19.getIcon() == star) {
                b19.setIcon(s1);
                b20.setIcon(star);
            }
        }
        if (e.getSource() == b21) {
            Icon s1 = b21.getIcon();
            if (b16.getIcon() == star) {
                b16.setIcon(s1);
                b21.setIcon(star);
            } else if (b22.getIcon() == star) {
                b22.setIcon(s1);
                b21.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b22) {
            Icon s1 = b22.getIcon();
            if (b21.getIcon() == star) {
                b21.setIcon(s1);
                b22.setIcon(star);
            } else if (b23.getIcon() == star) {
                b23.setIcon(s1);
                b22.setIcon(star);
            } else if (b17.getIcon() == star) {
                b17.setIcon(s1);
                b22.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b23) {
            Icon s1 = b23.getIcon();
            if (b22.getIcon() == star) {
                b22.setIcon(s1);
                b23.setIcon(star);
            } 
            else if (b24.getIcon() == star) {
                b24.setIcon(s1);
                b23.setIcon(star);
            }
            else if (b18.getIcon() == star) {
                b18.setIcon(s1);
                b23.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b24) {
            Icon s1 = b24.getIcon();
            if (b23.getIcon() == star) {
                b23.setIcon(s1);
                b24.setIcon(star);
            } else if (b25.getIcon() == star) {
                b25.setIcon(s1);
                b24.setIcon(star);
            } else if (b19.getIcon() == star) {
                b19.setIcon(s1);
                b24.setIcon(star);
            }
        }//end of if

        if (e.getSource() == b25) {
            Icon s1 = b25.getIcon();
            if (b24.getIcon() == star) {
                b24.setIcon(s1);
                b25.setIcon(star);
            } else if (b20.getIcon() == star) {
                b20.setIcon(s1);
                b25.setIcon(star);
            }
        }
        

if(b1.getIcon() == ic6 && b2.getIcon() == ic1 && b3.getIcon() == ic2 && b4.getIcon() == ic3 && b5.getIcon() == ic5 && b6.getIcon() == ic11 && b7.getIcon() == ic8 && b8.getIcon() == ic13 && b9.getIcon() == ic4 && b10.getIcon() == ic9 && b11.getIcon() == ic12 && b12.getIcon() == ic7 && b13.getIcon() == ic14 && b14.getIcon() == ic19 && b15.getIcon() == ic15 && b16.getIcon() == ic16 && b17.getIcon() == ic17 && b18.getIcon()==ic18 && b19.getIcon()==ic24 && b20.getIcon()==ic20 && b21.getIcon()==ic21 && b22.getIcon()==ic22 && b23.getIcon()==ic23 && b24.getIcon()==ic25 && b25.getIcon()==ic10)
    
{
    Component frame = null;
    state=false;
    JOptionPane.showMessageDialog(frame,"Yeah Puzzle Completed Successfully\nYou have Completed All the three Levels");
    minute=5;
    second=60;
    l4.setText("05 : ");
    l5.setText("00");
    System.exit(1);
}
        }
if(k==0)
{
      JOptionPane.showMessageDialog(null,"Click on Start to Start Playing and Choose a Picture");
}
    }
    public static void main(String[] args) 
    {    
        Puzzle2 p = new Puzzle2();
        p.setVisible(true);
    }
}