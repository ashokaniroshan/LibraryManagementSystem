import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class StudentJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentJFrame.class.getName());

    
    public StudentJFrame() {
        initComponents();
        Connect();
        StudentData();
    }
    
    Connection con;
    PreparedStatement pst;
    
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
        
    
    }
    
    private void StudentData(){
        
        try {
            int QQ;
            pst = con.prepareStatement("SELECT * FROM student");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();

            QQ = RSMD.getColumnCount();
            
            DefaultTableModel DFG =(DefaultTableModel)table1.getModel(); 
            
            DFG.setRowCount(0);
             
            while(Rs.next()){
        
            Vector v2 = new Vector();
             
            for(int aa=1; aa<=QQ; aa++){
                 
                v2.add(Rs.getString("studentid"));
                v2.add(Rs.getString("studentname"));
                v2.add(Rs.getString("email"));
                v2.add(Rs.getString("address"));
             }
             
             DFG.addRow(v2);
        
        }
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
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
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btntotal = new javax.swing.JButton();
        txtsum1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(842, 550));
        setMinimumSize(new java.awt.Dimension(842, 550));
        setPreferredSize(new java.awt.Dimension(842, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Students");

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
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 599, Short.MAX_VALUE)
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
        table1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Email", "Address"
            }
        ));
        table1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table1.setSelectionForeground(new java.awt.Color(13, 13, 13));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 810, 120));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 73, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 82, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        txtid.setBackground(new java.awt.Color(0, 0, 0));
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setCaretColor(new java.awt.Color(255, 255, 255));
        txtid.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 150, 160, -1));

        txtname.setBackground(new java.awt.Color(0, 0, 0));
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setCaretColor(new java.awt.Color(255, 255, 255));
        txtname.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtname.addActionListener(this::txtnameActionPerformed);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 180, 160, -1));

        txtemail.setBackground(new java.awt.Color(0, 0, 0));
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtemail.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtemail.addActionListener(this::txtemailActionPerformed);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 210, 160, -1));

        txtaddress.setBackground(new java.awt.Color(0, 0, 0));
        txtaddress.setForeground(new java.awt.Color(255, 255, 255));
        txtaddress.setCaretColor(new java.awt.Color(255, 255, 255));
        txtaddress.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 240, 160, -1));

        btninsert.setBackground(new java.awt.Color(0, 0, 0));
        btninsert.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("Insert");
        btninsert.addActionListener(this::btninsertActionPerformed);
        getContentPane().add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(this::btnupdateActionPerformed);
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(this::btndeleteActionPerformed);
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        btntotal.setBackground(new java.awt.Color(0, 0, 0));
        btntotal.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btntotal.setForeground(new java.awt.Color(255, 255, 255));
        btntotal.setText("Total Students");
        btntotal.addActionListener(this::btntotalActionPerformed);
        getContentPane().add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        txtsum1.setBackground(new java.awt.Color(0, 0, 0));
        txtsum1.setForeground(new java.awt.Color(255, 255, 255));
        txtsum1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtsum1.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtsum1.addActionListener(this::txtsum1ActionPerformed);
        getContentPane().add(txtsum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 115, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_7349.JPEG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        try {
            String studentid = txtid.getText();
            String studentname = txtname.getText();
            String email = txtemail.getText();
            String address = txtaddress.getText();
            
            pst = con.prepareStatement("INSERT INTO student (studentid,studentname,email,address)VALUES(?,?,?,?)");
            
            pst.setString(1,studentid);
            pst.setString(2,studentname);
            pst.setString(3,email);
            pst.setString(4,address);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            StudentData();
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String studentid = txtid.getText();
            String studentname = txtname.getText();
            String email = txtemail.getText();
            String address = txtaddress.getText();
            
            pst = con.prepareStatement("update student set studentname= ?,email= ?,address= ? where studentid= ?");
            
            
            pst.setString(1,studentname);
            pst.setString(2,email);
            pst.setString(3,address);
            pst.setString(4,studentid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            StudentData();
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            String studentid = txtid.getText();
            pst=con.prepareStatement("DELETE FROM student WHERE studentid=?");
            pst.setString(1,studentid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            StudentData();
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtsum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsum1ActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        try {
            String sql="select count(studentname) from student";
            pst=con.prepareStatement(sql);
            ResultSet Rs = pst.executeQuery();
            if(Rs.next()){
                String sum=Rs.getString("count(studentname)");
                txtsum1.setText(sum);
            }
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btntotalActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new StudentJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btntotal;
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
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsum1;
    // End of variables declaration//GEN-END:variables
}
