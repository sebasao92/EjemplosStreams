import java.util.Objects;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int id;
    private double nota;

    public Estudiante(String nombre, String apellido, int id, double nota) { //inicializar
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() { //lectura
        return nombre;
    }

    public void setNombre(String nombre) { //escritura / actualización
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id:" + getId() + " Nombre:" + getNombre() + " Apellido:" + getApellido() + " Nota:" + getNota();
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, apellido, nombre);
    }

    @Override
    public boolean equals(Object object) {

        if(object == this)
            return true;

        if(!(object instanceof Estudiante)){
            return false;
        }

        Estudiante estudiante = (Estudiante) object;

        return estudiante.getId() == id &&
               Objects.equals(estudiante.getApellido(), apellido) &&
               Objects.equals(estudiante.getNombre(), nombre);
    }

}
