import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class LibrarianJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentJFrame.class.getName());

    
    public LibrarianJFrame() {
        initComponents();
        Connect();
        LibData();
    }
    
    Connection con;
    PreparedStatement pst;
    
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(LibrarianJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
        
    
    }
    
    private void LibData(){
        
        try {
            int QQ;
            pst = con.prepareStatement("SELECT * FROM librarian");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();

            QQ = RSMD.getColumnCount();
            
            DefaultTableModel DFG =(DefaultTableModel)table1.getModel(); 
            
            DFG.setRowCount(0);
             
            while(Rs.next()){
        
            Vector v2 = new Vector();
             
            for(int aa=1; aa<=QQ; aa++){
                 
                v2.add(Rs.getString("lid"));
                v2.add(Rs.getString("name"));
                v2.add(Rs.getString("email"));
                v2.add(Rs.getString("address"));
             }
             
             DFG.addRow(v2);
        
        }
        } catch (SQLException ex) {
            System.getLogger(LibrarianJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtlid = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtlemail = new javax.swing.JTextField();
        txtladdress = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(842, 550));
        setMinimumSize(new java.awt.Dimension(842, 550));
        setPreferredSize(new java.awt.Dimension(842, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Librarian");

        btnclose.setBackground(new java.awt.Color(0, 0, 0));
        btnclose.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("Close");
        btnclose.addActionListener(this::btncloseActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
                .addComponent(btnclose)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnclose))
                .addGap(8, 8, 8))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        table1.setBackground(new java.awt.Color(0, 0, 0));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LID", "Name", "Email", "Address"
            }
        ));
        table1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table1.setSelectionForeground(new java.awt.Color(13, 13, 13));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 810, 110));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 73, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 82, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        txtlid.setBackground(new java.awt.Color(0, 0, 0));
        txtlid.setForeground(new java.awt.Color(255, 255, 255));
        txtlid.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtlid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, -1));

        txtlname.setBackground(new java.awt.Color(0, 0, 0));
        txtlname.setForeground(new java.awt.Color(255, 255, 255));
        txtlname.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtlname.addActionListener(this::txtlnameActionPerformed);
        getContentPane().add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        txtlemail.setBackground(new java.awt.Color(0, 0, 0));
        txtlemail.setForeground(new java.awt.Color(255, 255, 255));
        txtlemail.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtlemail.addActionListener(this::txtlemailActionPerformed);
        getContentPane().add(txtlemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, -1));

        txtladdress.setBackground(new java.awt.Color(0, 0, 0));
        txtladdress.setForeground(new java.awt.Color(255, 255, 255));
        txtladdress.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, -1));

        btninsert.setBackground(new java.awt.Color(0, 0, 0));
        btninsert.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("Insert");
        btninsert.addActionListener(this::btninsertActionPerformed);
        getContentPane().add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(this::btnupdateActionPerformed);
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(this::btndeleteActionPerformed);
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_7349.JPEG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtlemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlemailActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        try {
            String lid = txtlid.getText();
            String name = txtlname.getText();
            String email = txtlemail.getText();
            String address = txtladdress.getText();
            
            pst = con.prepareStatement("INSERT INTO librarian (lid,name,email,address)VALUES(?,?,?,?)");
            
            pst.setString(1,lid);
            pst.setString(2,name);
            pst.setString(3,email);
            pst.setString(4,address);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            LibData();
        } catch (SQLException ex) {
            System.getLogger(LibrarianJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String lid = txtlid.getText();
            String name = txtlname.getText();
            String email = txtlemail.getText();
            String address = txtladdress.getText();
            
            pst = con.prepareStatement("update librarian set name= ?,email= ?,address= ? where lid= ?");
            
            
            pst.setString(1,name);
            pst.setString(2,email);
            pst.setString(3,address);
            pst.setString(4,lid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            LibData();
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            String lid = txtlid.getText();
            pst=con.prepareStatement("DELETE FROM librarian WHERE lid=?");
            pst.setString(1,lid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            LibData();
        } catch (SQLException ex) {
            System.getLogger(LibrarianJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LibrarianJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtladdress;
    private javax.swing.JTextField txtlemail;
    private javax.swing.JTextField txtlid;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
}
