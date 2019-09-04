
import java.util.Date;

public class Usuarios {

    private int id;
    private String nombre;
    private int telefono;
    private String genero;
    private Date fechaNacimiento;
    private String correoP;
    private String correoI;

    public Usuarios(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoP() {
        return correoP;
    }

    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }

    public String getCorreoI() {
        return correoI;
    }

    public void setCorreoI(String correoI) {
        this.correoI = correoI;
    }
    
}
