public class TablaMultiplicar {

    import java.util.Scanner;

    public class TablaMultiplicar {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("¿De qué número quieres ver la tabla? ");
            int numero = teclado.nextInt();

            System.out.println("\n=== Tabla del " + numero + " ===");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            teclado.close();
        }
    }
}
