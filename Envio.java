import java.util.ArrayList;
import java.util.List;

public class Envio {
    // 1. Atributos
    private String codigoEnvio;
    private String destino;
    private List<Paquete> paquetes;
    private double costoBase;

    // 2. Constructores
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.paquetes = new ArrayList<>();
        this.costoBase = 1500.0; 
    }

    public Envio(String codigoEnvio, String destino, double costoBase) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.paquetes = new ArrayList<>();
        this.costoBase = costoBase;
    }

    // 3. Métodos
    public void agregarPaquete(Paquete paquete) {
        if (this.paquetes.size() < 3) {
            this.paquetes.add(paquete);
            System.out.println("Paquete " + paquete.getId() + " agregado al envío.");
        } else {
            System.out.println("Error: El envío no puede superar el máximo de 3 paquetes.");
        }
    }

    public void iniciarRecorrido() {
        System.out.println("El envío " + codigoEnvio + " inició su recorrido.");
        for (Paquete paquete : paquetes) {
            paquete.enviarADistribucion(); 
        }
    }

    public void finalizarEnvio() {
        System.out.println("El envío " + codigoEnvio + " ha sido entregado.");
        for (Paquete paquete : paquetes) {
            paquete.marcarComoEntregado();
        }
    }

    private double calcularPesoTotal() {
        double pesoTotal = 0;
        for (Paquete paquete : paquetes) {
            pesoTotal += paquete.getPeso();
        }
        return pesoTotal;
    }

    public double calcularCostoFinal() {
        double costoFinal = this.costoBase;
        if (calcularPesoTotal() > 5.0) {
            costoFinal += 1000.0;
        }
        return costoFinal;
    }

    // 4. Getters
    public String getCodigoEnvio() { return codigoEnvio; }
    public String getDestino() { return destino; }
    public double getCostoBase() { return costoBase; }
    public List<Paquete> getPaquetes() { return paquetes; }
}