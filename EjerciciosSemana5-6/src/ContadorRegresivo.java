public class ContadorRegresivo {
    public static void main(String[] args) {
        System.out.println("=== CUENTA REGRESIVA ===\n");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            // Pausa de 1 segundo entre números
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n¡DESPEGUE!");
    }
}
