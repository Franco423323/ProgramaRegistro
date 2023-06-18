//Stephany ps
package Ventana;

import Principal.ControladorTrabajador;
import javax.swing.JOptionPane;

public class VtnAdministrador extends javax.swing.JFrame {
    ControladorTrabajador controlador;

    public VtnAdministrador(ControladorTrabajador controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        botonTransparente();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDni = new javax.swing.JLabel();
        lbPuesto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 70, 20));

        btnEliminarTrabajador.setText("Eliminar");
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 70, 40));

        jButton1.setText("Editar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 70, 40));

        jButton2.setText("Ver");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 70, 40));

        jButton3.setText("Pagos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 60, 40));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, 40));

        jLabel2.setText("Dni");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 40, 20));

        jLabel3.setText("Puesto de trabajo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabajador (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 90));

        lbNombre.setText("Franco Aldair");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 90, 50));

        lbDni.setText("43138294");
        getContentPane().add(lbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 90, 50));

        lbPuesto.setText("Cajero");
        getContentPane().add(lbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
        controlador.eliminarTrabajador(2);
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new VtnAdministrador().setVisible(true);
            }
        });
    }
    public void botonTransparente() {
//        btnIniciarSesion.setOpaque(false);
//        btnIniciarSesion.setContentAreaFilled(false);
//        btnIniciarSesion.setBorderPainted(false);
              btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuesto;
    // End of variables declaration//GEN-END:variables
}
