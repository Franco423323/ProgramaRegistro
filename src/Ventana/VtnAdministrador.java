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
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 240, 50));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


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
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
