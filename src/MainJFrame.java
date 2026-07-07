
public class MainJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainJFrame.class.getName());

   
    public MainJFrame() {
        initComponents();
        setExtendedState(MainJFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnstudent = new javax.swing.JButton();
        btnbook = new javax.swing.JButton();
        btnbrrowing = new javax.swing.JButton();
        btnlibrarian = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(828, 464));
        setMinimumSize(new java.awt.Dimension(828, 464));
        setPreferredSize(new java.awt.Dimension(828, 464));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");

        jButton5.setText("Close");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 919, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Infineite realm of knowledge");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 280, 20));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome to the");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        btnstudent.setBackground(new java.awt.Color(0, 0, 0));
        btnstudent.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnstudent.setForeground(new java.awt.Color(255, 255, 255));
        btnstudent.setText("Student");
        btnstudent.addActionListener(this::btnstudentActionPerformed);
        getContentPane().add(btnstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 130, -1));

        btnbook.setBackground(new java.awt.Color(0, 0, 0));
        btnbook.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnbook.setForeground(new java.awt.Color(255, 255, 255));
        btnbook.setText("Book");
        btnbook.addActionListener(this::btnbookActionPerformed);
        getContentPane().add(btnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 130, -1));

        btnbrrowing.setBackground(new java.awt.Color(0, 0, 0));
        btnbrrowing.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnbrrowing.setForeground(new java.awt.Color(255, 255, 255));
        btnbrrowing.setText("Borrowing");
        btnbrrowing.addActionListener(this::btnbrrowingActionPerformed);
        getContentPane().add(btnbrrowing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 130, -1));

        btnlibrarian.setBackground(new java.awt.Color(0, 0, 0));
        btnlibrarian.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        btnlibrarian.setForeground(new java.awt.Color(255, 255, 255));
        btnlibrarian.setText("Librarian");
        btnlibrarian.addActionListener(this::btnlibrarianActionPerformed);
        getContentPane().add(btnlibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_7532.JPEG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
          new StudentJFrame().setVisible(true);
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
       new BookJFrame().setVisible(true);
    }//GEN-LAST:event_btnbookActionPerformed

    private void btnbrrowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrrowingActionPerformed
        new BorrowJFrame().setVisible(true);
    }//GEN-LAST:event_btnbrrowingActionPerformed

    private void btnlibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibrarianActionPerformed
        new LibrarianJFrame().setVisible(true);
    }//GEN-LAST:event_btnlibrarianActionPerformed

   
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
        java.awt.EventQueue.invokeLater(() -> new MainJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnbrrowing;
    private javax.swing.JButton btnlibrarian;
    private javax.swing.JButton btnstudent;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
