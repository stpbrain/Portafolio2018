/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reserva;

import bll.EmpresaBLL;
import bll.ReservaBLL;
import dal.EmpresaComboDAL;
import java.sql.ResultSet;
import gui.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Carlos Poblete (a.k.a Kyosuke Kasuga)
 */
public class IngresoReservas extends javax.swing.JFrame {

    /**
     * Creates new form IngresoReservas
     */
    public IngresoReservas() throws SQLException {
        initComponents();
        EmpresaBLL emp = new EmpresaBLL();
        
        for (EmpresaComboDAL empcombo : emp.EmpresasConId()) {
            this.cmb_Empresa.addItem(empcombo);
        }
        
        this.LimpiarControles();
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
        lbl_NumReserva = new javax.swing.JLabel();
        lbl_Empresa = new javax.swing.JLabel();
        lbl_FechaCheckIn = new javax.swing.JLabel();
        lbl_FechaCheckOut = new javax.swing.JLabel();
        lbl_CantHuespedes = new javax.swing.JLabel();
        txt_NumReserva = new javax.swing.JTextField();
        cmb_Empresa = new javax.swing.JComboBox();
        date_FechaCheckIn = new javax.swing.JFormattedTextField();
        date_FechaCheckOut = new javax.swing.JFormattedTextField();
        txt_CantHuespedes = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Ingreso Nueva Reserva");

        lbl_NumReserva.setText("N° Reserva");

        lbl_Empresa.setText("Empresa");

        lbl_FechaCheckIn.setText("Fecha Check-In");

        lbl_FechaCheckOut.setText("Fecha Check-Out");

        lbl_CantHuespedes.setText("Cant. de Huespedes");

        txt_NumReserva.setEditable(false);
        txt_NumReserva.setEnabled(false);

        date_FechaCheckIn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        btn_Guardar.setText("Guardar Reserva");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Volver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_FechaCheckOut)
                                .addGap(18, 18, 18)
                                .addComponent(date_FechaCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_CantHuespedes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CantHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_NumReserva)
                                    .addComponent(lbl_Empresa)
                                    .addComponent(lbl_FechaCheckIn))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(date_FechaCheckIn)
                                        .addGap(115, 115, 115))
                                    .addComponent(txt_NumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btn_Guardar)
                        .addGap(63, 63, 63)
                        .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NumReserva)
                    .addComponent(txt_NumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Empresa)
                    .addComponent(cmb_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaCheckIn)
                    .addComponent(date_FechaCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FechaCheckOut)
                    .addComponent(date_FechaCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CantHuespedes)
                    .addComponent(txt_CantHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Volver))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        try {
            EmpresaComboDAL emp = (EmpresaComboDAL)this.cmb_Empresa.getSelectedItem();
            ReservaBLL reserva = new ReservaBLL();
            int id_empresa = 0;
            String fechacheckin = "";
            String fechacheckout = "";
            int canthuespedes = 0;
            
            id_empresa = emp.getId_empresa();
            fechacheckin = this.date_FechaCheckIn.getText();
            fechacheckout = this.date_FechaCheckOut.getText();
            canthuespedes = Integer.parseInt(this.txt_CantHuespedes.getText());
            
            if (reserva.GuardarReserva(id_empresa, fechacheckin, fechacheckout, canthuespedes)) {
                JOptionPane.showMessageDialog(this, "Reserva almacenada exitosamente!!");
                this.LimpiarControles();
            } else {
                JOptionPane.showMessageDialog(this, "Error al almacenar reserva en sistema");
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngresoReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void LimpiarControles() throws SQLException {
        ReservaBLL reserva = new ReservaBLL();
        Date fecha = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        txt_NumReserva.setText(String.valueOf(reserva.UltimoIdReserva() + 1));
        date_FechaCheckIn.setText(df.format(fecha));
        date_FechaCheckOut.setText(df.format(fecha));
        txt_CantHuespedes.setText("0");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox cmb_Empresa;
    private javax.swing.JFormattedTextField date_FechaCheckIn;
    private javax.swing.JFormattedTextField date_FechaCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_CantHuespedes;
    private javax.swing.JLabel lbl_Empresa;
    private javax.swing.JLabel lbl_FechaCheckIn;
    private javax.swing.JLabel lbl_FechaCheckOut;
    private javax.swing.JLabel lbl_NumReserva;
    private javax.swing.JTextField txt_CantHuespedes;
    private javax.swing.JTextField txt_NumReserva;
    // End of variables declaration//GEN-END:variables
}
