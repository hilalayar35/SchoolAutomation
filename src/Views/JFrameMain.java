/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.Locale;

/**
 *
 * 
 */
public class JFrameMain extends javax.swing.JFrame {

    JInternalFrameStudentAdd jInternalFrameStudentAdd;
    
    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
        this.setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAddAccount = new javax.swing.JMenu();
        jMenuItemAddAccount = new javax.swing.JMenuItem();
        jMenuItemAddCourses = new javax.swing.JMenuItem();
        jMenuItemAddInstructorOfCourse = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemListAccount = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(167, 210, 240));
        getContentPane().add(jDesktopPane, java.awt.BorderLayout.CENTER);

        jMenuAddAccount.setText("Records");

        jMenuItemAddAccount.setText("Add Account");
        jMenuItemAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddAccountActionPerformed(evt);
            }
        });
        jMenuAddAccount.add(jMenuItemAddAccount);

        jMenuItemAddCourses.setText("Add Courses");
        jMenuItemAddCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCoursesActionPerformed(evt);
            }
        });
        jMenuAddAccount.add(jMenuItemAddCourses);

        jMenuItemAddInstructorOfCourse.setText("Add Instructor Of Course");
        jMenuItemAddInstructorOfCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddInstructorOfCourseActionPerformed(evt);
            }
        });
        jMenuAddAccount.add(jMenuItemAddInstructorOfCourse);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuAddAccount.add(jMenuItemExit);

        jMenuBar.add(jMenuAddAccount);

        jMenu2.setText("Lists");

        jMenuItemListAccount.setText("List Account");
        jMenuItemListAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListAccountActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemListAccount);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddAccountActionPerformed

        
        if (jInternalFrameStudentAdd == null || jInternalFrameStudentAdd.isClosed()) {
            jInternalFrameStudentAdd = new JInternalFrameStudentAdd();
            jDesktopPane.add(jInternalFrameStudentAdd);
            jInternalFrameStudentAdd.setVisible(true);
        } else {
            jInternalFrameStudentAdd.setLocation(this.getWidth()/2-jInternalFrameStudentAdd.getWidth()/2, 
                    this.getHeight()/2-jInternalFrameStudentAdd.getHeight()/2);
            jInternalFrameStudentAdd.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItemAddAccountActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemListAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListAccountActionPerformed
        JInternalFrameAccountList jInternalFrameAccountList = new JInternalFrameAccountList();
        if (!jInternalFrameAccountList.isVisible()) {
            jDesktopPane.add(jInternalFrameAccountList);
            jInternalFrameAccountList.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemListAccountActionPerformed

    private void jMenuItemAddCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCoursesActionPerformed
        JInternalFrameCoursesAdd jInternalFrameCoursesAdd = new JInternalFrameCoursesAdd();
        if (!jInternalFrameCoursesAdd.isVisible()) {
            jDesktopPane.add(jInternalFrameCoursesAdd);
            jInternalFrameCoursesAdd.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemAddCoursesActionPerformed

    private void jMenuItemAddInstructorOfCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddInstructorOfCourseActionPerformed
        JInternalFrameInstructionOfCourseAdd jInternalFrameInstructionOfCourseAdd = new JInternalFrameInstructionOfCourseAdd();
        
        if (!jInternalFrameInstructionOfCourseAdd.isVisible()) {
            jDesktopPane.add(jInternalFrameInstructionOfCourseAdd);
            jInternalFrameInstructionOfCourseAdd.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemAddInstructorOfCourseActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAddAccount;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemAddAccount;
    private javax.swing.JMenuItem jMenuItemAddCourses;
    private javax.swing.JMenuItem jMenuItemAddInstructorOfCourse;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemListAccount;
    // End of variables declaration//GEN-END:variables
}
