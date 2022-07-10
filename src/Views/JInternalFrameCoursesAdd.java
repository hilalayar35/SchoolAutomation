/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CoursesController;
import Models.CoursesDbModel;
import Models.DatabaseModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gurkay
 */
public class JInternalFrameCoursesAdd extends javax.swing.JInternalFrame {

    CoursesController coursesController = new CoursesController();
    CoursesDbModel coursesDbModel = new CoursesDbModel();

    /**
     * Creates new form JInternalFrameCoursesAdd
     */
    public JInternalFrameCoursesAdd() {
        initComponents();
        showCourses();
    }

    /**
     * Show All Courses
     */
    public void showCourses() {

        CoursesDbModel coursesDbModel = new CoursesDbModel();

        List<Object[]> result = coursesDbModel.coursesShowAllRecord();

        String arrayHeader[] = {"Courses ID", "Courses Name", "Courses Credit", "Courses Code"};
        DefaultTableModel table = new DefaultTableModel(arrayHeader, 0);
        for (Object[] courses : result) {
            table.addRow(courses);
        }
        tblCoursesList.setModel(table);
        jScrollPaneCoursesList.setViewportView(tblCoursesList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRecordButtonSet = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlCoursesInfo = new javax.swing.JPanel();
        lblCoursesId = new javax.swing.JLabel();
        lblCoursesName = new javax.swing.JLabel();
        txtCoursesName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtCoursesCredit = new javax.swing.JTextField();
        lblCoursesCode = new javax.swing.JLabel();
        txtCoursesCode = new javax.swing.JTextField();
        lblCoursesId1 = new javax.swing.JLabel();
        pnlCoursesInfo1 = new javax.swing.JPanel();
        jScrollPaneCoursesList = new javax.swing.JScrollPane();
        tblCoursesList = new javax.swing.JTable();

        setClosable(true);

        pnlRecordButtonSet.setBackground(new java.awt.Color(244, 130, 17));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        javax.swing.GroupLayout pnlRecordButtonSetLayout = new javax.swing.GroupLayout(pnlRecordButtonSet);
        pnlRecordButtonSet.setLayout(pnlRecordButtonSetLayout);
        pnlRecordButtonSetLayout.setHorizontalGroup(
            pnlRecordButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecordButtonSetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlRecordButtonSetLayout.setVerticalGroup(
            pnlRecordButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecordButtonSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecordButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCoursesInfo.setBackground(new java.awt.Color(222, 171, 123));

        lblCoursesId.setText("Courses Id");

        lblCoursesName.setText("Courses Name");

        lblLastName.setText("Courses Credit");

        lblCoursesCode.setText("Courses Code");

        lblCoursesId1.setText("Courses Id");

        javax.swing.GroupLayout pnlCoursesInfoLayout = new javax.swing.GroupLayout(pnlCoursesInfo);
        pnlCoursesInfo.setLayout(pnlCoursesInfoLayout);
        pnlCoursesInfoLayout.setHorizontalGroup(
            pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoursesInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCoursesId1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCoursesName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCoursesCode, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56)
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCoursesCode)
                    .addComponent(txtCoursesName)
                    .addGroup(pnlCoursesInfoLayout.createSequentialGroup()
                        .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCoursesCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoursesId))
                        .addGap(0, 146, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCoursesInfoLayout.setVerticalGroup(
            pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoursesInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursesId)
                    .addComponent(lblCoursesId1))
                .addGap(18, 18, 18)
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoursesName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastName)
                    .addComponent(txtCoursesCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCoursesInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCoursesCode)
                    .addComponent(txtCoursesCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pnlCoursesInfo1.setBackground(new java.awt.Color(222, 171, 123));

        tblCoursesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCoursesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCoursesListMouseClicked(evt);
            }
        });
        jScrollPaneCoursesList.setViewportView(tblCoursesList);

        javax.swing.GroupLayout pnlCoursesInfo1Layout = new javax.swing.GroupLayout(pnlCoursesInfo1);
        pnlCoursesInfo1.setLayout(pnlCoursesInfo1Layout);
        pnlCoursesInfo1Layout.setHorizontalGroup(
            pnlCoursesInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoursesInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCoursesList)
                .addContainerGap())
        );
        pnlCoursesInfo1Layout.setVerticalGroup(
            pnlCoursesInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoursesInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCoursesList, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCoursesInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRecordButtonSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCoursesInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCoursesInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlRecordButtonSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlCoursesInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        coursesController.setCoursesName(txtCoursesName.getText());
        coursesController.setCoursesCredit(Short.parseShort(txtCoursesCredit.getText()));
        coursesController.setCoursesCode(txtCoursesCode.getText());

        coursesDbModel.coursesRecord(coursesController);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (Integer.parseInt(lblCoursesId.getText()) > 0) {

            coursesController.setCoursesId(Integer.parseInt(lblCoursesId.getText()));
            coursesController.setCoursesName(txtCoursesName.getText());
            coursesController.setCoursesCredit(Short.parseShort(txtCoursesCredit.getText()));
            coursesController.setCoursesCode(txtCoursesCode.getText());
            coursesDbModel.updateCourseRecord(coursesController);

            JOptionPane.showMessageDialog(null, "Update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblCoursesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCoursesListMouseClicked
        try {

            int selectedRow = tblCoursesList.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblCoursesList.getModel();

            lblCoursesId.setText(model.getValueAt(selectedRow, 0).toString());
            txtCoursesName.setText(model.getValueAt(selectedRow, 1).toString());
            txtCoursesCredit.setText(model.getValueAt(selectedRow, 2).toString());
            txtCoursesCode.setText(model.getValueAt(selectedRow, 3).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }//GEN-LAST:event_tblCoursesListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPaneCoursesList;
    private javax.swing.JLabel lblCoursesCode;
    public javax.swing.JLabel lblCoursesId;
    public javax.swing.JLabel lblCoursesId1;
    private javax.swing.JLabel lblCoursesName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JPanel pnlCoursesInfo;
    private javax.swing.JPanel pnlCoursesInfo1;
    private javax.swing.JPanel pnlRecordButtonSet;
    private javax.swing.JTable tblCoursesList;
    public javax.swing.JTextField txtCoursesCode;
    public javax.swing.JTextField txtCoursesCredit;
    public javax.swing.JTextField txtCoursesName;
    // End of variables declaration//GEN-END:variables
}