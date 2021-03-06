
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmLogin.java
 *
 * Created on Jul 16, 2011, 7:32:25 PM
 */
/**
 *
 * @author user
 */
public class frmLogin extends javax.swing.JFrame {

    /** Creates new form frmLogin */
    public frmLogin() {
        initComponents();
        OriginalColor();
        setLocationRelativeTo(null);

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        cmdOK = new javax.swing.JButton();
        cmdCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setModalExclusionType(null);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Password :");

        txtUsername.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        cmdOK.setText("OK");
        cmdOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdOKMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdOKMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmdOKMouseReleased(evt);
            }
        });
        cmdOK.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdOKMouseMoved(evt);
            }
        });
        cmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOKActionPerformed(evt);
            }
        });

        cmdCancel.setText("Cancel");
        cmdCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdCancel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdCancelMouseMoved(evt);
            }
        });
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdOK)
                    .addComponent(cmdCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
         txtUsername.setBackground(Color.GRAY);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
       txtUsername.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtUsernameFocusLost

    private void cmdOKMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdOKMouseMoved
        cmdOK.setBackground(Color.GRAY);
    }//GEN-LAST:event_cmdOKMouseMoved

    private void cmdCancelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCancelMouseMoved
        cmdCancel.setBackground(Color.GRAY);
    }//GEN-LAST:event_cmdCancelMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
       OriginalColor();
    }//GEN-LAST:event_formMouseMoved

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOKActionPerformed
      //  LogMe();
    }//GEN-LAST:event_cmdOKActionPerformed

    private void cmdOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdOKMouseClicked
       // LogMe();
    }//GEN-LAST:event_cmdOKMouseClicked

    private void cmdOKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdOKMousePressed
        LogMe();
    }//GEN-LAST:event_cmdOKMousePressed

    private void cmdOKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdOKMouseReleased
       // LogMe();
    }//GEN-LAST:event_cmdOKMouseReleased

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed
  
    public void LogMe(){
    String sql1 = "";
    String sql2 = "";
    try {
       clsConnection conn = new clsConnection();
       Connection connect = clsConnection.conn;
       Statement stm = connect.createStatement();
       String use, pass;
       use = " Where Username = '"+ txtUsername.getText().toString().trim() +"'";
       pass = " And Username = '"+ String.valueOf(txtPassword.getPassword()).toString().trim() +"'";
       sql1 = "Select count(*) from tblUserAccount "+ use+pass;
       sql2 = "select * from tblUserAccount "+ use+pass;
       ResultSet rs1, rs2;

       rs1 = stm.executeQuery(sql1);
       String type;
       int num = 0;
       if (rs1.next()) {
        num = Integer.parseInt(rs1.getString(1).trim());
       }
       if (num > 0) {
           frmMain mn = new frmMain();
           mn.UserType = "";
            int i = 0;
            rs2 = stm.executeQuery(sql2);
            int rowStudents = 0;
            while (rs2.next()){
                type = rs2.getString(5).toString();
                if(type.equals("ADMINISTRATOR"))
                    JOptionPane.showMessageDialog(null, "You Logged as Adminisrator.", "Access Granted", JOptionPane.INFORMATION_MESSAGE);
                else if(type.equals("USER"))
                    JOptionPane.showMessageDialog(null, "You Logged as User.", "Access Granted", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                mn.show();
           }
       }
       else
           JOptionPane.showMessageDialog(null, "Invalid Username or Password.\n Access Denied!", "Access Denied", JOptionPane.ERROR_MESSAGE);
    connect.close();
    }catch (SQLException sqlException){
     JOptionPane.showMessageDialog(getContentPane(),"Error in database connection"+sqlException,"sqlException",JOptionPane.ERROR_MESSAGE);

    }
    }
    public void OriginalColor()
    {
        cmdCancel.setBackground(Color.LIGHT_GRAY);
        cmdOK.setBackground(Color.LIGHT_GRAY);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancel;
    private javax.swing.JButton cmdOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
