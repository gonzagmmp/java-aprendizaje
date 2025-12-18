import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    private static final int RANGO = 100;



    private static int numeroAleatorio(){

        return rd.nextInt(1, RANGO + 1);

    }

   private static int leerNumero(){
        int numeroSeleccionado = 0;
        boolean esValido= false;

        while (!esValido){
            try {
                numeroSeleccionado=Integer.parseInt(sc.nextLine());
                esValido = true;
            } catch (NumberFormatException e){
                System.err.println("Error, debes introducir un número:");
            }
        }
        return numeroSeleccionado;

    }

    private static void iniciarJuego(){
        System.out.println("----TE RETO A ADIVINAR UN NÚMERO----\nIntroduce un número entre 1 y " + RANGO + ":");
        int numeroSecreto = numeroAleatorio();  // Guardas el número UNA VEZ
        int numeroUsuario;

        int intentos = 0;
        do {
            numeroUsuario = leerNumero();
            intentos++;

            if (numeroUsuario < 1 || numeroUsuario > RANGO) {
                System.err.println("El número tiene que estar entre 1 y " + RANGO + ", ambos incluidos:");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número que buscas es más alto, sigue intentándolo:");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número que buscas es más bajo, sigue intentándolo:");
            }


        } while (numeroUsuario != numeroSecreto);

        System.out.println("🎉 ¡Enhorabuena! El número era " + numeroSecreto +
                ". Lo lograste en " + intentos + " intentos.");

    }


    public static void main(String[] args) {

      iniciarJuego();
      sc.close();

    }
}
