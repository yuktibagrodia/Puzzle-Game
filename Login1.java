package login1;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login1 extends JFrame {
    public Login1() {
        initComponents();
    }                          
    void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        t1 = new JTextField();
        jButton1 = new JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Stencil", 1, 24)); 
        jLabel1.setForeground(new Color(255, 0, 51));
        jLabel1.setText("   WELCOME TO MIND CRAFT PUZZLE GAME");
        jLabel1.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 153, 51)));

        jLabel2.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("    ENTER YOUR NAME : ");

        t1.setFont(new Font("Tahoma", 1, 18));
        t1.setCursor(new Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>                        

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt){                                        
       
        String name;
        name = t1.getText();
        String n;
        n=name;
        int t=0;
        n=n.toLowerCase();
        char ch;
     
        try{
        for (int i = 0; i < n.length() ; i++) {
        ch = n.charAt(i);
         if (!(ch >= 'a' && ch <= 'z')) {
                t++;
             throw new MyExp();
         }
        }
        }
        catch(MyExp e)
                {
                System.out.print("This is Invalid User Name\nUsername should contain only Alphabetical Characters");
                ImageIcon icon1 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\icon.jpg");
                JOptionPane.showMessageDialog(null, "Name Should Contain only Alphabets Character", 
                "ENTER PROPER NAME", JOptionPane.INFORMATION_MESSAGE, icon1);
         } 
       
        if(n.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter Your Name");
            t++;
        }       
        if(t==0){
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Ryan\\Desktop\\icon.jpg");
                JOptionPane.showMessageDialog(null, "DEAR "+name+" \nWELCOME TO MINDS CRAFT\n\nClick on OK to move to the Game Screen", 
                "MINDS CRAFT", JOptionPane.INFORMATION_MESSAGE, icon1);
        }        
        if(t==0){            
            Puzzle1 p = new Puzzle1();
            p.setVisible(true);
        }
    }        
    public static void main(String args[]) {        
        Login1 l = new Login1();
        l.setVisible(true);
    }
    // Variables declaration - do not modify                    
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    // End of variables declaration                  
}