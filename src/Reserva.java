public class Reserva{

    Estudiante reservante;
    Aulas aulaReserva;

    public Reserva(Estudiante reservante, Aulas aulaReserva) {
        this.reservante = reservante;
        this.aulaReserva = aulaReserva;
    }

    public Reserva() {
    }

    public Estudiante getReservante() {
        return reservante;
    }

    public void setReservante(Estudiante reservante) {
        this.reservante = reservante;
    }

    public Aulas getAulaReserva() {
        return aulaReserva;
    }

    public void setAulaReserva(Aulas aulaReserva) {
        this.aulaReserva = aulaReserva;
    }

    /*public void hacerReserva(Estudiante estudiante, Aulas aulaReserva){
    Aulas aulas = new Aulas();
    aulas.aula1.setDisponibilidad(false);
    }*/
}
