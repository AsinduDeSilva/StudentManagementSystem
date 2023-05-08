package com.icet.sms.view;

import com.icet.sms.controller.StudentController;
import com.icet.sms.model.Student;
import javax.swing.JOptionPane;

public class AddNewStudent extends common {
    private Homepage homepage;
    
    public AddNewStudent(Homepage homepage) {
        this.homepage=homepage;
        initComponents();
        setImageTo(imgLabel);
        nameTextField.setEditable(false);
        prfTextField.setEditable(false);
        dbmsTextField.setEditable(false);
    }
    
    private void clear(){
        idTextField.setEditable(true);
        nameTextField.setEditable(false);
        prfTextField.setEditable(false);
        dbmsTextField.setEditable(false);
        idTextField.setText(null);
        nameTextField.setText(null);
        prfTextField.setText(null);
        dbmsTextField.setText(null);
        addStudentBtn.setEnabled(false);
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
        homePageBtn = new javax.swing.JButton();
        prfTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        dbmsTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        addStudentBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Student Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 341, 58);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 80, 427, 11);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 200, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRF Marks");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 260, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DBMS marks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 320, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 110, 30);

        homePageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homePageBtn.setText("Home Page");
        homePageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homePageBtn);
        homePageBtn.setBounds(180, 450, 130, 40);

        prfTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prfTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prfTextField);
        prfTextField.setBounds(210, 260, 50, 30);

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField);
        nameTextField.setBounds(210, 200, 220, 30);

        dbmsTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dbmsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dbmsTextField);
        dbmsTextField.setBounds(210, 320, 50, 30);

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(210, 140, 90, 30);

        addStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addStudentBtn.setText("Add Student");
        addStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentBtn.setEnabled(false);
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentBtn);
        addStudentBtn.setBounds(110, 390, 130, 40);

        clearBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(260, 390, 130, 40);
        getContentPane().add(imgLabel);
        imgLabel.setBounds(0, 0, 520, 540);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 520);

        setSize(new java.awt.Dimension(517, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageBtnActionPerformed
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_homePageBtnActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        String id=idTextField.getText();
        System.out.println(id);
        if(!isValidId(id)){
            JOptionPane.showMessageDialog(null, "Enter a valid Student ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }  
        if(StudentController.contains(id)){
            System.out.println("exists");
            JOptionPane.showMessageDialog(null, "Student Id already exists","Error",JOptionPane.ERROR_MESSAGE);
            idTextField.setText(null);
            return;
        } 
        //System.out.println(StudentController.contains("S0004"));
        
        idTextField.setEditable(false);
        nameTextField.setEditable(true);
        nameTextField.requestFocus();

        
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        prfTextField.setEditable(true);
        prfTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        boolean isAdded=StudentController.addStudent(new Student(idTextField.getText(),nameTextField.getText(),Integer.parseInt(prfTextField.getText()),Integer.parseInt(dbmsTextField.getText())));
        if(isAdded){
            JOptionPane.showMessageDialog(null, "Student added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Error","Error",JOptionPane.ERROR_MESSAGE);
        }
        clear();
    }//GEN-LAST:event_addStudentBtnActionPerformed

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
        addStudentBtn.requestFocus();
        addStudentBtn.setEnabled(true);
    }//GEN-LAST:event_dbmsTextFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField dbmsTextField;
    private javax.swing.JButton homePageBtn;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField prfTextField;
    // End of variables declaration//GEN-END:variables
}
