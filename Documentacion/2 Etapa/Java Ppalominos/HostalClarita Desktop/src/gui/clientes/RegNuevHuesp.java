/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.clientes;

import Atxy2k.CustomTextField.RestrictedTextField;
import bll.RegistroNuevoHuespedBLL;
import gui.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author papalominos
 */
public class RegNuevHuesp extends javax.swing.JFrame {

    /**
     * Creates new form RegNuevHuesp
     */
    public RegNuevHuesp() {
        initComponents();
        
        RestrictedTextField r = new RestrictedTextField(JTrut);
        r.setLimit(9);
        r.setOnlyNums(true);
        RestrictedTextField r2 = new RestrictedTextField(JTfnac);
        r2.setOnlyNums(true);
        r2.setLimit(8);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        JTapm = new javax.swing.JTextField();
        JTapp = new javax.swing.JTextField();
        JTrut = new javax.swing.JTextField();
        JTmail = new javax.swing.JTextField();
        JBregistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTfnac = new javax.swing.JTextField();
        JCgenero = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro Nuevo Huesped");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Apellido Paterno");

        jLabel5.setText("RUT");

        jLabel6.setText("Fecha Nacimiento");

        jLabel7.setText("E-Mail");

        jLabel8.setText("Genero");

        JTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTnombreActionPerformed(evt);
            }
        });
        JTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTnombreKeyTyped(evt);
            }
        });

        JTapm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTapmKeyTyped(evt);
            }
        });

        JTapp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTappKeyTyped(evt);
            }
        });

        JTrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTrutActionPerformed(evt);
            }
        });
        JTrut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTrutKeyTyped(evt);
            }
        });

        JTmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTmailKeyTyped(evt);
            }
        });

        JBregistrar.setText("Registrar Huesped");
        JBregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBregistrarActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JTfnac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTfnacKeyTyped(evt);
            }
        });

        JCgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "P" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTapp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTrut)
                                .addComponent(JTmail)
                                .addComponent(JTnombre)
                                .addComponent(JTfnac)
                                .addComponent(JCgenero, 0, 112, Short.MAX_VALUE))
                            .addComponent(JTapm, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(JBregistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBregistrar)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTnombreKeyTyped
    int max = 20;
    if(JTnombre.getText().length() > max)
    {
        JOptionPane.showMessageDialog(rootPane,"Maximo 20 caracteres");
    }
    }//GEN-LAST:event_JTnombreKeyTyped

    private void JTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnombreActionPerformed

    private void JTapmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTapmKeyTyped
int max = 20;
    if(JTapm.getText().length() > max)
    {
        JOptionPane.showMessageDialog(rootPane,"Maximo 20 caracteres");
    }        
    }//GEN-LAST:event_JTapmKeyTyped

    private void JTappKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTappKeyTyped
int max = 20;
    if(JTapp.getText().length() > max)
    {
        JOptionPane.showMessageDialog(rootPane,"Maximo 20 caracteres");
    }   
    }//GEN-LAST:event_JTappKeyTyped

    private void JTrutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTrutKeyTyped

    }//GEN-LAST:event_JTrutKeyTyped

    private void JTfnacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTfnacKeyTyped
   
    }//GEN-LAST:event_JTfnacKeyTyped

    private void JTmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTmailKeyTyped
int max = 20;
    if(JTapm.getText().length() > max)
    {
        JOptionPane.showMessageDialog(rootPane,"Maximo 20 caracteres");
    }           // TODO add your handling code here:
    }//GEN-LAST:event_JTmailKeyTyped

    private void JBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBregistrarActionPerformed
        RegistroNuevoHuespedBLL rnh = new RegistroNuevoHuespedBLL();
        //String genero
        try {
            rnh.CrearNuevoHuesped(JTnombre.getText(),JTapp.getText(),JTapm.getText(),JTrut.getText(),JTfnac.getText(),JTmail.getText(),JCgenero.getSelectedItem().toString());
            System.out.println("insercion correcta desde pantalla");
            JTnombre.setText("");
            JTapp.setText("");
            JTapm.setText("");
            JTrut.setText("");
            JTfnac.setText("");
            JTmail.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(RegNuevHuesp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error en la insercion por pantalla");
        }
    }//GEN-LAST:event_JBregistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                Principal principal = new Principal();
                principal.setBounds(400, 200, 520, 350);
                principal.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTrutActionPerformed

    }//GEN-LAST:event_JTrutActionPerformed

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
            java.util.logging.Logger.getLogger(RegNuevHuesp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegNuevHuesp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegNuevHuesp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegNuevHuesp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegNuevHuesp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBregistrar;
    private javax.swing.JComboBox<String> JCgenero;
    private javax.swing.JTextField JTapm;
    private javax.swing.JTextField JTapp;
    private javax.swing.JTextField JTfnac;
    private javax.swing.JTextField JTmail;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTrut;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}