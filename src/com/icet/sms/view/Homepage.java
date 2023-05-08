package com.icet.sms.view;

import com.icet.sms.controller.StudentController;
import com.icet.sms.model.Student;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Homepage extends common {
    public Homepage() {
        setTitle("Homepage");
        initComponents();
        setImageTo(imgLabel);
        
        ImageIcon img=new ImageIcon(getClass().getResource("/resources/Homepage.png"));
        Image image=img.getImage();
        Image imgScale=image.getScaledInstance(img2Label.getWidth(),img2Label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImg=new ImageIcon(imgScale);
        img2Label.setIcon(scaledImg);
        
        StudentController.addStudent(new Student("S0001","Asindu",50,10));
        StudentController.addStudent(new Student("S0002","Kamal",70,40));
        StudentController.addStudent(new Student("S0003","Amal",60,90));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        updateStudentBtn = new javax.swing.JButton();
        viewStudentBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        searchStudentBtn = new javax.swing.JButton();
        img2Label = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Management System");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 10, 490, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(600, 90, 490, 10);

        updateStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateStudentBtn.setText("Update Student");
        updateStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudentBtn);
        updateStudentBtn.setBounds(740, 210, 220, 40);

        viewStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewStudentBtn.setText("View Student List");
        viewStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewStudentBtn);
        viewStudentBtn.setBounds(740, 280, 220, 40);

        addStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addStudentBtn.setText("Add Student");
        addStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentBtn);
        addStudentBtn.setBounds(740, 140, 220, 40);

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(980, 500, 90, 30);

        deleteStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteStudentBtn.setText("Delete Student");
        deleteStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteStudentBtn);
        deleteStudentBtn.setBounds(740, 420, 220, 40);

        searchStudentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchStudentBtn.setText("Search Student");
        searchStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchStudentBtn);
        searchStudentBtn.setBounds(740, 350, 220, 40);
        getContentPane().add(img2Label);
        img2Label.setBounds(0, 0, 560, 590);
        getContentPane().add(imgLabel);
        imgLabel.setBounds(560, 0, 570, 590);

        setSize(new java.awt.Dimension(1130, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        new AddNewStudent(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void viewStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentBtnActionPerformed
        new ViewStudents(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_viewStudentBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        new DeleteStudent(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void searchStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentBtnActionPerformed
        new SearchStudent(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_searchStudentBtnActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        new UpdateStudent(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_updateStudentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel img2Label;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton searchStudentBtn;
    private javax.swing.JButton updateStudentBtn;
    private javax.swing.JButton viewStudentBtn;
    // End of variables declaration//GEN-END:variables
}
