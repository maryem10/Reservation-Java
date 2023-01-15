/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;
import service.CategorieService;
import entites.Categorie;
import entites.Chambre;
import entites.Client;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import service.ChamberService;

/**
 *
 * @author pc
 */
public class ChambreForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CategorieForm
     */
    private CategorieService Cats;
    private ChamberService chs;
    private DefaultTableModel Tmodel;
    private static int id;

    public ChambreForm() {
        initComponents();
        Cats = new CategorieService();
        chs = new ChamberService();
        Tmodel = (DefaultTableModel) listeClient.getModel();
        this.setTitle("Gestion des Chambre");
        LoadCate();
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
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_code = new javax.swing.JTextField();
        jButton1Ajouter = new javax.swing.JButton();
        jButton2Modifier = new javax.swing.JButton();
        jButton3Supprimer = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeClient = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3Supprimer1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(95, 40));
        setNormalBounds(new java.awt.Rectangle(0, 0, 95, 0));
        setPreferredSize(new java.awt.Dimension(635, 837));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouveau Chambre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel1.setText("Id");

        jLabel2.setText("Telephone");

        jLabel3.setText("Categorie");

        jTextField1_id.setEnabled(false);

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

        Clear.setText("Statistique");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Chambre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        listeClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Telephone", "Categorie"
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jButton3Supprimer1.setText("find by Categorie");
        jButton3Supprimer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3Supprimer1MouseClicked(evt);
            }
        });
        jButton3Supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Supprimer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jButton3Supprimer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(120, 120, 120)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2_code, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jTextField1_id)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1Ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2Modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                        .addGap(56, 56, 56))))
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
                            .addComponent(jTextField2_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3Supprimer1)
                        .addGap(24, 24, 24)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void LoadCate() {
        for (Categorie C : Cats.findAll()) {
            jComboBox1.addItem(C);

        }
    }
    private void jButton1AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AjouterActionPerformed
        String Fcode = jTextField2_code.getText();
        Categorie chat = (Categorie) jComboBox1.getSelectedItem();
        if (chs.create(new Chambre(Fcode, chat))) {
            JOptionPane.showMessageDialog(this, "votre ligne à été creé");
        }
        load();

    }//GEN-LAST:event_jButton1AjouterActionPerformed

    private void jButton2ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ModifierActionPerformed
        String code = jTextField2_code.getText();
        Categorie chat = (Categorie) jComboBox1.getSelectedItem();
        Chambre c = new Chambre(id, code, chat);

        if (chs.update(c)) {
            JOptionPane.showMessageDialog(this, "votre ligne à été modofié");
        }
        load();
    }//GEN-LAST:event_jButton2ModifierActionPerformed

    private void jButton3SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3SupprimerActionPerformed
        int reponse = JOptionPane.showConfirmDialog(this, "do you really whant delete this row");
        if (reponse == 0) {
            chs.delete(chs.findById(id));
            JOptionPane.showMessageDialog(this, "votre ligne a ete supprimée");
            load();
        }
    }//GEN-LAST:event_jButton3SupprimerActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        String query = "SELECT C.libelle ,COUNT(*) from chambre ch INNER JOIN categorie C where C.id=ch.id_Catégorie GROUP BY id_Catégorie;  ";

        try {
            JDBCCategoryDataset dataser = new JDBCCategoryDataset(connection.Connexion.getCon(), query);
            JFreeChart chart = ChartFactory.createBarChart("Nombre de chambre par Categorie", "categorie", "nb chambre", dataser);
            BarRenderer rend = null;
            CategoryPlot plot = null;
            rend = new BarRenderer();
            ChartFrame frame = new ChartFrame("Statistique", chart);
            frame.setVisible(true);
            frame.setSize(400, 600);

        } catch (SQLException ex) {
            Logger.getLogger(chart1.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*jTextField1_id.setText("");
         jTextField2_code.setText("");
         jTextField3_libelle.setText("");*/
    }//GEN-LAST:event_ClearActionPerformed

    private void listeClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeClientMouseClicked
        id = Integer.parseInt(Tmodel.getValueAt(listeClient.getSelectedRow(), 0).toString());
        jTextField2_code.setText(Tmodel.getValueAt(listeClient.getSelectedRow(), 1).toString());

        jComboBox1.getModel().setSelectedItem(Tmodel.getValueAt(listeClient.getSelectedRow(), 2));
    }//GEN-LAST:event_listeClientMouseClicked

    private void jButton3Supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Supprimer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3Supprimer1ActionPerformed

    private void jButton3Supprimer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3Supprimer1MouseClicked

        if (jComboBox1.getItemCount() < 1) {

            JOptionPane.showMessageDialog(this, "selectionner une categorie");
        }
        Categorie cat = (Categorie) jComboBox1.getSelectedItem();
        //if (cat.getId() < 10 && cat.getId() > 0) {

           
            Tmodel.setRowCount(0);

            for (Chambre ch : chs.findByCategorie(cat)) {
                Tmodel.addRow(new Object[]{
                    ch.getId(),
                    ch.getTelephone(),
                    ch.getCategorie(),});

            }

        //} else 
        //load();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3Supprimer1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButton1Ajouter;
    private javax.swing.JButton jButton2Modifier;
    private javax.swing.JButton jButton3Supprimer;
    private javax.swing.JButton jButton3Supprimer1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_code;
    private javax.swing.JTable listeClient;
    // End of variables declaration//GEN-END:variables

    private void load() {
        Tmodel.setRowCount(0);
        for (Chambre cat : chs.findAll()) {
            Tmodel.addRow(new Object[]{
                cat.getId(),
                cat.getTelephone(),
                cat.getCategorie()});

        }
    }
}
