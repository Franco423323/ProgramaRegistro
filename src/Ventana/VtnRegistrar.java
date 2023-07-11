package Ventana;

import Principal.ControladorTrabajador;
import Principal.Trabajador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VtnRegistrar extends javax.swing.JFrame {
    ControladorTrabajador controladorTrabajador;

    public VtnRegistrar() {

        initComponents();
        this.setLocationRelativeTo(null);
        controladorTrabajador = new ControladorTrabajador();
        controladorTrabajador.crearArraylist();
        botonTransparente();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cbPuesto = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 110, 30));

        txtNumero.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, 40));

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 40));

        txtDni.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 137, 180, -1));

        cbPuesto.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        cbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Cajero", "Atención al Cliente" }));
        getContentPane().add(cbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, -1));

        txtUser.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 180, 40));

        txtContra.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, 40));

        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, 30));

        cboEstado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Casado(a)", "Viudo(a)", "Divorciado(a)" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 180, 40));

        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 120, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registoOfff.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        int dni = Integer.parseInt(txtDni.getText());
        int numeroT = Integer.parseInt(txtNumero.getText());
        String user = txtUser.getText();
        String contra = txtContra.getText();
        String puesto = cbPuesto.getSelectedItem().toString();
        String estadoC = cboEstado.getSelectedItem().toString();
        if(nombre.isEmpty() || txtDni.getText().length() == 0|| user.isEmpty() || contra.isEmpty() || txtNumero.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
        else if (controladorTrabajador.dniIguales(dni)) {
            JOptionPane.showMessageDialog(null, "Ya hay una persona registrada con ese dni");
        }
        else if(controladorTrabajador.usuarioIguales(user)){
         JOptionPane.showMessageDialog(null, "Ya hay una persona registrada con ese usuario");
        }

        else {
            Trabajador t1 = new Trabajador(nombre, dni, numeroT, puesto, user, contra, estadoC);
            controladorTrabajador.agregarTrabajador(t1);
            JOptionPane.showMessageDialog(null, "Agregado");
            txtNombre.setText("");
            txtNumero.setText("");
            txtDni.setText("");
            txtContra.setText("");
            txtUser.setText("");
            controladorTrabajador.guardarDatosEnArchivo("datosTrabajadores.txt");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        VtnIniciarSesion ven = new VtnIniciarSesion(controladorTrabajador);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char v = evt.getKeyChar();
        if (Character.isLetter(v)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo ingrese numeros");

        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char v = evt.getKeyChar();
        if (Character.isLetter(v)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No dni ni puede tener letras");

        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char v = evt.getKeyChar();
        if (Character.isDigit(v)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Tu nombre no puede tener numeros");

        }
    }//GEN-LAST:event_txtNombreKeyTyped

        public void botonTransparente() {
        btnRegistrar.setOpaque(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setBorderPainted(false);
               btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

//       }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new VtnRegistrar().setVisible(true);
            }
        });
    }
//    public void botonTransparente() {
//        btnRegistrar.setOpaque(false);
//        btnRegistrar.setContentAreaFilled(false);
//        btnRegistrar.setBorderPainted(false);
//        btnIniciarSesion.setOpaque(false);
//        btnIniciarSesion.setContentAreaFilled(false);
//        btnIniciarSesion.setBorderPainted(false);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
