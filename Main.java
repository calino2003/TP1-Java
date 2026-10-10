import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la colección para registrar los envíos de la jornada
        List<Envio> jornadaEnvios = new ArrayList<>();

        // 2. Creamos los paquetes (usando el constructor que definimos)[cite: 3]
        Paquete p1 = new Paquete("TRK-001", "Notebook", 2.5);
        Paquete p2 = new Paquete("TRK-002", "Auriculares", 0.5);
        Paquete p3 = new Paquete("TRK-003", "Monitor", 6.5); // Este pesa más de 5kg, tendrá recargo

       // 3. Creamos los envíos (usando Herencia)
        Envio envio1 = new Envio("ENV-100", "Buenos Aires"); // Envío Estándar normal
        EnvioExpress envio2 = new EnvioExpress("EXP-101", "Córdoba"); // Envío Express
        EnvioInternacional envio3 = new EnvioInternacional("INT-102", "Madrid"); // Envío Internacional

        // 4. Relacionamos los objetos
        System.out.println("--- Agregando paquetes ---");
        envio1.agregarPaquete(p1);
        envio2.agregarPaquete(p2);
        envio3.agregarPaquete(p3);

        // 5. Registramos los envíos
        jornadaEnvios.add(envio1);
        jornadaEnvios.add(envio2);
        jornadaEnvios.add(envio3);

        // Simulamos que un envío arranca su viaje (Mensajes entre objetos)
        System.out.println("\n--- Acciones ---");
        envio1.iniciarRecorrido(); 

        // 6. Recorremos la lista para mostrar el resumen de la jornada[cite: 5]
        System.out.println("\n--- Resumen de la Jornada ---");
        for (Envio envio : jornadaEnvios) {
            System.out.println("Envío: " + envio.getCodigoEnvio() + " | Destino: " + envio.getDestino());
            System.out.println("Paquetes transportados: " + envio.getPaquetes().size());
            System.out.println("Costo total a cobrar: $" + envio.calcularCostoFinal());
            System.out.println("-----------------------------------");
        }
    }
}