
package Principal;

import Ventana.VtnAdministrador;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControladorTrabajador {
  String adminUser ="5";
  String adminContra ="5";
   static ArrayList<Trabajador> listTrabajadores;
private static final String ARCHIVO_REGISTRO = "datosTrabajadores.txt";
private static final String ARCHIVO_REGISTRo_ASISTENCIA = "asitenciaTrabajadores.txt";
//private static final String ARCHIVO_ASISTENCIA = "AsistenciaTrabajadores.txt";
    public ControladorTrabajador() {
    }
    public void crearArraylist(){
    listTrabajadores = new ArrayList<>();
    }
 public void agregarTrabajador(Trabajador t1){
 listTrabajadores.add(t1);      
 }
 public String imprimir(){
 String info = "";
 for(int i = 0; i <listTrabajadores.size();i++){
 info+= listTrabajadores.get(i).toString();
 }
 return info;
 }
 
 public Trabajador buscarTrabajador(int dni){
 for(int i = 0; i < listTrabajadores.size();i++){
 Trabajador tra = listTrabajadores.get(i);
 if(tra.getDni() == dni){
 return tra;
 }
 }
return null;
 }
 public int tamaño(){
int t = 0;
t = listTrabajadores.size();
return t;
 }
 public boolean inicioSesion(String usuario, String contraseña){
 for(int i = 0; i <listTrabajadores.size();i++){
 Trabajador tra = listTrabajadores.get(i);
 if(tra.getUser().equals(usuario) && tra.getContra().equals(contraseña)){
 return true;
 }
 }
 return false;
 }

    public ArrayList<Trabajador> getListTrabajadores() {
        return listTrabajadores;
    }

    public void setListTrabajadores(ArrayList<Trabajador> listTrabajadores) {
        this.listTrabajadores = listTrabajadores;
    }

   public boolean dniIguales(int dni) {
        for (int i = 0; i < listTrabajadores.size(); i++) {
            Trabajador tra = listTrabajadores.get(i);
            if (tra.getDni() == dni) {
                return true;
            }
        }
        return false;
 }
   public boolean usuarioIguales(String usuario) {
        for (int i = 0; i < listTrabajadores.size(); i++) {
            Trabajador tra = listTrabajadores.get(i);
            if (tra.getUser().equals(usuario)) {
                return true;
            }
        }
        return false;
 }

// public Trabajador eliminarTrabajador(int dni){
// for(int i = 0; i < listTrabajadores.size();i++){
// Trabajador traba = listTrabajadores.get(i);
// if(traba.getDni() == dni){
// listTrabajadores.remove(i);
// }
// }
//        return null;
// }
   public Trabajador eliminarTrabajador(int dni) {
    Trabajador trabajadorEliminado = null;
    for (int i = 0; i < listTrabajadores.size(); i++) {
        Trabajador traba = listTrabajadores.get(i);
        if (traba.getDni() == dni) {
            trabajadorEliminado = listTrabajadores.remove(i);
            break;
        }
    }
    guardarDatosEnArchivo(ARCHIVO_REGISTRO);
    return trabajadorEliminado;
}
 public int obtentenerDni(){
 for(int i = 0; i < listTrabajadores.size();i++){
 Trabajador tra = listTrabajadores.get(i);
 if(tra!= null){
 return tra.dni;
 }
 }
      return 0;
 }
 
 public boolean inicioSesionAdmin(String user, String c){
 Administrador ad = new Administrador(adminUser, adminContra);
if(ad !=null && ad.getUserAdmin().equals(user) && ad.getUserContra().equals(c)){
return true;
}
return false;
 }
 
 public void guardarDatosEnArchivo(String nombreArchivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        for (Trabajador trabajador : listTrabajadores) {
            writer.write(trabajador.toString());
            writer.newLine();
        }
    } catch (IOException e) {

    }
}
    public boolean inicioSesionRegistrado(String usuario, String contraseña) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_REGISTRO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(" - "); // 
                String usuarioRegistrado = campos[0];
                String contraseñaRegistrada = campos[1];

                if (usuario.equals(usuarioRegistrado) && contraseña.equals(contraseñaRegistrada)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; 
    }

    public int obtenerCantidadAsistencias(int dni) {
        Trabajador trabajador = buscarTrabajador(dni);
        if (trabajador != null) {
            return trabajador.obtenerCantidadAsistencias();
        }
        return 0;
    }

    public int obtenerCantidadInasistencias(int dni) {
        Trabajador trabajador = buscarTrabajador(dni);
        if (trabajador != null) {
            return trabajador.obtenerCantidadInasistencias();
        }
        return 0;
    }
    
        public void marcarAsistencia(int dni) {
        Trabajador trabajador = buscarTrabajador(dni);
        if (trabajador != null) {
            String fechaActual = trabajador.obtenerFechaActual();
            if (trabajador.getAsistencias().contains(fechaActual)) {
                JOptionPane.showMessageDialog(null, "No puedes marcar más de una vez tu asistencia");
            } else {
                trabajador.getAsistencias().add(fechaActual);
                guardarDatosEnArchivo(ARCHIVO_REGISTRO);
                JOptionPane.showMessageDialog(null, "Asistencia marcada correctamente");
            }
        } 
    }
        
        
      
}

