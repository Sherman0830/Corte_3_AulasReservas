public class Aulas {

    String torre;
    int salon;
    String tipo;
    boolean disponibilidad;

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

    public String toString(){
        return "Torre: " + torre +
                "\nSalon: " + salon +
                "\nTipo: " + tipo +
                "\nDisponibilidad: " + disponibilidad +
                "\n----------------------------------\n";
    }

}
