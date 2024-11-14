import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();


        Aulas aulas = new Aulas();
        Aulas aula1 = new Aulas("A", 203, "Multimedia", true);
        Aulas aula2 = new Aulas("A", 304, "Multimedia", true);
        Aulas aula3 = new Aulas("A", 501, "Radio", true);
        Aulas aula4 = new Aulas("B", 202, "Sistemas", true);
        Aulas aula5 = new Aulas("B", 205, "Sistemas", true);
        Aulas aula6 = new Aulas("B", 402, "Laboratorio", true);

        List<Aulas> lstaulas = new ArrayList<>();
        lstaulas.add(aula1);
        lstaulas.add(aula2);
        lstaulas.add(aula3);
        lstaulas.add(aula4);
        lstaulas.add(aula5);
        lstaulas.add(aula6);

        String nombreE, apellidoE, correoE, nombreP, apellidoP, correoP;
        int opc, cedulaE, IDE, cedulaP, IDP;
        String torreER;
        int cedulaER, salonER;


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
                    System.out.println(lstaulas.toString());
                    break;

                case 4:
                    System.out.println("\nReserva de Aula\n");
                    System.out.println("Ingrese su cedula");
                    cedulaER = teclado.nextInt();
                    System.out.println("Ingrese torre del aula");
                    torreER = teclado.next();
                    System.out.println("Ingrese salon del aula");
                    salonER = teclado.nextInt();
                    aulas.reservarAulasE(torreER, salonER, cedulaER);
                    break;

                case 5:

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