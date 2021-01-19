import java.util.Scanner;

public class MiniCluedo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String opcion;
        String[] armas = new String[5];
        String[] habitaciones = new String[6];
        String[] personajes = new String[8];
        String[] combinacionSecreta = new String[3];
        boolean acierto = false;
        boolean acierto1 = false;
        boolean acierto2 = false;

        armas[0] = "Pistola";
        armas[1] = "Cuchillo";
        armas[2] = "Candelabro";
        armas[3] = "Herramienta";
        armas[4] = "Cuerda";

        habitaciones[0] = "Salon";
        habitaciones[1] = "Vestibulo";
        habitaciones[2] = "Cocina";
        habitaciones[3] = "Dormitorio";
        habitaciones[4] = "Hall";
        habitaciones[5] = "Aseo";

        personajes[0] = "Mayordomo";
        personajes[1] = "Criada";
        personajes[2] = "Profesor";
        personajes[3] = "Ama De LLaves";
        personajes[4] = "Cientifico Loco";
        personajes[5] = "Reverendo";
        personajes[6] = "Enfermera";
        personajes[7] = "Jardinero";

        combinacionSecreta[0] = armas[(int) (Math.random() * 5)];
        combinacionSecreta[1] = habitaciones[(int) (Math.random() * 6)];
        combinacionSecreta[2] = personajes[(int) (Math.random() * 8)];

        for (int i = 0; i < armas.length; i++) {
            System.out.println("Adivina el arma que usó el asesino: " + armas[i]);
        }
        System.out.println("elige tu opcion");
        // opcion = entrada.nextLine();

        while (acierto == false) {
            opcion = entrada.nextLine();
            if (opcion.equals(combinacionSecreta[0])) {
                acierto = true;
                System.out.println("has acertado el arma");
            } else {
                System.out.println("vuelve a intentarlo");
            }
        }

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("Adivina la habitacion donde se cometio el asesinato: " + habitaciones[i]);
        }
        System.out.println("elige tu opcion");

        while (acierto1 == false) {
            opcion = entrada.nextLine();
            if (opcion.equals(combinacionSecreta[1])) {
                acierto1 = true;
                System.out.println("has acertado la habitacion");
            } else {
                System.out.println("vuelve a intentarlo");
            }
        }

        for (int i = 0; i < personajes.length; i++) {
            System.out.println("Adivina quien es el asesino: " + personajes[i]);
        }
        System.out.println("elige tu opcion");

        while (acierto2 == false) {
            opcion = entrada.nextLine();
            if (opcion.equals(combinacionSecreta[2])) {
                acierto2 = true;
                System.out.println("has acertado al asesino");
                System.out.println("ENHORABUENA HAS RESUELTO EL CRIMEN");
            } else {
                System.out.println("vuelve a intentarlo");
            }
        }

    }
}
