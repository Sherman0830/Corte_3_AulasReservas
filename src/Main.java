import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        List<Aulas> aulas = new ArrayList<>();
        aulas.add(new Aulas("A", 203, "Multimedia", true));
        aulas.add(new Aulas("A", 304, "Multimedia", true));
        aulas.add(new Aulas("A", 501, "Radio", true));
        aulas.add(new Aulas("B", 202, "Sistemas", true));
        aulas.add(new Aulas("B", 205, "Sistemas", true));
        aulas.add(new Aulas("B", 402, "Laboratorio", true));

        List<Reserva> reservas = new ArrayList<>();

        String nombreE, apellidoE, correoE, nombreP, apellidoP, correoP;
        int opc, cedulaE, IDE, cedulaP, IDP;
        String torre;
        int cedula, salon;


        do {

            System.out.println("\nReserva de Aulas Unimunuto\n");
            System.out.println("Escoja una opcion");
            System.out.println("1. Registro de Estudiante");
            System.out.println("2. Registro de Profesor");
            System.out.println("3. Disponibilidad de Aulas");
            System.out.println("4. Reservar Aula");
            System.out.println("5. Entregar Aula");
            System.out.println("6. Mostrar Estudiantes registrados");
            System.out.println("7. Mostrar Profesores registrados");
            System.out.println("8. Salir");
            opc = teclado.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("\nRegistro de Estudiante\n");
                    System.out.println("Ingrese su nombre");
                    nombreE = teclado.next();
                    System.out.println("Ingrese su apellido");
                    apellidoE = teclado.next();
                    System.out.println("Ingrese su cedula");
                    cedulaE = teclado.nextInt();
                    System.out.println("Ingrese su correo ");
                    correoE = teclado.next();
                    System.out.println("Ingrese su ID");
                    IDE = teclado.nextInt();
                    estudiante.registroNuevo(nombreE, apellidoE, IDE, correoE, cedulaE);
                    break;


                case 2:
                    System.out.println("\nRegistro de Profesor\n");
                    System.out.println("Ingrese su nombre");
                    nombreP = teclado.next();
                    System.out.println("Ingrese su apellido");
                    apellidoP = teclado.next();
                    System.out.println("Ingrese su cedula");
                    cedulaP = teclado.nextInt();
                    System.out.println("Ingrese su correo ");
                    correoP = teclado.next();
                    System.out.println("Ingrese su ID");
                    IDP = teclado.nextInt();
                    profesor.registroNuevo(nombreP, apellidoP, IDP, correoP, cedulaP);
                    break;


                case 3:
                    for (Aulas aula : aulas) {
                        System.out.println(aula);
                    }
                    break;

                case 4:
                    System.out.println("\nReserva de Aula\n");
                    System.out.println("Ingrese su cedula");
                    cedula = teclado.nextInt();
                    System.out.println("Ingrese torre del aula");
                    torre = teclado.next();
                    System.out.println("Ingrese salon del aula");
                    salon = teclado.nextInt();

                    Aulas aulaReservar = null;
                    for (Aulas aula : aulas) {
                        if (aula.getTorre().equalsIgnoreCase(torre) && aula.getSalon() == salon) {
                            aulaReservar = aula;
                            break;
                        }
                    }

                    if (aulaReservar != null) {
                        if (aulaReservar.getDisponibilidad()) {
                            Reserva nuevaReserva = new Reserva(cedula, aulaReservar);
                            reservas.add(nuevaReserva);
                            aulaReservar.setDisponibilidad(false);
                            System.out.println("Reserva realizada con éxito.");
                        } else {
                            System.out.println("El aula no está disponible.");
                        }
                    } else {
                        System.out.println("Aula no encontrada.");
                    }

                    break;

                case 5:
                    System.out.println("\nEntrega de Aula\n");
                    System.out.print("Ingrese su cédula:");
                    cedula = teclado.nextInt();
                    System.out.print("Ingrese la torre del aula");
                    torre = teclado.next();
                    System.out.print("Ingrese el salón del aula");
                    salon = teclado.nextInt();

                    boolean reservaEncontrada = false;
                    for (Reserva reserva : reservas) {
                        if (reserva.getCedulaUsuario() == cedula &&
                                reserva.getAula().getTorre().equalsIgnoreCase(torre) &&
                                reserva.getAula().getSalon() == salon) {
                            reserva.getAula().setDisponibilidad(true);
                            reservas.remove(reserva);
                            System.out.println("Aula entregada con éxito.");
                            reservaEncontrada = true;
                            break;
                        }
                    }

                    if (!reservaEncontrada) {
                        System.out.println("No se encontró una reserva para este usuario y aula.");
                    }


                    break;

                case 6:
                    estudiante.informacionReservas();
                    break;


                case 7:
                    profesor.informacionReservas();
                    break;

                case 8:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
        while (opc != 8);

    }
}