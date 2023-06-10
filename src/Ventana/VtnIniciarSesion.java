package Ventana;
//https://www.youtube.com/watch?v=V-M8pEzUNsw

import Principal.ControladorTrabajador;
import Principal.Trabajador;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VtnIniciarSesion extends javax.swing.JFrame {

    ControladorTrabajador controlador;

    public VtnIniciarSesion(ControladorTrabajador controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        txtTransparente();
        botonTransparente();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtContra = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtContra.setForeground(new java.awt.Color(255, 255, 255));
        txtContra.setBorder(null);
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 280, 30));

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 280, 30));

        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 110, 40));

        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 394, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesion.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String user = txtUsuario.getText();
        String contra = txtContra.getText();
        if (controlador.inicioSesionRegistrado(user, contra)) {
            JOptionPane.showMessageDialog(null, "Correcto");
            VtnMostrarPerfil vt = new VtnMostrarPerfil(controlador);
            vt.setVisible(true);
            this.dispose();
        } else if (controlador.inicioSesionAdmin(user, contra)) {
             JOptionPane.showMessageDialog(null, "Correcto");
            VtnAdministrador b = new VtnAdministrador(controlador);
            b.setVisible(true);
            this.dispose();
        } //        else if(controlador.usuarioIgual()){
        //         JOptionPane.showMessageDialog(null, "Cambia de usuario, este usuario ya esta utilizado");
        //        }
        else {
            JOptionPane.showMessageDialog(null, "Algo esta mal");
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        VtnRegistrar ven = new VtnRegistrar();
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void txtTransparente(){
     txtUsuario.setOpaque(false);
     txtContra.setOpaque(false);
        Color transparente = new Color(txtUsuario.getBackground().getRed(), txtUsuario.getBackground().getGreen(), txtUsuario.getBackground().getBlue(), 0);
txtUsuario.setBackground(transparente);
txtContra.setBackground(transparente);
    }
    public void botonTransparente() {
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setBorderPainted(false);
              btnRegistrar.setOpaque(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VtnIniciarSesion().setVisible();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
