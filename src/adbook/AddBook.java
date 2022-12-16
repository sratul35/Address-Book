/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbook;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */


class Address implements Comparable{
    private String name;
    private String email;
    private String number;
    private String stAddress;
    public Address(String name, String email, String number, String stAddress) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.stAddress = stAddress;
    }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getNumber() { return number; }
    public String getStAddress() { return stAddress; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setNumber(String number) { this.number = number; }
    public void setStAddress(String stAddress) { this.stAddress = stAddress; }
    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Address)o).getName());
    }
}

class AddressBook{
    ArrayList<Address> book;
    public AddressBook() {
        this.book = new ArrayList<>();
    }
    public void create(Address newAddress) {
        book.add(newAddress);
    }
    public void sorting(){
        Collections.sort(book);
    }
    public void show(){
        File output = new File("output.txt");
        try (PrintWriter writer = new PrintWriter(output)){
            for(Address x: book){
                writer.println(x.getName() + "-" + x.getEmail() + "-" + x.getNumber() + "-" + x.getStAddress());
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void showAdd(){
        File output = new File("data.txt");
        try(PrintWriter writer = new PrintWriter(output)){
            for(Address x : book){
                writer.println(x.getName() + "-" + x.getEmail() + "-" + x.getNumber() + "-" + x.getStAddress());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void search(String s){
        File output = new File("search.txt");
        try(PrintWriter writer = new PrintWriter(output)){
            int flag = 1;
            for(Address x : book){
                if(x.getName().equals(s) || x.getEmail().equals(s) || x.getNumber().equals(s) || x.getStAddress().equals(s)){
                    flag = 0;
                    writer.println(x.getName() + "-" + x.getEmail() + "-" + x.getNumber() + "-" + x.getStAddress());
                }
            }
            if (flag == 1){
                JOptionPane.showMessageDialog(null,"Sorry, Sir. We can 't find anyone with your providing data.");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void editSearch(String s){
        int flag = 1;
        for (Address x: book){
            if(x.getName().equals(s) || x.getEmail().equals(s) || x.getNumber().equals(s) || x.getStAddress().equals(s)){
                flag = 0;
                JOptionPane.showMessageDialog(null,"We found the data of that you want to edit");
            }
        }
        if (flag == 1){
            JOptionPane.showMessageDialog(null,"Sorry, Sir. We can 't find anyone with your providing data.");
        }
    }

    public void edit(String s1, String s2, String s3 ,String s4,String s5){
         try {
             FileWriter fileWriter = new FileWriter("data.txt",false);
             PrintWriter printWriter = new PrintWriter(fileWriter,false);
             printWriter.flush();
             printWriter.close();
         }catch (IOException e){ e.printStackTrace();}
        File out = new File("data.txt");
        try(PrintWriter writer = new PrintWriter(out)){
            for(Address x : book){
                if(s5.equals(x.getName())){
                    writer.println(s1 + "-" + x.getEmail() + "-" + x.getNumber() + "-" + x.getStAddress());
                }
                else if(s5.equals(x.getEmail())){
                    writer.println(x.getName() + "-" + s2 + "-" + x.getNumber() + "-" + x.getStAddress());
                }
                else if(s5.equals(x.getNumber())){
                    writer.println(x.getName() + "-" + x.getEmail() + "-" + s3 + "-" + x.getStAddress());
                }
                else if (s5.equals(x.getStAddress())){
                    writer.println(x.getName() + "-" + x.getEmail() + "-" + x.getNumber() + "-" + s4);
                }
                else{
                    writer.println(x.getName() + "-" + x.getEmail() + "-" + x.getNumber() + "-" + x.getStAddress());
                }
            }
        }catch (IOException e){e.printStackTrace();}
    }
}

public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        jLabel1 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Address Book");
        setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Address Book");

        view.setBackground(new java.awt.Color(255, 102, 102));
        view.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        view.setForeground(new java.awt.Color(0, 0, 102));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 102, 102));
        add.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 153));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 102, 102));
        edit.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 0, 102));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(255, 102, 102));
        search.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 102));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        this.dispose();
        new View().setVisible(true);
    }//GEN-LAST:event_viewActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.dispose();
        new Add().setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        this.dispose();
        new Edit().setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        this.dispose();
        new Search().setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton search;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
