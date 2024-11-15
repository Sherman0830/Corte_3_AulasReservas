import java.util.HashMap;

public class Profesor extends UsuarioA implements UsuarioM {

    HashMap<Integer, Profesor> registroP = new HashMap<>();

    public Profesor(String nombre, String apellido, int ID, String correo, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void registroNuevo(String nombre, String apellido, int ID, String correo, int cedula) {
        Profesor nuevoProfesor = new Profesor(nombre, apellido, ID, correo, cedula);
        registroP.put(cedula, nuevoProfesor);
        System.out.println("Profesor registrado con éxito.");
    }

    @Override
    public void informacionReservas() {
        System.out.println("\nInformacion de profesores registrados:\n");
        for (Profesor profesor : registroP.values()) {
            System.out.println("Nombre: " + profesor.getNombre() +
                    "\nApellido: " + profesor.getApellido() +
                    "\nID: " + profesor.getID() +
                    "\nCorreo: " + profesor.getCorreo() +
                    "\nCedula: " + profesor.getCedula() +
                    "\n----------------------------------\n");
        }
    }


}
