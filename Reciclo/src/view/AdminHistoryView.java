
package view;

/**
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */
public class AdminHistoryView extends javax.swing.JFrame {

    /**
     * Creates new form AdminHistoryView
     */
    public AdminHistoryView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new view.projectButton();
        btnBuscaView = new view.projectButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new view.projectButton();
        jLabel3 = new javax.swing.JLabel();
        btn = new view.projectButton();
        btn1 = new view.projectButton();
        projectTextField2 = new model.projectTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(80, 80, 80));
        btnExit.setBorder(null);
        btnExit.setForeground(new java.awt.Color(206, 240, 157));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnExit.setColor(new java.awt.Color(80, 80, 80));
        btnExit.setColorClick(new java.awt.Color(206, 240, 157));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setRadius(30);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        btnBuscaView.setBackground(new java.awt.Color(80, 80, 80));
        btnBuscaView.setBorder(null);
        btnBuscaView.setForeground(new java.awt.Color(206, 240, 157));
        btnBuscaView.setText("Busca por ID");
        btnBuscaView.setColor(new java.awt.Color(80, 80, 80));
        btnBuscaView.setColorClick(new java.awt.Color(206, 240, 157));
        btnBuscaView.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscaView.setRadius(30);
        btnBuscaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaView, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 160, 50));

        jLabel1.setBackground(new java.awt.Color(80, 80, 80));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 205, 96));
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel2.setBackground(new java.awt.Color(80, 80, 80));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setText("Bem vindo,");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        btnRegister.setBackground(new java.awt.Color(80, 80, 80));
        btnRegister.setBorder(null);
        btnRegister.setForeground(new java.awt.Color(206, 240, 157));
        btnRegister.setText("Cadastrar Admin");
        btnRegister.setColor(new java.awt.Color(80, 80, 80));
        btnRegister.setColorClick(new java.awt.Color(206, 240, 157));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegister.setRadius(30);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 205, 96));
        jLabel3.setText("RA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btn.setBackground(new java.awt.Color(60, 60, 60));
        btn.setBorder(null);
        btn.setForeground(new java.awt.Color(206, 240, 157));
        btn.setColor(new java.awt.Color(60, 60, 60));
        btn.setColorClick(new java.awt.Color(206, 240, 157));
        btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn.setRadius(30);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel1.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, 50));

        btn1.setBackground(new java.awt.Color(60, 60, 60));
        btn1.setBorder(null);
        btn1.setForeground(new java.awt.Color(206, 240, 157));
        btn1.setColor(new java.awt.Color(60, 60, 60));
        btn1.setColorClick(new java.awt.Color(206, 240, 157));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn1.setRadius(30);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 50, 50));

        projectTextField2.setBackground(new java.awt.Color(60, 60, 60));
        projectTextField2.setForeground(new java.awt.Color(160, 205, 96));
        projectTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        projectTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(projectTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 50));

        jSeparator1.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator1.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 440, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

    }//GEN-LAST:event_btnActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //TODO    
        // Botão exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBuscaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaViewActionPerformed

    }//GEN-LAST:event_btnBuscaViewActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHistoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btn;
    private view.projectButton btn1;
    private view.projectButton btnBuscaView;
    private view.projectButton btnExit;
    private view.projectButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private model.projectTextField projectTextField2;
    // End of variables declaration//GEN-END:variables
}
