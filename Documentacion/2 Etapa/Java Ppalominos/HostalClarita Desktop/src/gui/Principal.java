/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.clientes.CantUserReg;
import gui.clientes.RegNuevEmp;
import gui.clientes.RegNuevHuesp;
import gui.clientes.RegNuevoProd;
import gui.clientes.RegNvoProveedor;
import gui.clientes.RegiNuevHab;
import gui.clientes.Registro;
import gui.clientes.RegistroHab;
import gui.clientes.ServicioComedor;
import gui.reserva.ListadoReservas;
import gui.reserva.IngresoReservas; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author papalominos
 */
public class Principal extends javax.swing.JFrame {

    
    private String NombreUsuario;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
    public Principal(String _nombreusuario) {
        initComponents();
        JLuser.setText(_nombreusuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        JLuser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regCliente = new javax.swing.JMenuItem();
        regNvaHabitacion = new javax.swing.JMenuItem();
        regHuesped = new javax.swing.JMenuItem();
        regProveedor = new javax.swing.JMenuItem();
        regProducto = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        regOrdenPedido = new javax.swing.JMenuItem();
        regRecepcion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        listReservas = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        JMempCreadas = new javax.swing.JMenuItem();
        JMhabCreadas = new javax.swing.JMenuItem();
        JMRegistroComidorFull = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menu_Reserva = new javax.swing.JMenu();
        mitem_ListReservaEmpresa = new javax.swing.JMenuItem();
        mitem_IngresoReserva = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido ");

        JLuser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jMenu1.setText("Registro");

        regCliente.setText("Registro Nueva Empresas");
        regCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regClienteActionPerformed(evt);
            }
        });
        jMenu1.add(regCliente);

        regNvaHabitacion.setText("Registro Nueva Habitacion");
        regNvaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNvaHabitacionActionPerformed(evt);
            }
        });
        jMenu1.add(regNvaHabitacion);

        regHuesped.setText("Rergistro Huesped");
        regHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(regHuesped);

        regProveedor.setText("Rergistro Proveedor");
        regProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regProveedorActionPerformed(evt);
            }
        });
        jMenu1.add(regProveedor);

        regProducto.setText("Registro Producto");
        regProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regProductoActionPerformed(evt);
            }
        });
        jMenu1.add(regProducto);

        jMenuItem7.setText("Registro Orden de Compra");
        jMenuItem7.setEnabled(false);
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Registro de Empleado");
        jMenuItem8.setEnabled(false);
        jMenu1.add(jMenuItem8);

        regOrdenPedido.setText("Registro Orden de Pedido");
        regOrdenPedido.setEnabled(false);
        regOrdenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regOrdenPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(regOrdenPedido);

        regRecepcion.setText("Registro de Recepcion");
        regRecepcion.setEnabled(false);
        jMenu1.add(regRecepcion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informes");

        jMenuItem1.setText("Visitas al Sitio Web");
        jMenuItem1.setEnabled(false);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Cantidad de Usuarios Registrados ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        listReservas.setText("Cantidad de Reservas");
        listReservas.setEnabled(false);
        listReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listReservasActionPerformed(evt);
            }
        });
        jMenu2.add(listReservas);

        jMenuItem4.setText("Cantidad de Huespedes Actual");
        jMenuItem4.setEnabled(false);
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cantidad de Huespedes Atendidos");
        jMenuItem5.setEnabled(false);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        JMempCreadas.setText("Registro Empresas Creadas");
        JMempCreadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMempCreadasActionPerformed(evt);
            }
        });
        jMenu2.add(JMempCreadas);

        JMhabCreadas.setText("Registro Habitaciones Creadas");
        JMhabCreadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMhabCreadasActionPerformed(evt);
            }
        });
        jMenu2.add(JMhabCreadas);

        JMRegistroComidorFull.setText("Registro Servicio Comedor");
        JMRegistroComidorFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRegistroComidorFullActionPerformed(evt);
            }
        });
        jMenu2.add(JMRegistroComidorFull);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Modulos");

        jMenuItem6.setText("Administracion de Facturacion");
        jMenuItem6.setEnabled(false);
        jMenu3.add(jMenuItem6);

        jMenuItem9.setText("Administracion de Hostal");
        jMenuItem9.setEnabled(false);
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Administracion Orden de Venta");
        jMenuItem10.setEnabled(false);
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        menu_Reserva.setText("Reservas");

        mitem_ListReservaEmpresa.setText("Listado Reservas por Empresa");
        mitem_ListReservaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_ListReservaEmpresaActionPerformed(evt);
            }
        });
        menu_Reserva.add(mitem_ListReservaEmpresa);

        mitem_IngresoReserva.setText("Ingreso Reserva");
        mitem_IngresoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_IngresoReservaActionPerformed(evt);
            }
        });
        menu_Reserva.add(mitem_IngresoReserva);

        jMenuBar1.add(menu_Reserva);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLuser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLuser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNombreUsuario() {
        return this.NombreUsuario;
    }
    
    public void setNombreUsuario(String _nombreusuario) {
        this.NombreUsuario = _nombreusuario;
    }
    
    private void regClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regClienteActionPerformed
    RegNuevEmp rne;
    rne = new RegNuevEmp();
    rne.setBounds(400, 200, 700, 400);
       rne.setVisible(true);
      // this.dispose();
      
    }//GEN-LAST:event_regClienteActionPerformed

    private void regNvaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNvaHabitacionActionPerformed
       RegiNuevHab rnh;
       rnh = new RegiNuevHab();
       rnh.setBounds(400, 200, 700, 400);
       rnh.setVisible(true);
       //this.dispose();           
    }//GEN-LAST:event_regNvaHabitacionActionPerformed

    private void regOrdenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regOrdenPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regOrdenPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CantUserReg r;
        r = new CantUserReg();
        r.setBounds(400, 200, 700, 400);
        r.setVisible(true);
      // this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void JMempCreadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMempCreadasActionPerformed
           Registro registro;
        try {
            registro = new Registro();
            registro.setBounds(400, 200, 700, 400);
            registro.setVisible(true);
        this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMempCreadasActionPerformed

    private void JMhabCreadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMhabCreadasActionPerformed
             RegistroHab registroHab;
        try {
            registroHab = new RegistroHab();
             registroHab.setBounds(400, 200, 700, 400);
            registroHab.setVisible(true);
        this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMhabCreadasActionPerformed

    private void regHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regHuespedActionPerformed
        RegNuevHuesp registrohuesp;
        registrohuesp = new RegNuevHuesp();
        registrohuesp.setBounds(400, 200, 700, 400);
        registrohuesp.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_regHuespedActionPerformed

    private void JMRegistroComidorFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRegistroComidorFullActionPerformed
         ServicioComedor servicioComedor;
        try {
            servicioComedor = new ServicioComedor();
            servicioComedor.setBounds(400, 200, 700, 400);
            servicioComedor.setVisible(true);
             this.dispose();
        } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMRegistroComidorFullActionPerformed

    private void regProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regProveedorActionPerformed
        RegNvoProveedor regNvoProveedor;
        try {
            regNvoProveedor = new RegNvoProveedor();
            regNvoProveedor.setBounds(400, 200, 700, 400);
            regNvoProveedor.setVisible(true);
            // this.dispose();
        } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regProveedorActionPerformed


    private void regProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regProductoActionPerformed
        RegNuevoProd nprod;
        nprod = new RegNuevoProd();
            nprod.setBounds(400, 200, 700, 400);
            nprod.setVisible(true);
    }//GEN-LAST:event_regProductoActionPerformed

    private void listReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listReservasActionPerformed
        
    }//GEN-LAST:event_listReservasActionPerformed

    private void mitem_ListReservaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_ListReservaEmpresaActionPerformed
        ListadoReservas listreserva;
        try {
            listreserva = new ListadoReservas();
            listreserva.setBounds(400, 200, 700, 400);
            listreserva.setVisible(true);
             this.dispose();
        } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mitem_ListReservaEmpresaActionPerformed

    private void mitem_IngresoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_IngresoReservaActionPerformed
        IngresoReservas newreserva;
        try {
            newreserva = new IngresoReservas();
            newreserva.setBounds(400, 200, 700, 400);
            newreserva.setVisible(true);
             this.dispose();
        } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mitem_IngresoReservaActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JLuser;
    private javax.swing.JMenuItem JMRegistroComidorFull;
    private javax.swing.JMenuItem JMempCreadas;
    private javax.swing.JMenuItem JMhabCreadas;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem listReservas;
    private javax.swing.JMenu menu_Reserva;
    private javax.swing.JMenuItem mitem_IngresoReserva;
    private javax.swing.JMenuItem mitem_ListReservaEmpresa;
    private javax.swing.JMenuItem regCliente;
    private javax.swing.JMenuItem regHuesped;
    private javax.swing.JMenuItem regNvaHabitacion;
    private javax.swing.JMenuItem regOrdenPedido;
    private javax.swing.JMenuItem regProducto;
    private javax.swing.JMenuItem regProveedor;
    private javax.swing.JMenuItem regRecepcion;
    // End of variables declaration//GEN-END:variables
}
