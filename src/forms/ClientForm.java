/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;
import service.ClientService;
import entites.Client;
import entites.emailValidator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class ClientForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientForm
     */
    
    private ClientService Cs;
    private DefaultTableModel Tmodel;
    private static int id;
    private emailValidator emailValidator = new emailValidator();
    public ClientForm() {
      
        initComponents();
        Cs = new ClientService();
        Tmodel= (DefaultTableModel)listeClient.getModel();
        this.setTitle("Gestion des Clients");
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_nom = new javax.swing.JTextField();
        jTextField3_telephone = new javax.swing.JTextField();
        jTextField4_email = new javax.swing.JTextField();
        jButton1Ajouter = new javax.swing.JButton();
        jButton2Modifier = new javax.swing.JButton();
        jButton3Supprimer = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeClient = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouveau Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel1.setText("Id");

        jLabel2.setText("Nom");

        jLabel3.setText("Telephone");

        jLabel4.setText("Email");

        jTextField1_id.setEnabled(false);

        jTextField4_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4_emailFocusLost(evt);
            }
        });

        jButton1Ajouter.setText("Ajouter");
        jButton1Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AjouterActionPerformed(evt);
            }
        });

        jButton2Modifier.setText("Modifier");
        jButton2Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ModifierActionPerformed(evt);
            }
        });

        jButton3Supprimer.setText("Supprimer");
        jButton3Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3SupprimerActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jTextField3_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_nom)
                            .addComponent(jTextField1_id)
                            .addComponent(jTextField4_email))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1Ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2Modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Ajouter)
                            .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jButton2Modifier)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3Supprimer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        listeClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Telephone", "Email"
            }
        ));
        listeClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeClient);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3SupprimerActionPerformed
        int reponse = JOptionPane.showConfirmDialog(this, "do you really whant delete this row");
        if (reponse==0){
            Cs.delete(Cs.findById(id));
            JOptionPane.showMessageDialog(this, "votre ligne a ete supprimée");
            load();
        }
    }//GEN-LAST:event_jButton3SupprimerActionPerformed

    private void jButton1AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AjouterActionPerformed
         String Fnom = jTextField2_nom.getText();;
         
        String Ftelephone = jTextField3_telephone.getText();
        String Femail = jTextField4_email.getText();
        
        if(!emailValidator.validate(Femail.trim())){
        JOptionPane.showMessageDialog(this, "format incorrect");
        }else 
       if(Cs.create(new Client(Fnom, Ftelephone, Femail))){
            JOptionPane.showMessageDialog(this, closable);}
       load();
    }//GEN-LAST:event_jButton1AjouterActionPerformed

    private void listeClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeClientMouseClicked
       id= Integer.parseInt(Tmodel.getValueAt(listeClient.getSelectedRow(),0).toString());
       jTextField1_id.setText(Tmodel.getValueAt(listeClient.getSelectedRow(),0).toString());
       jTextField2_nom.setText(Tmodel.getValueAt(listeClient.getSelectedRow(),1).toString());
       jTextField3_telephone.setText(Tmodel.getValueAt(listeClient.getSelectedRow(),2).toString());
       jTextField4_email.setText(Tmodel.getValueAt(listeClient.getSelectedRow(),3).toString());
    }//GEN-LAST:event_listeClientMouseClicked

    private void jButton2ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ModifierActionPerformed
        String nom = jTextField2_nom.getText();
        String telephone = jTextField3_telephone.getText();
        String email = jTextField4_email.getText();
        Client cl = Cs.findById(id);
        cl.setEmail(email);cl.setNom(nom);cl.setTelephone(telephone);
        if(Cs.update(cl)){
        JOptionPane.showMessageDialog(this, "votre ligne à été modofié");
        }
        load();

    }//GEN-LAST:event_jButton2ModifierActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jTextField1_id.setText("");
        jTextField2_nom.setText("");
        jTextField3_telephone.setText("");
        jTextField4_email.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jTextField4_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4_emailFocusGained
        
    }//GEN-LAST:event_jTextField4_emailFocusGained

    private void jTextField4_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_emailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButton1Ajouter;
    private javax.swing.JButton jButton2Modifier;
    private javax.swing.JButton jButton3Supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_nom;
    private javax.swing.JTextField jTextField3_telephone;
    private javax.swing.JTextField jTextField4_email;
    private javax.swing.JTable listeClient;
    // End of variables declaration//GEN-END:variables

    private void load() {
        
        Tmodel.setRowCount(0);
        for(Client cl: Cs.findAll()){
            Tmodel.addRow(new Object[]{
            cl.getId(),
            cl.getNom(),
            cl.getTelephone(),
            cl.getEmail()});
        }
    }
}