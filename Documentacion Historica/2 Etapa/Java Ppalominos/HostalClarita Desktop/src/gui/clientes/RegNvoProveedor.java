/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.clientes;

import Atxy2k.CustomTextField.RestrictedTextField;
import bll.RegistroNuevoProv;
import gui.Principal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author papalominos
 */
public class RegNvoProveedor extends javax.swing.JFrame {

    /**
     * Creates new form RegNvoProveedor
     */
    public RegNvoProveedor() {
        initComponents();
        RestrictedTextField r = new RestrictedTextField(JTrut);
        r.setLimit(9);
        r.setOnlyNums(true);
        RestrictedTextField r2 = new RestrictedTextField(JTnombre);
        r2.setLimit(30);
        r2.setAcceptSpace(true);
        RestrictedTextField r3 = new RestrictedTextField(JTnombreCont);
        r3.setLimit(30);
        r3.setOnlyText(true);
        r3.setAcceptSpace(true);
        RestrictedTextField r4 = new RestrictedTextField(JTmail);
        r4.setLimit(30);
 
        RestrictedTextField r5 = new RestrictedTextField(JTtelCon);
        r.setLimit(9);
        r.setOnlyNums(true);
        RestrictedTextField r6 = new RestrictedTextField(JTtelProv);
        r.setLimit(9);
        r.setOnlyNums(true);       
        
        
        JCrubro.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        try {
            lista = RegistroNuevoProv.ListarRubro();
            for(int i = 0; i<lista.size();i++){
            JCrubro.addItem(lista.get(i));
            }
        } catch (Exception e) {
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        JTrut = new javax.swing.JTextField();
        JTdireccion = new javax.swing.JTextField();
        JTtelProv = new javax.swing.JTextField();
        JTnombreCont = new javax.swing.JTextField();
        JTtelCon = new javax.swing.JTextField();
        JTmail = new javax.swing.JTextField();
        JBRegistrar = new javax.swing.JButton();
        JBvolver = new javax.swing.JButton();
        JCrubro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese Nuevo Proveedor");

        jLabel2.setText("Rut Proveedor");

        jLabel3.setText("Rubro");

        jLabel4.setText("Nombre del Proveedor");

        jLabel5.setText("Direccion Proveedor");

        jLabel6.setText("Telefono de Proveedor");

        jLabel7.setText("Nombre de Contacto");

        jLabel8.setText("Telefono Contacto");

        jLabel9.setText("Mail Contacto");

        JBRegistrar.setText("Registrar Proveedor");
        JBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegistrarActionPerformed(evt);
            }
        });

        JBvolver.setText("Volver");
        JBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(JBRegistrar)
                        .addGap(36, 36, 36)
                        .addComponent(JBvolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTrut)
                                    .addComponent(JTdireccion)
                                    .addComponent(JTtelProv)
                                    .addComponent(JTnombreCont)
                                    .addComponent(JTtelCon)
                                    .addComponent(JTmail)
                                    .addComponent(JCrubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCrubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(JTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTtelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTnombreCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTtelCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRegistrar)
                    .addComponent(JBvolver))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegistrarActionPerformed
        RegistroNuevoProv rnp = new RegistroNuevoProv();
       String r =JCrubro.getItemAt(JCrubro.getSelectedIndex());
        
        try {
            System.out.println("soy el rubro del combo "+r);
            System.out.println("soy el id del rubro"+rnp.obtieneIDrubro(r));
            rnp.NuevoProv( JTrut.getText(), rnp.obtieneIDrubro(r),JTnombre.getText(), JTdireccion.getText(), JTtelProv.getText(), JTnombreCont.getText(), JTtelCon.getText(), JTmail.getText());
            System.out.println("registro OK");
            JTrut.setText("");
            JTnombre.setText("");
            JTdireccion.setText("");
            JTtelProv.setText("");
            JTnombreCont.setText("");
            JTtelCon.setText("");
            JTmail.setText("");
            
     } catch (SQLException ex) {
            Logger.getLogger(RegNvoProveedor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ingreso de nuevo proveedor con problemas");
        }
        
        
       
        
    }//GEN-LAST:event_JBRegistrarActionPerformed

    private void JBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvolverActionPerformed
/*        Principal principal = new Principal();
                principal.setBounds(400, 200, 520, 350);
                principal.setVisible(true);*/
                this.dispose(); 
    }//GEN-LAST:event_JBvolverActionPerformed

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
            java.util.logging.Logger.getLogger(RegNvoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegNvoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegNvoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegNvoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegNvoProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRegistrar;
    private javax.swing.JButton JBvolver;
    private javax.swing.JComboBox<String> JCrubro;
    private javax.swing.JTextField JTdireccion;
    private javax.swing.JTextField JTmail;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTnombreCont;
    private javax.swing.JTextField JTrut;
    private javax.swing.JTextField JTtelCon;
    private javax.swing.JTextField JTtelProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
