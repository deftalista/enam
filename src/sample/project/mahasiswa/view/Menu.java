/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.project.mahasiswa.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sample.project.mahasiswa.dialog.jurusan.DeleteJurusanDialog;
import sample.project.mahasiswa.dialog.jurusan.InsertJurusanDialog;
import sample.project.mahasiswa.dialog.jurusan.UpdateJurusanDialog;
import sample.project.mahasiswa.dialog.mahasiswa.DeleteMahasiswaDialog;
import sample.project.mahasiswa.dialog.mahasiswa.InsertMahasiswaDialog;
import sample.project.mahasiswa.dialog.mahasiswa.UpdateMahasiswaDialog;


public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jInternalFrameInsert = new javax.swing.JInternalFrame();
        insertMahasiswa1 = new sample.project.mahasiswa.panel.mahasiswa.InsertMahasiswa();
        jInternalFrameUpdate = new javax.swing.JInternalFrame();
        updateMahasiswa1 = new sample.project.mahasiswa.panel.mahasiswa.UpdateMahasiswa();
        jInternalFrameDelete = new javax.swing.JInternalFrame();
        deleteMahasiswa1 = new sample.project.mahasiswa.panel.mahasiswa.DeleteMahasiswa();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInsert = new javax.swing.JMenu();
        jMenuItemInsert = new javax.swing.JMenuItem();
        jMenuItemUpdate = new javax.swing.JMenuItem();
        jMenuItemDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemInsertJurusan = new javax.swing.JMenuItem();
        jMenuItemUpdateJurusan = new javax.swing.JMenuItem();
        jMenuItemDeleteJurusan = new javax.swing.JMenuItem();

        jInternalFrameInsert.setClosable(true);
        jInternalFrameInsert.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameInsert.setIconifiable(true);
        jInternalFrameInsert.setMaximizable(true);
        jInternalFrameInsert.setResizable(true);
        jInternalFrameInsert.setTitle("Insert");
        jInternalFrameInsert.setVisible(true);
        jInternalFrameInsert.getContentPane().add(insertMahasiswa1, java.awt.BorderLayout.CENTER);

        jInternalFrameUpdate.setClosable(true);
        jInternalFrameUpdate.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameUpdate.setIconifiable(true);
        jInternalFrameUpdate.setMaximizable(true);
        jInternalFrameUpdate.setResizable(true);
        jInternalFrameUpdate.setTitle("Update");
        jInternalFrameUpdate.setToolTipText("");
        jInternalFrameUpdate.setVisible(true);
        jInternalFrameUpdate.getContentPane().add(updateMahasiswa1, java.awt.BorderLayout.CENTER);

        jInternalFrameDelete.setClosable(true);
        jInternalFrameDelete.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameDelete.setIconifiable(true);
        jInternalFrameDelete.setMaximizable(true);
        jInternalFrameDelete.setResizable(true);
        jInternalFrameDelete.setTitle("Delete");
        jInternalFrameDelete.setVisible(true);
        jInternalFrameDelete.getContentPane().add(deleteMahasiswa1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButtonInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample/project/mahasiswa/image/insert.png"))); // NOI18N
        jButtonInsert.setFocusable(false);
        jButtonInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInsert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonInsert);

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample/project/mahasiswa/image/update.png"))); // NOI18N
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonUpdate);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample/project/mahasiswa/image/delete.png"))); // NOI18N
        jButtonDelete.setFocusable(false);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonDelete);

        jMenuInsert.setText("File");

        jMenuItemInsert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInsert.setText("Insert");
        jMenuItemInsert.setPreferredSize(new java.awt.Dimension(200, 22));
        jMenuItemInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertActionPerformed(evt);
            }
        });
        jMenuInsert.add(jMenuItemInsert);

        jMenuItemUpdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUpdate.setText("Update");
        jMenuItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateActionPerformed(evt);
            }
        });
        jMenuInsert.add(jMenuItemUpdate);

        jMenuItemDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemDelete.setText("Delete");
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jMenuInsert.add(jMenuItemDelete);

        jMenuBar1.add(jMenuInsert);

        jMenu2.setText("Jurusan");

        jMenuItemInsertJurusan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInsertJurusan.setText("Insert");
        jMenuItemInsertJurusan.setPreferredSize(new java.awt.Dimension(200, 22));
        jMenuItemInsertJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertJurusanActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemInsertJurusan);

        jMenuItemUpdateJurusan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUpdateJurusan.setText("Update");
        jMenuItemUpdateJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateJurusanActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemUpdateJurusan);

        jMenuItemDeleteJurusan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemDeleteJurusan.setText("Delete");
        jMenuItemDeleteJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteJurusanActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDeleteJurusan);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1 == jInternalFrameDelete.getDesktopPane()) {
            jInternalFrameDelete.setVisible(true);
        } else {
            jInternalFrameDelete.setBounds(0, 0, 600, 620);
            jDesktopPane1.add(jInternalFrameDelete);
        }
        try {
            jInternalFrameDelete.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteActionPerformed
        // TODO add your handling code here:
        DeleteMahasiswaDialog deleteDialog = new DeleteMahasiswaDialog(this, true);
        deleteDialog.loadDelete();
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1 == jInternalFrameInsert.getDesktopPane()) {
            jInternalFrameInsert.setVisible(true);
        } else {
            jInternalFrameInsert.setBounds(0, 0, 600, 620);
            jDesktopPane1.add(jInternalFrameInsert);
        }
        try {
            jInternalFrameInsert.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if (jDesktopPane1 == jInternalFrameUpdate.getDesktopPane()) {
            jInternalFrameUpdate.setVisible(true);
        } else {
            jInternalFrameUpdate.setBounds(0, 0, 600, 620);
            jDesktopPane1.add(jInternalFrameUpdate);
        }
        try {
            jInternalFrameUpdate.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jMenuItemInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertActionPerformed
        // TODO add your handling code here:
        InsertMahasiswaDialog insertDialog = new InsertMahasiswaDialog(this, true);
        insertDialog.loadInsert();
    }//GEN-LAST:event_jMenuItemInsertActionPerformed

    private void jMenuItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateActionPerformed
        // TODO add your handling code here:
        UpdateMahasiswaDialog updateDialog = new UpdateMahasiswaDialog(this, true);
        updateDialog.loadUpdate();
    }//GEN-LAST:event_jMenuItemUpdateActionPerformed

    private void jMenuItemInsertJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertJurusanActionPerformed
        // TODO add your handling code here:
        InsertJurusanDialog insertJurusanDialog = new InsertJurusanDialog(this, true);
        insertJurusanDialog.loadInsertjurusan();
    }//GEN-LAST:event_jMenuItemInsertJurusanActionPerformed

    private void jMenuItemUpdateJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateJurusanActionPerformed
        // TODO add your handling code here:
        UpdateJurusanDialog updateJurusanDialog = new UpdateJurusanDialog(this, true);
        updateJurusanDialog.loadUpdateJurusan();
    }//GEN-LAST:event_jMenuItemUpdateJurusanActionPerformed

    private void jMenuItemDeleteJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteJurusanActionPerformed
        // TODO add your handling code here:
        DeleteJurusanDialog deleteJurusanDialog = new DeleteJurusanDialog(this, true);
        deleteJurusanDialog.loadDeleteJurusan();
    }//GEN-LAST:event_jMenuItemDeleteJurusanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sample.project.mahasiswa.panel.mahasiswa.DeleteMahasiswa deleteMahasiswa1;
    private sample.project.mahasiswa.panel.mahasiswa.InsertMahasiswa insertMahasiswa1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameDelete;
    private javax.swing.JInternalFrame jInternalFrameInsert;
    private javax.swing.JInternalFrame jInternalFrameUpdate;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInsert;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemDeleteJurusan;
    private javax.swing.JMenuItem jMenuItemInsert;
    private javax.swing.JMenuItem jMenuItemInsertJurusan;
    private javax.swing.JMenuItem jMenuItemUpdate;
    private javax.swing.JMenuItem jMenuItemUpdateJurusan;
    private javax.swing.JToolBar jToolBar1;
    private sample.project.mahasiswa.panel.mahasiswa.UpdateMahasiswa updateMahasiswa1;
    // End of variables declaration//GEN-END:variables
}
