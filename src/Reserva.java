public class Reserva {
    private UsuarioM usuarioM;
    private Aulas aula;
    private boolean estado;

    public Reserva(UsuarioM usuarioM, Aulas aula) {
        this.usuarioM = usuarioM;
        this.aula = aula;
        this.estado = true; // Inicialmente la reserva está pendiente
    }

    public void realizarReserva() {
        if (aula.getDisponibilidad()) {
            aula.setDisponibilidad(false);
            System.out.println("Reserva realizada exitosamente.");
        } else {
            System.out.println("Lo sentimos, el aula no está disponible.");
        }
    }

    public void entregarAula() {
        aula.setDisponibilidad(true);
        estado = false;
        System.out.println("Aula entregada correctamente.");
    }
}