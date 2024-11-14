import java.util.HashMap;

public class Estudiante implements Usuario{

    static HashMap<Integer, Estudiante> registroE = new HashMap<>();

    String nombre;
    String apellido;
    int ID;
    String correo;
    int cedula;

    public Estudiante(String nombre, String apellido, int ID, String correo, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Estudiante() {
        Estudiante estudiante1 = new Estudiante("Andres", "Cardenas", 935186, "andres.cardenas-m@uniminuto.edu.co", 1003824769);
        registroE.put(cedula, estudiante1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public void registroNuevo(String nombre, String apellido, int ID, String correo, int cedula) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, ID, correo, cedula);
        registroE.put(cedula, nuevoEstudiante);
        System.out.println("Estudiante registrado con éxito.");
    }

    @Override
    public void informacionReservas() {
        System.out.println("\nInformacion de estudiantes registrados:\n");
        for (Estudiante estudiante : registroE.values()) {
            System.out.println("Nombre: " + estudiante.getNombre() +
                    "\nApellido: " + estudiante.getApellido() +
                    "\nID: " + estudiante.getID() +
                    "\nCorreo: " + estudiante.getCorreo() +
                    "\nCedula: " + estudiante.getCedula() +
                    "\n----------------------------------\n");
        }
    }



}
