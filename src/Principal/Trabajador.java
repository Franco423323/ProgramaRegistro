package Principal;

public class Trabajador {
    protected String nombre;
    protected int dni;
    protected int numeroTe;
    protected String puestoT;
    protected String user;
    protected String contra;
    protected String estadoCivil;

    public Trabajador(String nombre, int dni, int numeroTe, String puestoT, String user, String contra, String estadoCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroTe = numeroTe;
        this.puestoT = puestoT;
        this.user = user;
        this.contra = contra;
        this.estadoCivil = estadoCivil;
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

    
    @Override
    public String toString() {
        return   user + " - " + contra+ " - "  + numeroTe+ " - " + puestoT + " - " + nombre + " - "  + dni;
    }


}
