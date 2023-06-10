package Principal;

import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Trabajador {
    protected String nombre;
    protected int dni;
    protected int numeroTe;
    protected String puestoT;
    protected String user;
    protected String contra;
    protected String estadoCivil;
    private ArrayList<String> asistencias;
        private ArrayList<String> ausencias;
    //private List<String> ausencias;
    public Trabajador(String nombre, int dni, int numeroTe, String puestoT, String user, String contra, String estadoCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroTe = numeroTe;
        this.puestoT = puestoT;
        this.user = user;
        this.contra = contra;
        this.estadoCivil = estadoCivil;
        asistencias = new ArrayList<>();
        ausencias = new ArrayList<>();
    }

        public void marcarAsistencia() {
        String fechaActual = obtenerFechaActual(); // Obtener la fecha actual en el formato deseado
        asistencias.add(fechaActual);
    }
        public String obtenerFechaActual(){
          LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatter);
        }
    
    
    public Trabajador(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumeroTe() {
        return numeroTe;
    }

    public void setNumeroTe(int numeroTe) {
        this.numeroTe = numeroTe;
    }

    public String getPuestoT() {
        return puestoT;
    }

    public void setPuestoT(String puestoT) {
        this.puestoT = puestoT;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public int obtenerCantidadAsistencias() {
        return asistencias.size();
    }

    public int obtenerCantidadInasistencias() {
        int totalDiasLaborables = 30; // Debes establecer el valor correcto del total de días laborables
        int asistencia = asistencias.size();
        int inasistencias = totalDiasLaborables - asistencia;
        return inasistencias;
    }
    
    public ArrayList<String> getAsistencias() {
        return asistencias;
    }

    public ArrayList<String> getAusencias() {
        return ausencias;
    }
    
    
    @Override
    public String toString() {
        return   user + " - " + contra+ " - "  + numeroTe+ " - " + puestoT + " - " + nombre + " - "  + dni + " - " + getAsistencias() + " - " + getAusencias();
    }


}
