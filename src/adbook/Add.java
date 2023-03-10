/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbook;

import java.io.*;

/**
 *
 * @author user
 */
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Add() {
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

        nameAdd = new javax.swing.JLabel();
        emailAdd = new javax.swing.JLabel();
        numberAdd = new javax.swing.JLabel();
        addressName = new javax.swing.JLabel();
        nameViewField = new javax.swing.JTextField();
        emailViewField = new javax.swing.JTextField();
        numberViewField = new javax.swing.JTextField();
        addressViewField = new javax.swing.JTextField();
        addAdd = new javax.swing.JButton();
        backAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Book");

        nameAdd.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        nameAdd.setForeground(new java.awt.Color(0, 0, 102));
        nameAdd.setText("Name");

        emailAdd.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        emailAdd.setForeground(new java.awt.Color(0, 0, 102));
        emailAdd.setText("Email");

        numberAdd.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        numberAdd.setForeground(new java.awt.Color(0, 0, 102));
        numberAdd.setText("Number");

        addressName.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        addressName.setForeground(new java.awt.Color(0, 0, 102));
        addressName.setText("Address");

        nameViewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameViewFieldActionPerformed(evt);
            }
        });

        addAdd.setBackground(new java.awt.Color(255, 102, 102));
        addAdd.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        addAdd.setForeground(new java.awt.Color(0, 0, 102));
        addAdd.setText("Add");
        addAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAddActionPerformed(evt);
            }
        });

        backAdd.setBackground(new java.awt.Color(255, 102, 102));
        backAdd.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        backAdd.setForeground(new java.awt.Color(0, 0, 102));
        backAdd.setText("Back");
        backAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numberAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(addAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameViewFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameViewFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameViewFieldActionPerformed

    private void backAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAddActionPerformed
        this.dispose();
        new AddBook().setVisible(true);
    }//GEN-LAST:event_backAddActionPerformed

    private void addAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAddActionPerformed
        String s1 = nameViewField.getText();
        String s2 = emailViewField.getText();
        String s3 = numberViewField.getText();
        String s4 = addressViewField.getText();
        nameViewField.setText("");
        emailViewField.setText("");
        numberViewField.setText("");
        addressViewField.setText("");
        AddressBook book = new AddressBook();
        File file = new File("data.txt");
        try(BufferedReader buf = new BufferedReader(new FileReader(file))){
            String l;
            while ((l=buf.readLine())!=null){
                String [] details = l.split("-");
                String nam = details[0];
                String e = details[1];
                String num = details[2];
                String a = details[3];
                book.create(new Address(nam,e,num,a));
            }
            book.create(new Address(s1,s2,s3,s4));
        }catch (IOException e){
            e.printStackTrace();
        }
        book.showAdd();
    }//GEN-LAST:event_addAddActionPerformed

    
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdd;
    private javax.swing.JLabel addressName;
    private javax.swing.JTextField addressViewField;
    private javax.swing.JButton backAdd;
    private javax.swing.JLabel emailAdd;
    private javax.swing.JTextField emailViewField;
    private javax.swing.JLabel nameAdd;
    private javax.swing.JTextField nameViewField;
    private javax.swing.JLabel numberAdd;
    private javax.swing.JTextField numberViewField;
    // End of variables declaration//GEN-END:variables
}
