package Ventana;

import Principal.ControladorTrabajador;
import Principal.Trabajador;

public class VtnMostrarPerfil extends javax.swing.JFrame {
    ControladorTrabajador controlador;
    public VtnMostrarPerfil(ControladorTrabajador controlador) {
        initComponents();
        this.controlador = controlador;
        this.setLocationRelativeTo(null);
        btnTransparente();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMsj = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbMsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 29, 147, 26));

        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 30));

        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 30));
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoTraba.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
controlador.marcarAsistencia(obtenerMiDni());

    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed

    }//GEN-LAST:event_btnHistorialActionPerformed
    public int obtenerMiDni() {
        return controlador.obtentenerDni();
    }

    public void btnTransparente() {
        btnAsistencia.setOpaque(false);
        btnAsistencia.setContentAreaFilled(false);
        btnAsistencia.setBorderPainted(false);
        btnHistorial.setOpaque(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setBorderPainted(false);
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VtnMostrarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbMsj;
    // End of variables declaration//GEN-END:variables
}
