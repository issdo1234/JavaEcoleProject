/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fenetre extends javax.swing.JFrame {
    ArrayList <Etudiant> etudiants = new ArrayList<>();
    DefaultTableModel model;
    public Fenetre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableauEtudiant = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bntajouter = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        btnsuprimer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtchercher = new javax.swing.JTextField();
        btnchercher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));

        tableauEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N Inscripstion", "Nom", "Prenom", "Age"
            }
        ));
        tableauEtudiant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauEtudiantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableauEtudiant);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Nom");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("prenom");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 40, -1));
        jPanel2.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });
        jPanel2.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, -1));
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 90, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        bntajouter.setText("Ajouter");
        bntajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntajouterActionPerformed(evt);
            }
        });

        btnmodifier.setText("modifier");
        btnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierActionPerformed(evt);
            }
        });

        btnsuprimer.setText("suprimer");
        btnsuprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmodifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsuprimer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(bntajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntajouter)
                .addGap(18, 18, 18)
                .addComponent(btnmodifier)
                .addGap(18, 18, 18)
                .addComponent(btnsuprimer)
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));

        jLabel4.setText("chercher un eleve :");

        txtchercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchercherActionPerformed(evt);
            }
        });

        btnchercher.setText("chercher");
        btnchercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtchercher)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnchercher))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtchercher, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnchercher)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomActionPerformed

    private void txtchercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchercherActionPerformed

    private void bntajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntajouterActionPerformed
        ajouterEtudiant();
    }//GEN-LAST:event_bntajouterActionPerformed

    private void btnsuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuprimerActionPerformed
        model = (DefaultTableModel)tableauEtudiant.getModel();
        int ligne = tableauEtudiant.getSelectedRow();
        if (ligne!=-1){
            etudiants.remove(ligne);
            model.removeRow(ligne);
            viderChamps();
        }
        
    }//GEN-LAST:event_btnsuprimerActionPerformed

    private void btnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierActionPerformed
        model = (DefaultTableModel)tableauEtudiant.getModel();
        int ligne = tableauEtudiant.getSelectedRow();
        if (ligne!=-1){
            model.setValueAt(txtnom.getText(), ligne, 1);
            model.setValueAt(txtprenom.getText(), ligne, 2);
            model.setValueAt(txtage.getText(), ligne, 3);
            etudiants.get(ligne).setNom(txtnom.getText());
            etudiants.get(ligne).setPrenom(txtprenom.getText());
            etudiants.get(ligne).setAge(Integer.valueOf(txtage.getText()));
        }
    }//GEN-LAST:event_btnmodifierActionPerformed

    private void tableauEtudiantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauEtudiantMouseClicked
        model = (DefaultTableModel)tableauEtudiant.getModel();
        int ligne = tableauEtudiant.getSelectedRow();
        if (ligne!=-1){
            txtnom.setText(etudiants.get(ligne).getNom());
            txtprenom.setText(etudiants.get(ligne).getPrenom());
            txtage.setText(String.valueOf(etudiants.get(ligne).getAge()));
        }
    }//GEN-LAST:event_tableauEtudiantMouseClicked

    private void btnchercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchercherActionPerformed
        model = (DefaultTableModel)tableauEtudiant.getModel();
        boolean trouve = false; 
        int indice=0;
        if(txtchercher.getText().equals("")){
        JOptionPane.showMessageDialog(this, " Entrez un nom !", "Champ de recherche vide", JOptionPane.ERROR_MESSAGE);
        }
        else{
        String nomChercher =txtchercher.getText();
        for (int i=0;i<etudiants.size();i++){
            Etudiant e = etudiants.get(i);
            if(nomChercher.equals(e.getNom())){
            trouve = true;
            indice=i;
            break;
            }
        }
        
    }//GEN-LAST:event_btnchercherActionPerformed
    if(trouve){
        txtnom.setText(etudiants.get(indice).getNom());
        txtprenom.setText(etudiants.get(indice).getPrenom());
        txtage.setText(String.valueOf(etudiants.get(indice).getAge()));
        tableauEtudiant.setRowSelectionInterval(indice, indice);
     }
    else{
        JOptionPane.showMessageDialog(this, "Cet eleve n'existe pas !", "eleve non trouver", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    
    
    private void viderChamps() {
        txtnom.setText("");
        txtprenom.setText("");
        txtage.setText("");
        txtnom.requestFocus();
    }
    
    
    
    private void ajouterEtudiant() {
        model = (DefaultTableModel)tableauEtudiant.getModel();
        boolean ajout = true;
        if(txtnom.getText().equals("")||txtprenom.getText().equals("")||txtage.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Remplissez tous les champs Svp !","Champs vides" , JOptionPane.ERROR_MESSAGE);
            ajout = false;
        }
        for(Etudiant e:etudiants){
         if(e.getNom().equals(txtnom.getText())&&e.getPrenom().equals(txtprenom.getText())&&e.getAge()==Integer.valueOf(txtage.getText()))
         {JOptionPane.showMessageDialog(this, "Cet eleve est deja inscrit", "Eleve inscrit", JOptionPane.ERROR_MESSAGE);
         ajout=false;
                viderChamps();
}
         
         }
        if (ajout){
        Etudiant etudiant = new Etudiant(txtnom.getText(),txtprenom.getText(),Integer.valueOf(txtage.getText()));
        etudiants.add(etudiant);
        model.addRow(new Object[]{
        etudiant.getInscription(),etudiant.getNom(),etudiant.getPrenom(),etudiant.getAge()
        });
            viderChamps();
        
        }
    }
   
    
    
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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fenetre f = new Fenetre();
                f.setTitle("Gestion Etudiant");
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntajouter;
    private javax.swing.JButton btnchercher;
    private javax.swing.JButton btnmodifier;
    private javax.swing.JButton btnsuprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableauEtudiant;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtchercher;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables

    
}
