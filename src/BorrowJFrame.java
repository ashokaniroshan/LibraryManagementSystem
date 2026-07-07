import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class BorrowJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BorrowJFrame.class.getName());

    
    public BorrowJFrame() {
        initComponents();
        Connect();
        BorrowData();
    }
    
    Connection con;
    PreparedStatement pst;
    
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/librarydb","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(BorrowJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
        
    
    }
    
    private void BorrowData(){
        
        try {
            int QQ;
            pst = con.prepareStatement("SELECT * FROM borrow");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();

            QQ = RSMD.getColumnCount();
            
            DefaultTableModel DFG =(DefaultTableModel)table1.getModel(); 
            
            DFG.setRowCount(0);
             
            while(Rs.next()){
        
            Vector v2 = new Vector();
             
            for(int aa=1; aa<=QQ; aa++){
                 
                v2.add(Rs.getString("bid"));
                v2.add(Rs.getString("studentname"));
                v2.add(Rs.getString("book"));
                v2.add(Rs.getString("date_borrowed"));
                v2.add(Rs.getString("date_return"));
             }
             
             DFG.addRow(v2);
        
        }
        } catch (SQLException ex) {
            System.getLogger(BorrowJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
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
        txbid = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        txtbook = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        datechooser1 = new com.toedter.calendar.JDateChooser();
        datechooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        txtsum3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(842, 550));
        setMinimumSize(new java.awt.Dimension(842, 550));
        setPreferredSize(new java.awt.Dimension(842, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Borrowing");

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
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(btnclose)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnclose))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        table1.setBackground(new java.awt.Color(0, 0, 0));
        table1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BID", "Student Name", "Book", "Date Borrowed", "Date Return"
            }
        ));
        table1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table1.setSelectionForeground(new java.awt.Color(13, 13, 13));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 810, 120));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 73, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("StudentName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 82, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Borrow");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        txbid.setBackground(new java.awt.Color(0, 0, 0));
        txbid.setForeground(new java.awt.Color(255, 255, 255));
        txbid.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));

        txtsname.setBackground(new java.awt.Color(0, 0, 0));
        txtsname.setForeground(new java.awt.Color(255, 255, 255));
        txtsname.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 140, -1));

        txtbook.setBackground(new java.awt.Color(0, 0, 0));
        txtbook.setForeground(new java.awt.Color(255, 255, 255));
        txtbook.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtbook.addActionListener(this::txtbookActionPerformed);
        getContentPane().add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        btninsert.setBackground(new java.awt.Color(0, 0, 0));
        btninsert.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("Insert");
        btninsert.addActionListener(this::btninsertActionPerformed);
        getContentPane().add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(this::btnupdateActionPerformed);
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(this::btndeleteActionPerformed);
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        datechooser1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(datechooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, -1));

        datechooser2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(datechooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Return");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btntotal.setBackground(new java.awt.Color(0, 0, 0));
        btntotal.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btntotal.setForeground(new java.awt.Color(255, 255, 255));
        btntotal.setText("Total Borrowing");
        btntotal.addActionListener(this::btntotalActionPerformed);
        getContentPane().add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        txtsum3.setBackground(new java.awt.Color(0, 0, 0));
        txtsum3.setForeground(new java.awt.Color(255, 255, 255));
        txtsum3.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtsum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_7349.JPEG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        try {
            String bid = txbid.getText();
            String studentname = txtsname.getText();
            String book = txtbook.getText();
            
            
            pst = con.prepareStatement("INSERT INTO borrow (bid,studentname,book,date_borrowed,date_return)VALUES(?,?,?,?,?)");
            
            pst.setString(1,bid);
            pst.setString(2,studentname);
            pst.setString(3,book);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_borrowed = sdf.format(datechooser1.getDate());
            String date_return = sdf.format(datechooser2.getDate());
            pst.setString(4,date_borrowed);
            pst.setString(5,date_return);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            BorrowData();
        } catch (SQLException ex) {
            System.getLogger(StudentJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String bid = txbid.getText();
            String studentname = txtsname.getText();
            String book = txtbook.getText();
           
            
            pst = con.prepareStatement("update borrow set studentname= ?,book= ?,date_borrowed= ?,date_return= ? where bid= ?");
            
            
            pst.setString(1,studentname);
            pst.setString(2,book);
            pst.setString(5,bid);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_borrowed = sdf.format(datechooser1.getDate());
            String date_return = sdf.format(datechooser2.getDate());
            pst.setString(3,date_borrowed);
            pst.setString(4,date_return);
           
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            BorrowData();
        } catch (SQLException ex) {
            System.getLogger(BorrowJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            String bid = txbid.getText();
            pst=con.prepareStatement("DELETE FROM borrow WHERE bid=?");
            pst.setString(1,bid);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            BorrowData();
        } catch (SQLException ex) {
            System.getLogger(BorrowJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        try {
            String sql="select count(studentname) from borrow";
            pst=con.prepareStatement(sql);
            ResultSet Rs = pst.executeQuery();
            if(Rs.next()){
                String sum=Rs.getString("count(studentname)");
                txtsum3.setText(sum);
            }
        } catch (SQLException ex) {
            System.getLogger(BorrowJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btntotalActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new BorrowJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton btnupdate;
    private com.toedter.calendar.JDateChooser datechooser1;
    private com.toedter.calendar.JDateChooser datechooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txbid;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txtsum3;
    // End of variables declaration//GEN-END:variables

  
}
