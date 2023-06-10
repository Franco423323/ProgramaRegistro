
package Ventana;

import Principal.ControladorTrabajador;

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
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbMsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 29, 147, 26));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PerfilTrabajador.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 543, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VtnMostrarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbMsj;
    // End of variables declaration//GEN-END:variables
}
