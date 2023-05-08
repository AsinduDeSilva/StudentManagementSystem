
package com.icet.sms.view;

import com.icet.sms.controller.StudentController;
import com.icet.sms.model.Student;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ViewStudents extends common {
    private Homepage homepage;
    
    public ViewStudents(Homepage homepage) {
        this.homepage=homepage;
        initComponents();
        setImageTo(imgLabel);
        
        studentTable.getTableHeader().setFont(new Font("",0,18));
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) studentTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
        studentTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        studentTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        studentTable.getColumnModel().getColumn(2).setPreferredWidth(5);
        studentTable.getColumnModel().getColumn(3).setPreferredWidth(5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        homepageBtn = new javax.swing.JButton();
        bestInPrfBtn = new javax.swing.JButton();
        bestInDbmsBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Student Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 373, 44);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 70, 460, 10);

        studentTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "PRF", "DBMS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        studentTable.setRowHeight(20);
        studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(studentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 190, 560, 310);

        homepageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homepageBtn.setText("Home Page");
        homepageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homepageBtn);
        homepageBtn.setBounds(250, 530, 130, 40);

        bestInPrfBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bestInPrfBtn.setText("Best in PRF");
        bestInPrfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestInPrfBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bestInPrfBtn);
        bestInPrfBtn.setBounds(90, 110, 170, 40);

        bestInDbmsBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bestInDbmsBtn.setText("Best in DBMS");
        bestInDbmsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestInDbmsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bestInDbmsBtn);
        bestInDbmsBtn.setBounds(370, 110, 170, 40);
        getContentPane().add(imgLabel);
        imgLabel.setBounds(1, -4, 640, 630);

        setSize(new java.awt.Dimension(640, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homepageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBtnActionPerformed
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_homepageBtnActionPerformed

    private void bestInPrfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestInPrfBtnActionPerformed
        Student[] studentArray=StudentController.getAllStudents();
        for(int i=studentArray.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(studentArray[j+1].getPrf()>studentArray[j].getPrf()){
                    Student temp=studentArray[j+1];
                    studentArray[j+1]=studentArray[j];
                    studentArray[j]=temp;
                }
            }
        }
        DefaultTableModel dtm=(DefaultTableModel) studentTable.getModel();
        dtm.setRowCount(0);
        for(int i=0; i<studentArray.length; i++){
            Object[] rowData={studentArray[i].getId(),studentArray[i].getName(),studentArray[i].getPrf(),studentArray[i].getDbms()};
            dtm.addRow(rowData);
        }
        
    }//GEN-LAST:event_bestInPrfBtnActionPerformed

    private void bestInDbmsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestInDbmsBtnActionPerformed
        Student[] studentArray=StudentController.getAllStudents();
        for(int i=studentArray.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(studentArray[j+1].getDbms()>studentArray[j].getDbms()){
                    Student temp=studentArray[j+1];
                    studentArray[j+1]=studentArray[j];
                    studentArray[j]=temp;
                }
            }
        }
        DefaultTableModel dtm=(DefaultTableModel) studentTable.getModel();
        dtm.setRowCount(0);
        for(int i=0; i<studentArray.length; i++){
            Object[] rowData={studentArray[i].getId(),studentArray[i].getName(),studentArray[i].getPrf(),studentArray[i].getDbms()};
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_bestInDbmsBtnActionPerformed
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestInDbmsBtn;
    private javax.swing.JButton bestInPrfBtn;
    private javax.swing.JButton homepageBtn;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
