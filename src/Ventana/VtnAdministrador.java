//Stephany ps
package Ventana;

import Principal.ControladorTrabajador;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VtnAdministrador extends javax.swing.JFrame {
    ControladorTrabajador controlador;

    public VtnAdministrador(ControladorTrabajador controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        //controlador.obtentenerDni();
        lbNombre.setText(controlador.obtentenerNombre());
        lbDni.setText(String.valueOf(controlador.obtentenerDni()));
        lbPuesto.setText(controlador.obtentenerPuesto());
        botonTransparente();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 70, 20));

        btnEliminarTrabajador.setText("Eliminar");
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 70, 40));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 70, 40));

        jButton2.setText("Ver");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 70, 40));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 70, 40));

        jLabel2.setText("Dni");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 20));

        jLabel3.setText("Puesto de trabajo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabajador (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 90));
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 50));
        getContentPane().add(lbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 90, 50));
        getContentPane().add(lbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
        controlador.eliminarTrabajador(controlador.obtentenerDni());
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre a editar:");
        String nuevoN = sc.nextLine();
        controlador.editarNombreTrabajador(controlador.obtentenerDni(), nuevoN);
    }//GEN-LAST:event_btnEditarActionPerformed


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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuesto;
    // End of variables declaration//GEN-END:variables
}
