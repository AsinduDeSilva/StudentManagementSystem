package com.icet.sms.view;

import com.icet.sms.controller.StudentController;
import com.icet.sms.model.Student;
import javax.swing.JOptionPane;

public class SearchStudent extends common {
    private Homepage homepage;
    
    public SearchStudent(Homepage homepage) {
        this.homepage=homepage;
        initComponents();
        setImageTo(imgLabel);
        nameTextField.setEditable(false);
        prfTextField.setEditable(false);
        dbmsTextField.setEditable(false);             
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        prfTextField = new javax.swing.JTextField();
        dbmsTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        homepageBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Student Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 380, 50);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 82, 470, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 190, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRF Marks");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 240, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DBMS Marks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 290, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 140, 110, 30);

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(290, 370, 140, 40);

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(260, 140, 80, 30);

        prfTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prfTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prfTextField);
        prfTextField.setBounds(260, 240, 50, 30);

        dbmsTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dbmsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dbmsTextField);
        dbmsTextField.setBounds(260, 290, 50, 30);

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField);
        nameTextField.setBounds(260, 190, 220, 30);

        homepageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homepageBtn.setText("Home Page");
        homepageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homepageBtn);
        homepageBtn.setBounds(120, 370, 140, 40);
        getContentPane().add(imgLabel);
        imgLabel.setBounds(0, 0, 570, 500);

        setSize(new java.awt.Dimension(574, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        idTextField.setText(null);
        idTextField.setEditable(true);
        nameTextField.setText(null);
        prfTextField.setText(null);
        dbmsTextField.setText(null);
        idTextField.requestFocus();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        String id=idTextField.getText();
        if(!isValidId(id)){
            JOptionPane.showMessageDialog(null, "Enter a valid Student ID","Error",JOptionPane.ERROR_MESSAGE);
            idTextField.setText(null);
            return;
        }    
        if(!StudentController.contains(id)){
            JOptionPane.showMessageDialog(null, "Student not added yet!","Error",JOptionPane.ERROR_MESSAGE);
            idTextField.setText(null);
            return;
        }   
        Student student=StudentController.getStudent(id);
        nameTextField.setText(student.getName());
        prfTextField.setText(Integer.toString(student.getPrf()));
        dbmsTextField.setText(Integer.toString(student.getDbms()));
        idTextField.setEditable(false);
        clearBtn.requestFocus();
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void prfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prfTextFieldActionPerformed

    private void dbmsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbmsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbmsTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void homepageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBtnActionPerformed
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_homepageBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField dbmsTextField;
    private javax.swing.JButton homepageBtn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField prfTextField;
    // End of variables declaration//GEN-END:variables
}
