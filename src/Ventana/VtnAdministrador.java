//Stephany ps
package Ventana;

import Principal.ControladorTrabajador;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
public class VtnAdministrador extends javax.swing.JFrame {
    ControladorTrabajador controlador;
String rutaExcel = "C:\\Users\\anrlv\\OneDrive\\Documentos\\GitHub\\ProgramaRegistro\\HistorialAsistencia.xls";

Desktop desktop = Desktop.getDesktop();

    public VtnAdministrador(ControladorTrabajador controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        //controlador.obtentenerDni();
        botonTransparente();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        lbDni = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbTelef = new javax.swing.JLabel();
        lbPuestp = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 70, 60));

        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 70, 70));

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 70, 70));

        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 70, 70));

        lbDni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDni.setText("7777777");
        getContentPane().add(lbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, 40));

        lbNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombre.setText("Luis");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, 20));

        lbTelef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelef.setText("975941009");
        getContentPane().add(lbTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        lbPuestp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPuestp.setText("Supervisor");
        getContentPane().add(lbPuestp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminVer.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del trabajador a eliminar"));
controlador.eliminarTrabajador(dni);
if(dni!=0){
    lbDni.setText("");
    lbNombre.setText("");
    lbPuestp.setText("");
    lbTelef.setText("");
JOptionPane.showMessageDialog(null, "Eliminado correctamente");
}
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dni de la persona a editar"));
String name = JOptionPane.showInputDialog("Ingrese nombre nuevo");
controlador.editarNombreTrabajador(dni, name);
JOptionPane.showMessageDialog(null, "Nombre cambiado perfectamente");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        abrirExcel(rutaExcel);
    }//GEN-LAST:event_btnVerActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new VtnAdministrador().setVisible(true);
            }
        });
    }
        public int obtenerDni(int dni) {
        return controlador.obtentenerDni();
    }
    public void botonTransparente() {
              btnEditar.setOpaque(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setBorderPainted(false);
              btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
                      btnEliminarTrabajador.setOpaque(false);
        btnEliminarTrabajador.setContentAreaFilled(false);
        btnEliminarTrabajador.setBorderPainted(false);
                      btnVer.setOpaque(false);
        btnVer.setContentAreaFilled(false);
        btnVer.setBorderPainted(false);
    }
    
        public static void abrirExcel(String rutaArchivo) {
        // Crear instancia de Desktop
        Desktop desktop = Desktop.getDesktop();
        
        // Verificar si Desktop es soportado y el archivo existe
        if (Desktop.isDesktopSupported() && new File(rutaArchivo).exists()) {
            try {
                // Abrir el archivo Excel
                desktop.open(new File(rutaArchivo));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuestp;
    private javax.swing.JLabel lbTelef;
    // End of variables declaration//GEN-END:variables
}
