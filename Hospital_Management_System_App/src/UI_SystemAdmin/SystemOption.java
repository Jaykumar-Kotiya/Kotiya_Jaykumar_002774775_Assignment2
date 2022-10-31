/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_SystemAdmin;

import UI_Patient.CreatePatient;
import UI_Patient.ViewPatient;
import UI_Person.CreatePerson;
import UI_Person.ViewPerson;

/**
 *
 * @author jkoti
 */
public class SystemOption extends javax.swing.JFrame {

    /**
     * Creates new form SystemOption
     */
    public SystemOption() {
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

        jPanel1 = new javax.swing.JPanel();
        systemLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnViewPersonDirectory = new javax.swing.JButton();
        btnviewPatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditPatient = new javax.swing.JButton();
        btnEditPersonDirectory = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        systemLable.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkoti\\Downloads\\icons8-system-administrator-male-64.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("System Administrator");

        btnViewPersonDirectory.setBackground(new java.awt.Color(153, 153, 153));
        btnViewPersonDirectory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnViewPersonDirectory.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPersonDirectory.setText("View Person Directory");
        btnViewPersonDirectory.setRolloverEnabled(false);
        btnViewPersonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonDirectoryActionPerformed(evt);
            }
        });

        btnviewPatient.setBackground(new java.awt.Color(153, 153, 153));
        btnviewPatient.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnviewPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnviewPatient.setText("View Patient Directory");
        btnviewPatient.setRolloverEnabled(false);
        btnviewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewPatientActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkoti\\Downloads\\icons8-patient-100.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkoti\\Downloads\\icons8-person-100.png")); // NOI18N

        btnEditPatient.setBackground(new java.awt.Color(153, 153, 153));
        btnEditPatient.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnEditPatient.setText("Edit");
        btnEditPatient.setRolloverEnabled(false);
        btnEditPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPatientActionPerformed(evt);
            }
        });

        btnEditPersonDirectory.setBackground(new java.awt.Color(153, 153, 153));
        btnEditPersonDirectory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditPersonDirectory.setForeground(new java.awt.Color(255, 255, 255));
        btnEditPersonDirectory.setText("Edit");
        btnEditPersonDirectory.setRolloverEnabled(false);
        btnEditPersonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPersonDirectoryActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setRolloverEnabled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(systemLable)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewPersonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnviewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditPersonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systemLable, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnviewPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditPatient))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnViewPersonDirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditPersonDirectory)
                        .addGap(1, 1, 1)))
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPersonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonDirectoryActionPerformed
        ViewPerson obj=new ViewPerson();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViewPersonDirectoryActionPerformed

    private void btnviewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewPatientActionPerformed
        ViewPatient obj=new ViewPatient();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnviewPatientActionPerformed

    private void btnEditPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPatientActionPerformed
        CreatePatient obj=new CreatePatient();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditPatientActionPerformed

    private void btnEditPersonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPersonDirectoryActionPerformed
        CreatePerson obj=new CreatePerson();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditPersonDirectoryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SystemAdminOption obj=new SystemAdminOption();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(SystemOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditPatient;
    private javax.swing.JButton btnEditPersonDirectory;
    private javax.swing.JButton btnViewPersonDirectory;
    private javax.swing.JButton btnviewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel systemLable;
    // End of variables declaration//GEN-END:variables
}
