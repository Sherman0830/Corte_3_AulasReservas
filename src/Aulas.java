public class Aulas {

    String torre;
    int salon;
    String tipo;
    boolean disponibilidad;
    Estudiante estudiante = new Estudiante();


    public Aulas(String torre, int salon, String tipo, boolean disponibilidad) {
        this.torre = torre;
        this.salon = salon;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    public Aulas() {

    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void reservarAulasE(String torre, int salon, int cedula){
        if (estudiante.registroE.containsKey(cedula)) {
            if (this.torre != null  this.torre.equals(torre) && this.salon == salon) {
                if(disponibilidad) {
                    this.disponibilidad = false;
                    System.out.println("Aula " + torre + " " + salon + " reservada exitosamente");
                }
            else{
                    System.out.println("Aula " + torre + " " + salon + " no se encuentra disponible");
                }
            } else {
                System.out.println("La información del aula es incorrecta.");
            }
        } else {
            System.out.println("El estudiante con cédula " + cedula + " no se encuentra registrado, debe tener un usuario para reservar el aula.");
        }
    }



    public String toString(){
        return "Torre: " + torre +
                "\nSalon: " + salon +
                "\nTipo: " + tipo +
                "\nDisponibilidad: " + disponibilidad +
                "\n----------------------------------\n";
    }

}
