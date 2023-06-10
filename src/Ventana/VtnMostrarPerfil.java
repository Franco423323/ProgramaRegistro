
package Ventana;

import Principal.ControladorTrabajador;
import Principal.Trabajador;

public class VtnMostrarPerfil extends javax.swing.JFrame {

ControladorTrabajador controlador;
    public VtnMostrarPerfil(ControladorTrabajador controlador) {
        initComponents();
        this.controlador = controlador;
        this.setLocationRelativeTo(null);
      
  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMsj = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        btnAsistencias = new javax.swing.JButton();
        btnInasistencias = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbMsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 29, 147, 26));

        btnAsistencia.setText("Asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 90, 40));

        btnAsistencias.setText("Ver asistencias");
        btnAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnInasistencias.setText("Ver inasistencias");
        btnInasistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInasistenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnInasistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PerfilTrabajador.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 543, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
   //controlador
        controlador.marcarAsistencia(obtenerMiDni());
       // btnAsistencia.setVisible(false);
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnInasistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInasistenciasActionPerformed
        System.out.println("Numero de inasistencias: " + controlador.obtenerCantidadInasistencias(obtenerMiDni()) );
        
        //controlador.obtenerCantidadInasistencias(obtenerMiDni());
    }//GEN-LAST:event_btnInasistenciasActionPerformed

    private void btnAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasActionPerformed
   //controlador.obtenerCantidadAsistencias(obtenerMiDni());
   System.out.println("Numero de asistencias: " + controlador.obtenerCantidadAsistencias(obtenerMiDni()) );
    }//GEN-LAST:event_btnAsistenciasActionPerformed
 public int obtenerMiDni(){
 return controlador.obtentenerDni();
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
    private javax.swing.JButton btnAsistencias;
    private javax.swing.JButton btnInasistencias;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbMsj;
    // End of variables declaration//GEN-END:variables
}
