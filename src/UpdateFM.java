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
public class UpdateFM extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFM
     */
    public UpdateFM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        UserIdUpdte = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        fullnme = new javax.swing.JTextField();
        updtePswd = new javax.swing.JPasswordField();
        updteConfrmPswd = new javax.swing.JPasswordField();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        updtePSWDlab = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        updtFNlab = new javax.swing.JLabel();
        updteEmlab = new javax.swing.JLabel();
        updteCNFMPSWDlab = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("UserID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Full Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome to TechStore");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Email Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Password:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 90, -1));

        UserIdUpdte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(UserIdUpdte, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 330, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Confirm Password:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        fullnme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnmeActionPerformed(evt);
            }
        });
        fullnme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fullnmeKeyTyped(evt);
            }
        });
        getContentPane().add(fullnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 330, 50));

        updtePswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtePswdActionPerformed(evt);
            }
        });
        updtePswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updtePswdKeyReleased(evt);
            }
        });
        getContentPane().add(updtePswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 330, 50));

        updteConfrmPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updteConfrmPswdActionPerformed(evt);
            }
        });
        updteConfrmPswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updteConfrmPswdKeyReleased(evt);
            }
        });
        getContentPane().add(updteConfrmPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 330, 50));

        Update.setBackground(new java.awt.Color(51, 51, 255));
        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 150, 40));

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Update Profile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 290, 110));

        updtePSWDlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updtePSWDlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(updtePSWDlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 210, 50));

        reset.setBackground(new java.awt.Color(255, 153, 51));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 150, 40));

        updtFNlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updtFNlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(updtFNlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 220, 50));

        updteEmlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updteEmlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(updteEmlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, 210, 50));

        updteCNFMPSWDlab.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updteCNFMPSWDlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(updteCNFMPSWDlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 210, 50));

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
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer-macbook-air-business-desktop.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnmeActionPerformed

    private void fullnmeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullnmeKeyTyped
        char c1 = evt.getKeyChar();
        if(!((Character.isAlphabetic(c1)) || (c1 == KeyEvent.VK_DELETE) || (Character.isLowerCase(c1)) || (Character.isUpperCase(c1)) || (c1 == KeyEvent.VK_BACK_SPACE) || (c1 == KeyEvent.VK_SPACE))){
           updtFNlab.setText("naming is incorrect");
            evt.consume();
        }
        else{
            updtFNlab.setText(null);
          
        }
    }//GEN-LAST:event_fullnmeKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

    }//GEN-LAST:event_emailKeyTyped

    private void updtePswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtePswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updtePswdActionPerformed

    private void updteConfrmPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updteConfrmPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updteConfrmPswdActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        fullnme.setText("");
        email.setText("");
       
        updtePswd.setText("");
        updteConfrmPswd.setText("");
        reset.setSelected(false);

    }//GEN-LAST:event_resetActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        
        String id = (String) UserIdUpdte.getSelectedItem();
        String fn = fullnme.getText();
        String em = email.getText();
        String pswd = updtePswd.getText();
        String pswd1 = updteConfrmPswd.getText();
        
        
        try{
            
            
            
            if((em.equals("") && pswd1.equals("") && pswd.equals("") && fn.equals("")))  {
                  
                    
                     JOptionPane.showMessageDialog(null, "Fileds cannot be empty!");
                    
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
               
            
        
            String sql = "UPDATE user SET full_name = '"+fn+"', email = '"+em+"', password ='"+pswd+"', WHERE id = '"+id+"'";
            
            
                
                pst = conn.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            }
                
            }catch(Exception e){
                
            }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
         String PATTERN = ("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$");
       Pattern patt1 = Pattern.compile(PATTERN);
       Matcher match1 = patt1.matcher(email.getText());
       if(!match1.matches()){
            updteEmlab.setText("Email in incorrect");
       }
       else{
        updteEmlab.setText(null);
            
    }                            
    }//GEN-LAST:event_emailKeyReleased

    private void updtePswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updtePswdKeyReleased
          String PATTERN = ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
       Pattern patt1 = Pattern.compile(PATTERN);
       Matcher match1 = patt1.matcher(updtePswd.getText());
       if(!match1.matches()){
             updtePSWDlab.setText("Password is incorrect");
       }
       else{
           updtePSWDlab.setText(null);
            
    }                           
    }//GEN-LAST:event_updtePswdKeyReleased

    private void updteConfrmPswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updteConfrmPswdKeyReleased
          String pswd = updtePswd.getText();
        String pswd1 = updteConfrmPswd.getText();
        if((!pswd.equals(pswd1))){
                            updteCNFMPSWDlab.setText("Password doesn't match!");
                 }
      else if((pswd.equals(pswd1))){
       updteCNFMPSWDlab.setText("Password matched");
    }                                         
        
    }//GEN-LAST:event_updteConfrmPswdKeyReleased

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
            java.util.logging.Logger.getLogger(UpdateFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    public javax.swing.JComboBox<String> UserIdUpdte;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fullnme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton reset;
    public javax.swing.JLabel updtFNlab;
    public javax.swing.JLabel updteCNFMPSWDlab;
    private javax.swing.JPasswordField updteConfrmPswd;
    public javax.swing.JLabel updteEmlab;
    public javax.swing.JLabel updtePSWDlab;
    private javax.swing.JPasswordField updtePswd;
    // End of variables declaration//GEN-END:variables
}
