package com.icet.sms.view;

import com.icet.sms.controller.StudentController;
import com.icet.sms.model.Student;
import javax.swing.JOptionPane;

public class UpdateStudent extends common {
    private Homepage homepage;
    
    public UpdateStudent(Homepage homepage) {
        this.homepage=homepage;
        initComponents();
        setImageTo(imgLabel);
        nameTextField.setEditable(false);
        prfTextField.setEditable(false);
        dbmsTextField.setEditable(false);
        updateBtn.setEnabled(false);
    }
    
    private void clear(){
        idTextField.setText(null);
        idTextField.setEditable(true);
        nameTextField.setText(null);
        prfTextField.setText(null);
        dbmsTextField.setText(null);
        idTextField.requestFocus();
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
        nameTextField = new javax.swing.JTextField();
        prfTextField = new javax.swing.JTextField();
        dbmsTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        homepageBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Student Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 400, 46);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 80, 450, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 190, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRF Marks");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 240, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DBMS Marks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 290, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 130, 30);

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField);
        nameTextField.setBounds(270, 190, 200, 30);

        prfTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prfTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prfTextField);
        prfTextField.setBounds(270, 240, 50, 30);

        dbmsTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dbmsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dbmsTextField);
        dbmsTextField.setBounds(270, 290, 50, 30);

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(270, 140, 80, 30);

        homepageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homepageBtn.setText("Home Page");
        homepageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homepageBtn);
        homepageBtn.setBounds(210, 430, 130, 40);

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn);
        updateBtn.setBounds(130, 370, 130, 40);

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(290, 370, 130, 40);
        getContentPane().add(imgLabel);
        imgLabel.setBounds(0, 0, 560, 510);

        setSize(new java.awt.Dimension(564, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homepageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBtnActionPerformed
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_homepageBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        boolean isUpdated=StudentController.updateStudent(new Student(idTextField.getText(),nameTextField.getText(),Integer.parseInt(prfTextField.getText()),Integer.parseInt(dbmsTextField.getText())));
        if(isUpdated){
            JOptionPane.showMessageDialog(null, "Student updated successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }    
        clear();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
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
        nameTextField.setEditable(true);
        nameTextField.requestFocus();
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        nameTextField.setEditable(false);
        prfTextField.setEditable(true);
        prfTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void prfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prfTextFieldActionPerformed
        if(prfTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter marks","Success",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int prfMarks=Integer.parseInt(prfTextField.getText());
        if(prfMarks<0 || prfMarks>100){
            JOptionPane.showMessageDialog(null, "Invalid marks!!!","Error",JOptionPane.ERROR_MESSAGE);
            prfTextField.setText(null);
            return;
        }
        prfTextField.setEditable(false);
        dbmsTextField.setEditable(true);
        dbmsTextField.requestFocus();
    }//GEN-LAST:event_prfTextFieldActionPerformed

    private void dbmsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbmsTextFieldActionPerformed
        if(dbmsTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter marks.","Success",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int dbmsMarks=Integer.parseInt(dbmsTextField.getText());
        if(dbmsMarks<0 || dbmsMarks>100){
            JOptionPane.showMessageDialog(null, "Invalid marks!!!","Error",JOptionPane.ERROR_MESSAGE);
            dbmsTextField.setText(null);
            return;
        }
        dbmsTextField.setEditable(false);
        updateBtn.requestFocus();
        updateBtn.setEnabled(true);
    }//GEN-LAST:event_dbmsTextFieldActionPerformed

    
    


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
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
