
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNDJ
 */
public class RegisterFM extends javax.swing.JFrame {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
   
    public RegisterFM() {
        initComponents();
         this.setLocationRelativeTo(null);
         
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regRegstr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        regConfrmPswd = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullnme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        userType = new javax.swing.JComboBox<>();
        fnlab = new javax.swing.JLabel();
        userId = new javax.swing.JLabel();
        regPswd = new javax.swing.JPasswordField();
        emlab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pswdLab = new javax.swing.JLabel();
        cnfmpswdlab = new javax.swing.JLabel();
        fnlab2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(809, 558));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regRegstr.setBackground(new java.awt.Color(51, 51, 255));
        regRegstr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regRegstr.setText("Register");
        regRegstr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regRegstrMouseClicked(evt);
            }
        });
        regRegstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRegstrActionPerformed(evt);
            }
        });
        getContentPane().add(regRegstr, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome to TechStore");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Click here to login");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 180, 30));

        regConfrmPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConfrmPswdActionPerformed(evt);
            }
        });
        regConfrmPswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regConfrmPswdKeyReleased(evt);
            }
        });
        getContentPane().add(regConfrmPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 330, 50));

        reset.setBackground(new java.awt.Color(255, 153, 51));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 150, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Password:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Confirm Password:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("User Type:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Full Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        fullnme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnmeActionPerformed(evt);
            }
        });
        fullnme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullnmeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fullnmeKeyTyped(evt);
            }
        });
        getContentPane().add(fullnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 330, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 40, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Email Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 330, 50));

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seller", "Buyer" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        getContentPane().add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 330, 50));

        fnlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        fnlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(fnlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 180, 50));

        userId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userId.setForeground(new java.awt.Color(255, 0, 0));
        userId.setText("UserID");
        getContentPane().add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 60, -1));

        regPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPswdActionPerformed(evt);
            }
        });
        regPswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regPswdKeyReleased(evt);
            }
        });
        getContentPane().add(regPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 330, 50));

        emlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        emlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(emlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 190, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("UserID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 90, 20));

        pswdLab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pswdLab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pswdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 180, 50));

        cnfmpswdlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cnfmpswdlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cnfmpswdlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 180, 50));

        fnlab2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(fnlab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 180, 50));

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Register Form");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 290, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 34, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer-macbook-air-business-desktop.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1540, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void fullnmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnmeActionPerformed

    private void fullnmeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullnmeKeyTyped
       char c = evt.getKeyChar();
        if(!((Character.isAlphabetic(c)) || (c == KeyEvent.VK_DELETE) || (Character.isLowerCase(c)) || (Character.isUpperCase(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_SPACE))){
            fnlab.setText("naming is incorrect");
            evt.consume();
        }
        else{
            fnlab.setText(null);
          
        }
          
    }//GEN-LAST:event_fullnmeKeyTyped
    
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        
    }//GEN-LAST:event_emailKeyTyped

    private void regPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPswdActionPerformed

    private void regConfrmPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regConfrmPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regConfrmPswdActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
             fullnme.setText("");
             email.setText("");
             regPswd.setText("");
             regConfrmPswd.setText("");
             reset.setSelected(false);
        
    }//GEN-LAST:event_resetActionPerformed

    private void regRegstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRegstrActionPerformed
        
        HttpConnector hc = new HttpConnector();
        Accounts ac = new Accounts();
       
        String fn = fullnme.getText();
        String em = email.getText();
        String ut = (String) userType.getSelectedItem();
        String pswd = regPswd.getText();
        String pswd1 = regConfrmPswd.getText();
        
        
        try{
            
            
            
            if((em.equals("") && pswd1.equals("") && pswd.equals("") && fn.equals("")))  {
                  
                    
                     JOptionPane.showMessageDialog(null, "Please complete all the fields!");
                    
                }
            
            
            
            else if(fn.equals("")){
                JOptionPane.showMessageDialog(null, "Please complete all the fields!");
            }
             else if((em.equals("")))
              
              {
                JOptionPane.showMessageDialog(null, "Please complete all the fields!");
              } 
               
              
           
            else if(pswd.equals("")){
                    JOptionPane.showMessageDialog(null, "Please complete all the fields!");
            }
            else if(pswd1.equals("")){
                JOptionPane.showMessageDialog(null, "Please complete all the fields!");
            }
            else{
            
                JOptionPane.showMessageDialog(null, "Successfully Registered");
               
            }
        }
            catch(HeadlessException e){
                
                
                
                    }

       
    }//GEN-LAST:event_regRegstrActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        LoginFM lg = new LoginFM();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
            String selectedValue = userType.getSelectedItem().toString(); //get the value from combobox
        
            userType.setSelectedItem(selectedValue);
    }//GEN-LAST:event_userTypeActionPerformed

    private void regRegstrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regRegstrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regRegstrMouseClicked

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        
       String PATTERN = ("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$");
       Pattern patt1 = Pattern.compile(PATTERN);
       Matcher match1 = patt1.matcher(email.getText());
       if(!match1.matches()){
             emlab.setText("Email in incorrect");
       }
       else{
        emlab.setText(null);
            
    }//GEN-LAST:event_emailKeyReleased
    }
    private void fullnmeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullnmeKeyReleased
       /*
       String PATTERN = ("^[a-zA-Z0]{0,30}$");
       Pattern patt = Pattern.compile(PATTERN);
       Matcher match = patt.matcher(fullnme.getText());
       if(!match.matches()){
                fnlab.setText("naming is incorrect");
       }
        else{
              fnlab.disable();
            
    }       
         */
       
    }//GEN-LAST:event_fullnmeKeyReleased

    private void regPswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regPswdKeyReleased
       String PATTERN = ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
       Pattern patt1 = Pattern.compile(PATTERN);
       Matcher match1 = patt1.matcher(regPswd.getText());
       if(!match1.matches()){
             pswdLab.setText("Password is incorrect");
       }
       else{
            pswdLab.setText(null);
            
    }                           
    }//GEN-LAST:event_regPswdKeyReleased

    private void regConfrmPswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regConfrmPswdKeyReleased
        
        String pswd = regPswd.getText();
        String pswd1 = regConfrmPswd.getText();
        if((!pswd.equals(pswd1))){
                            cnfmpswdlab.setText("Password doesn't match!");
                 }
      else if((pswd.equals(pswd1))){
       cnfmpswdlab.setText("Password matched");
    }//GEN-LAST:event_regConfrmPswdKeyReleased
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnfmpswdlab;
    public javax.swing.JTextField email;
    private javax.swing.JLabel emlab;
    private javax.swing.JLabel fnlab;
    private javax.swing.JLabel fnlab2;
    public javax.swing.JTextField fullnme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pswdLab;
    private javax.swing.JPasswordField regConfrmPswd;
    private javax.swing.JPasswordField regPswd;
    private javax.swing.JButton regRegstr;
    private javax.swing.JButton reset;
    public javax.swing.JLabel userId;
    public javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
