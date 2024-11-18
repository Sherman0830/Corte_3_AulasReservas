public class Reserva {
    private int cedulaUsuario;
    private Aulas aula;

    public Reserva(int cedulaUsuario, Aulas aula) {
        this.cedulaUsuario = cedulaUsuario;
        this.aula = aula;
        aula.setDisponibilidad(false);  // Al crear la reserva, el aula deja de estar disponible
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public Aulas getAula() {
        return aula;
    }

    @Override
    public String toString() {
        return "Reserva - Usuario: " + cedulaUsuario +
                "\nAula: Torre " + aula.getTorre() +
                ", Salon " + aula.getSalon();
    }
}