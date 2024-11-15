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

                    break;

                case 5:
                    System.out.print("Ingrese su cédula: ");
                    cedula = teclado.nextInt();
                    System.out.print("Ingrese la torre del aula: ");
                    torre = teclado.next();
                    System.out.print("Ingrese el salón del aula: ");
                    salon = teclado.nextInt();

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

/*public void reservarAulasE(String torre, int salon, int cedula){
    if (estudiante.registroE.containsKey(cedula)) {
        if (this.torre != null || this.torre.equals(torre) && this.salon == salon) {
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
}*/